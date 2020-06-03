package com.foryou.tax.invoiceprovider.dao.companies;

import com.foryou.tax.invoiceapi.pojo.companies.FyCompanies;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 公司信息表 Mapper 接口
 * </p>
 *
 * @author raymon
 * @since 2020-03-24
 */
@Component
@Mapper
public interface FyCompaniesMapper {

    int updateCompanyEleMargin(FyCompanies fyCompanies);
}
