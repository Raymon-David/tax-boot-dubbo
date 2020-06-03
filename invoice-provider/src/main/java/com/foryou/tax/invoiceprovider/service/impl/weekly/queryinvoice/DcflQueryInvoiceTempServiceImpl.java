package com.foryou.tax.invoiceprovider.service.impl.weekly.queryinvoice;

import com.alibaba.dubbo.config.annotation.Service;
import com.foryou.tax.invoiceapi.pojo.weekly.queryinvoice.DcflQueryInvoiceTemp;
import com.foryou.tax.invoiceapi.service.weekly.queryinvoice.DcflQueryInvoiceTempService;
import com.foryou.tax.invoiceprovider.dao.weekly.queryinvoice.DcflQueryInvoiceTempMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * <p>
 * 从DCFL销项发票查询导入数据 临时表 服务实现类
 * </p>
 *
 * @author raymon
 * @since 2020-04-28
 */
@Service(version = "${dubbo.service.version}",
        application = "${dubbo.application.id}",
        protocol = "${dubbo.protocol.id}",
        registry = "${dubbo.registry.id}"
)
public class DcflQueryInvoiceTempServiceImpl implements DcflQueryInvoiceTempService {

    @Autowired
    DcflQueryInvoiceTempMapper dcflQueryInvoiceTempMapper;

    @Override
    public int insertData(DcflQueryInvoiceTemp dcflQueryInvoiceTemp) {
        return dcflQueryInvoiceTempMapper.insertData(dcflQueryInvoiceTemp);
    }

    @Override
    public int backUpData(@Param("newTableName")String newTableName) {
        return dcflQueryInvoiceTempMapper.backUpData(newTableName);
    }

    @Override
    public int deleteData() {
        return dcflQueryInvoiceTempMapper.deleteData();
    }
}
