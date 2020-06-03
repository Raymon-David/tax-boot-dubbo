package com.foryou.tax.invoiceapi.service.classificationcode;

import com.foryou.tax.invoiceapi.pojo.classificationcode.InvoiceTaxClassificationCodeTemp;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * <p>
 * 税收分类编码临时表 服务类
 * </p>
 *
 * @author raymon
 * @since 2020-03-31
 */
public interface InvoiceTaxClassificationCodeTempService {

    static final Logger log =  LoggerFactory.getLogger(InvoiceTaxClassificationCodeTempService.class);

    int insetData(InvoiceTaxClassificationCodeTemp invoiceTaxClassificationCodeTemp);

    List<InvoiceTaxClassificationCodeTemp> selectData();
}
