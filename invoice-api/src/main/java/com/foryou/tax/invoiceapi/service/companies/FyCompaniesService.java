package com.foryou.tax.invoiceapi.service.companies;


import com.foryou.tax.invoiceapi.pojo.companies.FyCompanies;
import com.foryou.tax.invoiceapi.service.attachment.FyAttachmentInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <p>
 * 公司信息表 服务类
 * </p>
 *
 * @author raymon
 * @since 2020-03-24
 */
public interface FyCompaniesService {

    static final Logger log =  LoggerFactory.getLogger(FyAttachmentInfoService.class);

    int updateCompanyEleMargin(FyCompanies fyCompanies);

}
