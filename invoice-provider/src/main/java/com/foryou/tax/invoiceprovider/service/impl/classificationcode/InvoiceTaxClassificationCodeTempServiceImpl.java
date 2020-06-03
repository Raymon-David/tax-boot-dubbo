package com.foryou.tax.invoiceprovider.service.impl.classificationcode;

import com.alibaba.dubbo.config.annotation.Service;
import com.foryou.tax.invoiceapi.pojo.classificationcode.InvoiceTaxClassificationCodeTemp;
import com.foryou.tax.invoiceapi.service.classificationcode.InvoiceTaxClassificationCodeTempService;
import com.foryou.tax.invoiceprovider.dao.classificationcode.InvoiceTaxClassificationCodeTempMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * <p>
 * 税收分类编码临时表 服务实现类
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
public class InvoiceTaxClassificationCodeTempServiceImpl implements InvoiceTaxClassificationCodeTempService {

    @Autowired
    InvoiceTaxClassificationCodeTempMapper invoiceTaxClassificationCodeTempMapper;

    @Override
    public int insetData(InvoiceTaxClassificationCodeTemp invoiceTaxClassificationCodeTemp) {
        return invoiceTaxClassificationCodeTempMapper.insertData(invoiceTaxClassificationCodeTemp);
    }

    @Override
    public List<InvoiceTaxClassificationCodeTemp> selectData() {
        return invoiceTaxClassificationCodeTempMapper.selectData();
    }
}
