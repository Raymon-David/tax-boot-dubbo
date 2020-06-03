package com.foryou.tax.invoiceapi.service.allinvoice;


import com.foryou.tax.invoiceapi.pojo.allinvoice.AllInvoiceInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <p>
 * 发票总表 服务类
 * </p>
 *
 * @author raymon
 * @since 2020-03-18
 */
public interface AllInvoiceInfoService{

    static final Logger log =  LoggerFactory.getLogger(AllInvoiceInfoService.class);

    AllInvoiceInfo getInvoiceNum(AllInvoiceInfo allInvoiceInfo);
}
