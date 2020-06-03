package com.foryou.tax.invoiceapi.service.weekly.mergeinvoice;


import com.foryou.tax.invoiceapi.pojo.weekly.mergeinvoice.DcflMergeInvoiceResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 金税系统的开票数据和融资资料系统的开票数据对比result 服务类
 * </p>
 *
 * @author raymon
 * @since 2020-05-11
 */
public interface DcflMergeInvoiceResultService {

    static final Logger log =  LoggerFactory.getLogger(DcflMergeInvoiceResultService.class);

    int insertData(DcflMergeInvoiceResult dcflMergeInvoiceResult);

    List<DcflMergeInvoiceResult> queryMergeResultData();

    int deleteData();

    int dropTableEveryMonth(String tableName);

    List<Map<String, Object>> queryableEveryMonth(String dropDate);

    int backUpTableEveryMonth(String splitTableNameStr, String historyTableName);
}
