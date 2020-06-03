package com.foryou.tax.invoiceprovider.service.impl.companies;

import com.alibaba.dubbo.config.annotation.Service;
import com.foryou.tax.invoiceapi.pojo.companies.FyCompanies;
import com.foryou.tax.invoiceapi.service.companies.FyCompaniesService;
import com.foryou.tax.invoiceprovider.dao.companies.FyCompaniesMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * <p>
 * 公司信息表 服务实现类
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
public class FyCompaniesServiceImpl implements FyCompaniesService {

    @Autowired
    FyCompaniesMapper fyCompaniesMapper;

    @Override
    public int updateCompanyEleMargin(FyCompanies fyCompanies) {
        return fyCompaniesMapper.updateCompanyEleMargin(fyCompanies);
    }
}
