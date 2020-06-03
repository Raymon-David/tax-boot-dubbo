package com.foryou.tax.invoiceprovider.service.impl.allinvoice;

import com.alibaba.dubbo.config.annotation.Service;
import com.foryou.tax.invoiceapi.pojo.allinvoice.AllInvoiceDetail;
import com.foryou.tax.invoiceapi.pojo.allinvoice.AllInvoiceInfo;
import com.foryou.tax.invoiceapi.service.allinvoice.AllInvoiceDetatilService;
import com.foryou.tax.invoiceprovider.dao.allinvoice.AllInvoiceDetatilMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * <p>
 * 发票明细表 服务实现类
 * </p>
 *
 * @author raymon
 * @since 2020-03-24
 */
@Service(version = "${dubbo.service.version}",
        application = "${dubbo.application.id}",
        protocol = "${dubbo.protocol.id}",
        registry = "${dubbo.registry.id}"
)
public class AllInvoiceDetatilServiceImpl implements AllInvoiceDetatilService {

    @Autowired
    AllInvoiceDetatilMapper allInvoiceDetatilMapper;

    @Override
    public List<AllInvoiceDetail> getAllInvoiceDetailInfo(AllInvoiceInfo allInvoiceInfo) {
        return allInvoiceDetatilMapper.getAllInvoiceDetailInfo(allInvoiceInfo);
    }
}
