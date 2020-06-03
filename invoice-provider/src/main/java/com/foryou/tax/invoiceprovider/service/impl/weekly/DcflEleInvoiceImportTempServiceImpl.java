package com.foryou.tax.invoiceprovider.service.impl.weekly;

import com.alibaba.dubbo.config.annotation.Service;
import com.foryou.tax.invoiceapi.pojo.weekly.DcflEleInvoiceImportTemp;
import com.foryou.tax.invoiceapi.pojo.weekly.DcflPaperInvoiceImportTemp;
import com.foryou.tax.invoiceapi.service.weekly.DcflEleInvoiceImportTempService;
import com.foryou.tax.invoiceprovider.dao.weekly.DcflEleInvoiceImportTempMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * <p>
 * 从页面导入电子发票 临时表 服务实现类
 * </p>
 *
 * @author raymon
 * @since 2020-04-20
 */
@Service(version = "${dubbo.service.version}",
        application = "${dubbo.application.id}",
        protocol = "${dubbo.protocol.id}",
        registry = "${dubbo.registry.id}"
)
public class DcflEleInvoiceImportTempServiceImpl implements DcflEleInvoiceImportTempService {

    @Autowired
    DcflEleInvoiceImportTempMapper dcflEleInvoiceImportTempMapper;

    @Override
    public int insetEleData(DcflEleInvoiceImportTemp dcflEleInvoiceImportTemp) {
        return dcflEleInvoiceImportTempMapper.insertEleData(dcflEleInvoiceImportTemp);
    }

    @Override
    public int insetPaperData(DcflPaperInvoiceImportTemp dcflPaperInvoiceImportTemp) {
        return dcflEleInvoiceImportTempMapper.insetPaperData(dcflPaperInvoiceImportTemp);
    }

    @Override
    public int backUpPaperData(@Param("newTableName")String newTableName) {
        return dcflEleInvoiceImportTempMapper.backUpPaperData(newTableName);
    }

    @Override
    public int deletePaperData() {
        return dcflEleInvoiceImportTempMapper.deletePaperData();
    }

    @Override
    public int backUpEleData(@Param("newTableName")String newTableName) {
        return dcflEleInvoiceImportTempMapper.backUpEleData(newTableName);
    }

    @Override
    public int deleteEleData() {
        return dcflEleInvoiceImportTempMapper.deleteEleData();
    }
}
