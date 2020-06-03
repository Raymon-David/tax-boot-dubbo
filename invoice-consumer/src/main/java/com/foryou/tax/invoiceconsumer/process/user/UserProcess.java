package com.foryou.tax.invoiceconsumer.process.user;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.fastjson.JSONObject;
import com.foryou.tax.invoiceapi.bean.SuccessBean;
import com.foryou.tax.invoiceapi.bean.success.SuccessDesc;
import com.foryou.tax.invoiceapi.bean.success.SuccessInfo;
import com.foryou.tax.invoiceapi.constant.Constants;
import com.foryou.tax.invoiceapi.service.redis.RedisService;
import com.foryou.tax.invoiceapi.service.user.LoginService;
import com.foryou.tax.invoiceapi.service.user.UserService;
import com.foryou.tax.invoiceapi.utils.StringUtils;
import com.foryou.tax.invoiceconsumer.process.common.BaseProcess;
import com.foryou.tax.invoiceconsumer.utils.MemberTools;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author ：Raymon
 * @date ：Created in 2020/3/12
 * @description:
 */
@Service
public class UserProcess extends BaseProcess {

    @Reference(version = "${dubbo.service.version}",
            application = "${dubbo.application.id}",
            url = "${dubbo.protocol.name}://${dubbo.protocol.host}:${dubbo.protocol.port}")
    private UserService userService;

    @Reference(version = "${dubbo.service.version}",
            application = "${dubbo.application.id}",
            url = "${dubbo.protocol.name}://${dubbo.protocol.host}:${dubbo.protocol.port}")
    private LoginService loginService;

    @Reference(version = "${dubbo.service.version}",
            application = "${dubbo.application.id}",
            url = "${dubbo.protocol.name}://${dubbo.protocol.host}:${dubbo.protocol.port}")
    private RedisService redisService;


    /**
     * 登录
     */
    public void authLogin(HttpServletRequest request, HttpServletResponse response, JSONObject requestJson){
        JSONObject jsonObject = loginService.authLogin(requestJson);
        writeClientJson(response, jsonObject, null);
    }

    /**
     * 查询当前登录用户的信息
     *
     */
    public void getInfo(HttpServletRequest request, HttpServletResponse response){
        JSONObject jsonObject = loginService.getInfo();
        writeClientJson(response, jsonObject, null);
    }


    /**
     * 登出
     *
     */
    public void logout(HttpServletRequest request, HttpServletResponse response){
        JSONObject jsonObject = loginService.logout();
        /**
         * redis退出
         */
        String key = MemberTools.getCookieValue(request, Constants.USERlOGIN_KEY_EXT);
        if(StringUtils.isNotBlank(key)){
            redisService.del(key);
            //清除cookie
            MemberTools.deleteCookie(request, response, Constants.USERlOGIN_KEY_EXT);
        }
        writeClientJson(response, jsonObject, null);
    }

    public void testJson(HttpServletRequest request, HttpServletResponse response) {
        response.setContentType("application/json;charset=UTF-8");
        response.setCharacterEncoding("UTF-8");

        SuccessBean successBean = new SuccessBean();
        SuccessInfo successInfo = new SuccessInfo();
        SuccessDesc successDesc = new SuccessDesc();

        successDesc.setCode("200");
        successDesc.setMessage("上传成功！");
        successInfo.setType("success");
        successInfo.setSuccessDesc(successDesc);
        successBean.setSuccess(successInfo);

        writeClientJson(response, successBean, null);
    }

    /**
     * 查询用户列表
     *
     * @param jsonObject
     * @return
     */
    public JSONObject listUser(JSONObject jsonObject) {
        return userService.listUser(jsonObject);
    }


    public JSONObject addUser(JSONObject jsonObject) {
        return userService.addUser(jsonObject);
    }

    public JSONObject updateUser(JSONObject jsonObject) {
        return userService.updateUser(jsonObject);
    }


    public JSONObject getAllRoles() {
        return userService.getAllRoles();
    }

    /**
     * 角色列表
     * @return
     */
    public JSONObject listRole() {
        return userService.listRole();
    }

    /**
     * 查询所有权限, 给角色分配权限时调用
     * @return
     */
    public JSONObject listAllPermission() {
        return userService.listAllPermission();
    }

    /**
     * 新增角色
     * @return
     */
    public JSONObject addRole(JSONObject jsonObject) {
        return userService.addRole(jsonObject);
    }

    /**
     * 修改角色
     * @return
     */
    public JSONObject updateRole(JSONObject jsonObject) {
        return userService.updateRole(jsonObject);
    }

    /**
     * 删除角色
     * @param jsonObject
     * @return
     */
    public JSONObject deleteRole(JSONObject jsonObject) {
        return userService.deleteRole(jsonObject);
    }

}
