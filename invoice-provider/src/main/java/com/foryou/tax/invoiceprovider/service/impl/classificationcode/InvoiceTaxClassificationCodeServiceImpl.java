package com.foryou.tax.invoiceprovider.service.impl.classificationcode;

import com.alibaba.dubbo.config.annotation.Service;
import com.foryou.tax.invoiceapi.pojo.classificationcode.InvoiceTaxClassificationCode;
import com.foryou.tax.invoiceapi.service.classificationcode.InvoiceTaxClassificationCodeService;
import com.foryou.tax.invoiceprovider.dao.classificationcode.InvoiceTaxClassificationCodeMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * <p>
 * 税收分类编码 服务实现类
 * </p>
 *
 * @author raymon
 * @since 2020-03-31
 */
@Service(version = "${dubbo.service.version}",
        application = "${dubbo.application.id}",
        protocol = "${dubbo.protocol.id}",
        registry = "${dubbo.registry.id}"
)
public class InvoiceTaxClassificationCodeServiceImpl implements InvoiceTaxClassificationCodeService {

    @Autowired
    InvoiceTaxClassificationCodeMapper invoiceTaxClassificationCodeMapper;

    @Override
    public InvoiceTaxClassificationCode selectByTaxClassificationCode(String taxClassCode) {
        return invoiceTaxClassificationCodeMapper.selectByTaxClassificationCode(taxClassCode);
    }

    @Override
    public int insertData(InvoiceTaxClassificationCode invoiceTaxClassificationCode) {
        return invoiceTaxClassificationCodeMapper.insertData(invoiceTaxClassificationCode);
    }
}
