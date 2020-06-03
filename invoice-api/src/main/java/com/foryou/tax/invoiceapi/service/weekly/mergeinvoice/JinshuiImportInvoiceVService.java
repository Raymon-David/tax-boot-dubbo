package com.foryou.tax.invoiceapi.service.weekly.mergeinvoice;


import com.foryou.tax.invoiceapi.pojo.weekly.mergeinvoice.JinshuiImportInvoiceV;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * <p>
 * VIEW 服务类
 * </p>
 *
 * @author raymon
 * @since 2020-05-11
 */
public interface JinshuiImportInvoiceVService {

    static final Logger log =  LoggerFactory.getLogger(JinshuiImportInvoiceVService.class);

    List<JinshuiImportInvoiceV> queryJinshuiImportData();
}
