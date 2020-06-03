package com.foryou.tax.invoiceapi.service.weekly.queryinvoice;

import com.foryou.tax.invoiceapi.pojo.weekly.queryinvoice.DcflQueryInvoiceTemp;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <p>
 * 从DCFL销项发票查询导入数据 临时表 服务类
 * </p>
 *
 * @author raymon
 * @since 2020-04-28
 */
public interface DcflQueryInvoiceTempService {

    static final Logger log =  LoggerFactory.getLogger(DcflQueryInvoiceTempService.class);

    int insertData(DcflQueryInvoiceTemp dcflQueryInvoiceTemp);

    int backUpData(String newTableName);

    int deleteData();
}
