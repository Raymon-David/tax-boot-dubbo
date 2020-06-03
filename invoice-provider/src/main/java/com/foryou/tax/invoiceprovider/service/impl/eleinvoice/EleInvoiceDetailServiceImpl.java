package com.foryou.tax.invoiceprovider.service.impl.eleinvoice;

import com.alibaba.dubbo.config.annotation.Service;
import com.foryou.tax.invoiceapi.pojo.allinvoice.AllInvoiceDetail;
import com.foryou.tax.invoiceapi.pojo.eleinvoice.EleInvoiceDetail;
import com.foryou.tax.invoiceapi.pojo.eleinvoice.EleInvoiceInfo;
import com.foryou.tax.invoiceapi.service.eleinvoice.EleInvoiceDetailService;
import com.foryou.tax.invoiceprovider.dao.eleinvoice.EleInvoiceDetailMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 电子发票明细表 服务实现类
 * </p>
 *
 * @author raymon
 * @since 2020-03-17
 */
@Service(version = "${dubbo.service.version}",
        application = "${dubbo.application.id}",
        protocol = "${dubbo.protocol.id}",
        registry = "${dubbo.registry.id}"
)
public class EleInvoiceDetailServiceImpl implements EleInvoiceDetailService {

    @Autowired
    EleInvoiceDetailMapper eleInvoiceDetailMapper;

    @Override
    public List<EleInvoiceDetail> getEleInvoiceDetailInfo(EleInvoiceDetail eleInvoiceDetail) {
        return eleInvoiceDetailMapper.getEleInvoiceDetailInfo(eleInvoiceDetail);
    }

    @Override
    public int deleteData(EleInvoiceInfo eleInvoiceInfo) {
        return eleInvoiceDetailMapper.deleteData(eleInvoiceInfo);
    }

    @Override
    public int insertData(EleInvoiceDetail eleInvoiceDetail) {
        return eleInvoiceDetailMapper.insertData(eleInvoiceDetail);
    }

    @Override
    public String getTaxClassificationCode(AllInvoiceDetail allInvoiceDetail) {
        return eleInvoiceDetailMapper.getTaxClassificationCode(allInvoiceDetail);
    }

    @Override
    public List<Map> getContractDetail(Integer cashflowId) {
        return eleInvoiceDetailMapper.getContractDetail(cashflowId);
    }
}
