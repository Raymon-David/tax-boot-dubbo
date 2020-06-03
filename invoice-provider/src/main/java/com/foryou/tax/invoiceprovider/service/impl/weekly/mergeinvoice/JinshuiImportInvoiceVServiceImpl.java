package com.foryou.tax.invoiceprovider.service.impl.weekly.mergeinvoice;

import cn.hutool.core.convert.Convert;
import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.foryou.tax.invoiceapi.pojo.weekly.mergeinvoice.JinshuiImportInvoiceV;
import com.foryou.tax.invoiceapi.service.redis.RedisService;
import com.foryou.tax.invoiceapi.service.weekly.mergeinvoice.JinshuiImportInvoiceVService;
import com.foryou.tax.invoiceapi.utils.LoggerUtils;
import com.foryou.tax.invoiceprovider.dao.weekly.mergeinvoice.JinshuiImportInvoiceVMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * VIEW 服务实现类
 * </p>
 *
 * @author raymon
 * @since 2020-05-11
 */
@Service(version = "${dubbo.service.version}",
        application = "${dubbo.application.id}",
        protocol = "${dubbo.protocol.id}",
        registry = "${dubbo.registry.id}"
)
public class JinshuiImportInvoiceVServiceImpl implements JinshuiImportInvoiceVService {

    @Autowired
    JinshuiImportInvoiceVMapper jinshuiImportInvoiceVMapper;

    @Autowired
    private RedisService redisService;

    @Override
    public List<JinshuiImportInvoiceV> queryJinshuiImportData() {
        LoggerUtils.debug(getClass(), "------ JinshuiImportInvoiceVServiceImpl queryJinshuiImportData start --------");

        JinshuiImportInvoiceV jinshuiImportInvoiceV = null;
        String redisValue = JSONObject.toJSONString(redisService.get("queryJinshuiImportDataByRedis"));
        List<JinshuiImportInvoiceV> list = new ArrayList<>();

        if(!"null".equals(redisValue)){
            JSONArray jsonArray = JSONArray.parseArray(redisValue);
            LoggerUtils.debug(getClass(), "JinshuiImportInvoiceVServiceImpl queryJinshuiImportData List<JinshuiImportInvoiceV> jsonArray is: " + jsonArray);
            for (int i = 0; i < jsonArray.size(); i++) {
                JSONObject jsonObject = JSONObject.parseObject(Convert.toStr(jsonArray.get(i)));
                jinshuiImportInvoiceV = JSON.toJavaObject(jsonObject, JinshuiImportInvoiceV.class);
                LoggerUtils.debug(getClass(), "JinshuiImportInvoiceVServiceImpl queryJinshuiImportData List<JinshuiImportInvoiceV> JSONObject to JinshuiImportInvoiceV is: " + jinshuiImportInvoiceV);
                list.add(jinshuiImportInvoiceV);
            }
            LoggerUtils.debug(getClass(), "JinshuiImportInvoiceVServiceImpl queryJinshuiImportData List<JinshuiImportInvoiceV> from redis is: " + list);
        }else{
            List<JinshuiImportInvoiceV> ll = jinshuiImportInvoiceVMapper.queryJinshuiImportData();
            LoggerUtils.debug(getClass(), "JinshuiImportInvoiceVServiceImpl queryJinshuiImportData List<JinshuiImportInvoiceV> from DB is: " + ll);
            redisService.putValue("queryJinshuiImportDataByRedis", ll, 60);
            list = ll;
        }
        LoggerUtils.debug(getClass(), "------ JinshuiImportInvoiceVServiceImpl queryJinshuiImportData end --------");
        return list;
    }
}
