package com.foryou.tax.invoiceapi.service.invoiceobject;

import com.foryou.tax.invoiceapi.pojo.invoiceobject.InvoiceObjectInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <p>
 * 开票对象信息表 服务类
 * </p>
 *
 * @author raymon
 * @since 2020-03-23
 */
public interface InvoiceObjectInfoService{

    static final Logger log =  LoggerFactory.getLogger(InvoiceObjectInfoService.class);

    InvoiceObjectInfo getInvoiceObjectInfo(InvoiceObjectInfo invoiceObjectInfo);
}
