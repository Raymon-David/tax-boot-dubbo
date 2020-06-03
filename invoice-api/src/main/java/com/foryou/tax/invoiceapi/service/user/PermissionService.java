package com.foryou.tax.invoiceapi.service.user;

import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author: raymon
 * @date: 2017/10/30 13:10
 */
public interface PermissionService {

    static final Logger log =  LoggerFactory.getLogger(PermissionService.class);
    /**
     * 查询某用户的 角色  菜单列表   权限列表
     *
     * @param username
     * @return
     */
    JSONObject getUserPermission(String username);
}
