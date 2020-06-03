package com.foryou.tax.invoiceprovider.service.impl.invoiceobject;

import com.alibaba.dubbo.config.annotation.Service;
import com.foryou.tax.invoiceapi.pojo.invoiceobject.InvoiceObjectInfo;
import com.foryou.tax.invoiceapi.service.invoiceobject.InvoiceObjectInfoService;
import com.foryou.tax.invoiceprovider.dao.invoiceobject.InvoiceObjectInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * <p>
 * 开票对象信息表 服务实现类
 * </p>
 *
 * @author raymon
 * @since 2020-03-23
 */
@Service(version = "${dubbo.service.version}",
        application = "${dubbo.application.id}",
        protocol = "${dubbo.protocol.id}",
        registry = "${dubbo.registry.id}"
)
public class InvoiceObjectInfoServiceImpl implements InvoiceObjectInfoService {

    @Autowired
    InvoiceObjectInfoMapper invoiceObjectInfoMapper;

    @Override
    public InvoiceObjectInfo getInvoiceObjectInfo(InvoiceObjectInfo invoiceObjectInfo) {
        return invoiceObjectInfoMapper.getInvoiceObjectInfo(invoiceObjectInfo);
    }
}
