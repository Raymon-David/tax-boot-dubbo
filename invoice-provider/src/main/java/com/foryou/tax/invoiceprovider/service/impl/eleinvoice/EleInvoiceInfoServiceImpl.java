package com.foryou.tax.invoiceprovider.service.impl.eleinvoice;

import com.alibaba.dubbo.config.annotation.Service;
import com.foryou.tax.invoiceapi.pojo.companies.FyCompanies;
import com.foryou.tax.invoiceapi.pojo.eleinvoice.EleInvoiceInfo;
import com.foryou.tax.invoiceapi.service.eleinvoice.EleInvoiceInfoService;
import com.foryou.tax.invoiceprovider.dao.eleinvoice.EleInvoiceInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * <p>
 * 电子发票表 服务实现类
 * </p>
 *
 * @author raymon
 * @since 2020-03-16
 */
@Service(version = "${dubbo.service.version}",
        application = "${dubbo.application.id}",
        protocol = "${dubbo.protocol.id}",
        registry = "${dubbo.registry.id}"
)
public class EleInvoiceInfoServiceImpl implements EleInvoiceInfoService {

    @Autowired
    EleInvoiceInfoMapper eleInvoiceInfoMapper;

    @Override
    public EleInvoiceInfo getEleInvoiceInfo(EleInvoiceInfo eleInvoiceInfo) {

        return eleInvoiceInfoMapper.getEleInvoiceInfo(eleInvoiceInfo);
    }

    @Override
    public int updateEleInvoiceTaxError(EleInvoiceInfo eleInvoiceInfo) {

        return eleInvoiceInfoMapper.updateEleInvoiceTaxError(eleInvoiceInfo);
    }

    @Override
    public int deleteData(EleInvoiceInfo eleInvoiceInfo) {
        return eleInvoiceInfoMapper.deleteData(eleInvoiceInfo);
    }

    @Override
    public String getSerialNum(FyCompanies fyCompanies) {

        String serialNum = eleInvoiceInfoMapper.searchSerialNum(fyCompanies);
        if (serialNum == null || "".equals(serialNum)) {
            serialNum = eleInvoiceInfoMapper.getSerialNum2(fyCompanies);
        }else {
            serialNum = eleInvoiceInfoMapper.getSerialNum1(fyCompanies);
        }
        return serialNum;
    }

    @Override
    public int insertData(EleInvoiceInfo eleInvoiceInfo) {
        return eleInvoiceInfoMapper.insertData(eleInvoiceInfo);
    }

    @Override
    public int updateEleInvoiceInterfaceStatus(EleInvoiceInfo eleInvoiceInfo1) {
        return eleInvoiceInfoMapper.updateEleInvoiceInterfaceStatus(eleInvoiceInfo1);
    }

    @Override
    public int updateEleInvoiceInfo(EleInvoiceInfo eleInvoiceInfo) {
        return eleInvoiceInfoMapper.updateEleInvoiceInfo(eleInvoiceInfo);
    }

    @Override
    public EleInvoiceInfo selectBySerialNum(EleInvoiceInfo eleInvoiceInfo) {
        return eleInvoiceInfoMapper.selectBySerialNum(eleInvoiceInfo);
    }
}
