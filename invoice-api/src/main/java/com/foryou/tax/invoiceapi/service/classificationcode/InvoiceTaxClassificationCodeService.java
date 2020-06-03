package com.foryou.tax.invoiceapi.service.classificationcode;


import com.foryou.tax.invoiceapi.pojo.classificationcode.InvoiceTaxClassificationCode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <p>
 * 税收分类编码 服务类
 * </p>
 *
 * @author raymon
 * @since 2020-03-31
 */
public interface InvoiceTaxClassificationCodeService {

    static final Logger log =  LoggerFactory.getLogger(InvoiceTaxClassificationCodeService.class);

    InvoiceTaxClassificationCode selectByTaxClassificationCode(String taxClassCode);

    int insertData(InvoiceTaxClassificationCode invoiceTaxClassificationCode);
}
