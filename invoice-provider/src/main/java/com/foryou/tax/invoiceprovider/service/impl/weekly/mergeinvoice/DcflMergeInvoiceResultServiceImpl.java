package com.foryou.tax.invoiceprovider.service.impl.weekly.mergeinvoice;

import cn.hutool.core.convert.Convert;
import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.foryou.tax.invoiceapi.pojo.weekly.mergeinvoice.DcflMergeInvoiceResult;
import com.foryou.tax.invoiceapi.service.redis.RedisService;
import com.foryou.tax.invoiceapi.service.weekly.mergeinvoice.DcflMergeInvoiceResultService;
import com.foryou.tax.invoiceapi.utils.LoggerUtils;
import com.foryou.tax.invoiceprovider.dao.weekly.mergeinvoice.DcflMergeInvoiceResultMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 金税系统的开票数据和融资资料系统的开票数据对比result 服务实现类
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
public class DcflMergeInvoiceResultServiceImpl implements DcflMergeInvoiceResultService {

    @Autowired
    DcflMergeInvoiceResultMapper dcflMergeInvoiceResultMapper;

    @Autowired
    private RedisService redisService;

    @Override
    public int insertData(DcflMergeInvoiceResult dcflMergeInvoiceResult) {
        return dcflMergeInvoiceResultMapper.insertData(dcflMergeInvoiceResult);
    }

    @Override
    public List<DcflMergeInvoiceResult> queryMergeResultData() {
        LoggerUtils.debug(getClass(), "------ DcflMergeInvoiceResultServiceImpl queryMergeResultData start --------");

        DcflMergeInvoiceResult dcflMergeInvoiceResult = null;
        String redisValue = JSONObject.toJSONString(redisService.get("queryMergeResultDataByRedis"));
        List<DcflMergeInvoiceResult> list = new ArrayList<>();

        if(!"null".equals(redisValue)){
            JSONArray jsonArray = JSONArray.parseArray(redisValue);
            LoggerUtils.debug(getClass(), "DcflMergeInvoiceResultServiceImpl queryMergeResultData List<DcflMergeInvoiceResult> jsonArray is: " + jsonArray);
            for (int i = 0; i < jsonArray.size(); i++) {
                JSONObject jsonObject = JSONObject.parseObject(Convert.toStr(jsonArray.get(i)));
                dcflMergeInvoiceResult = JSON.toJavaObject(jsonObject, DcflMergeInvoiceResult.class);
                LoggerUtils.debug(getClass(), "DcflMergeInvoiceResultServiceImpl queryMergeResultData List<DcflMergeInvoiceResult> JSONObject to DcflMergeInvoiceResult is: " + dcflMergeInvoiceResult);
                list.add(dcflMergeInvoiceResult);
            }
            LoggerUtils.debug(getClass(), "DcflMergeInvoiceResultServiceImpl queryMergeResultData List<DcflMergeInvoiceResult> from redis is: " + list);
        }else{
            List<DcflMergeInvoiceResult> ll = dcflMergeInvoiceResultMapper.queryMergeResultData();
            LoggerUtils.debug(getClass(), "DcflMergeInvoiceResultServiceImpl queryMergeResultData List<DcflMergeInvoiceResult> from DB is: " + ll);
            redisService.putValue("queryMergeResultDataByRedis", ll, 60);
            list = ll;
        }
        LoggerUtils.debug(getClass(), "------ DcflMergeInvoiceResultServiceImpl queryMergeResultData end --------");
        return list;
    }

    @Override
    public int deleteData() {
        return dcflMergeInvoiceResultMapper.deleteData();
    }

    @Override
    public int dropTableEveryMonth(@Param("tableName")String tableName) {
        return dcflMergeInvoiceResultMapper.dropTableEveryMonth(tableName);
    }

    @Override
    public List<Map<String, Object>> queryableEveryMonth(@Param("dropDate") String dropDate) {
        return dcflMergeInvoiceResultMapper.queryableEveryMonth(dropDate);
    }

    @Override
    public int backUpTableEveryMonth(String splitTableNameStr, String historyTableName) {
        return dcflMergeInvoiceResultMapper.backUpTableEveryMonth(splitTableNameStr, historyTableName);
    }
}
