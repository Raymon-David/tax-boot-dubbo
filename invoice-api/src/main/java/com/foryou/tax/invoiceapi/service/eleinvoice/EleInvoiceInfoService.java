package com.foryou.tax.invoiceapi.service.eleinvoice;

import com.foryou.tax.invoiceapi.pojo.companies.FyCompanies;
import com.foryou.tax.invoiceapi.pojo.eleinvoice.EleInvoiceInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <p>
 * 电子发票表 服务类
 * </p>
 *
 * @author raymon
 * @since 2020-03-16
 */
public interface EleInvoiceInfoService {

    static final Logger log =  LoggerFactory.getLogger(EleInvoiceInfoService.class);

    EleInvoiceInfo getEleInvoiceInfo(EleInvoiceInfo eleInvoiceInfo);

    int updateEleInvoiceTaxError(EleInvoiceInfo eleInvoiceInfo);

    int deleteData(EleInvoiceInfo eleInvoiceInfo);

    String getSerialNum(FyCompanies fyCompanies);

    int insertData(EleInvoiceInfo eleInvoiceInfo1);

    int updateEleInvoiceInterfaceStatus(EleInvoiceInfo eleInvoiceInfo1);

    int updateEleInvoiceInfo(EleInvoiceInfo eleInvoiceInfo);

    EleInvoiceInfo selectBySerialNum(EleInvoiceInfo eleInvoiceInfo);
}
