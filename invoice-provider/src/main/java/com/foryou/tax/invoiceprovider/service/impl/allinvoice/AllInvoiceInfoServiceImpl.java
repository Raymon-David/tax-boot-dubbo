package com.foryou.tax.invoiceprovider.service.impl.allinvoice;

import com.alibaba.dubbo.config.annotation.Service;
import com.foryou.tax.invoiceapi.pojo.allinvoice.AllInvoiceInfo;
import com.foryou.tax.invoiceapi.service.allinvoice.AllInvoiceInfoService;
import com.foryou.tax.invoiceprovider.dao.allinvoice.AllInvoiceInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * <p>
 * 发票总表 服务实现类
 * </p>
 *
 * @author raymon
 * @since 2020-03-18
 */
@Service(version = "${dubbo.service.version}",
        application = "${dubbo.application.id}",
        protocol = "${dubbo.protocol.id}",
        registry = "${dubbo.registry.id}"
)
public class AllInvoiceInfoServiceImpl implements AllInvoiceInfoService {

    @Autowired
    AllInvoiceInfoMapper allInvoiceInfoMapper;

    @Override
    public AllInvoiceInfo getInvoiceNum(AllInvoiceInfo allInvoiceInfo) {
        return allInvoiceInfoMapper.getInvoiceNum(allInvoiceInfo);
    }
}
