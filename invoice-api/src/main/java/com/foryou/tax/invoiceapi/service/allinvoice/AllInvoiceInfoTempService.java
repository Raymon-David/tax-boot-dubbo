package com.foryou.tax.invoiceapi.service.allinvoice;

import com.foryou.tax.invoiceapi.pojo.allinvoice.AllInvoiceInfoTemp;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 发票总表临时表 服务类
 * </p>
 *
 * @author raymon
 * @since 2020-04-08
 */
public interface AllInvoiceInfoTempService {

    static final Logger log =  LoggerFactory.getLogger(AllInvoiceInfoTempService.class);

    void insertData(AllInvoiceInfoTemp allInvoiceInfoTemp);

    int backUpData(String newTableName);

    int deleteData();

    List<Map<String, Object>> createInvoiceQueryWeekly();
}
