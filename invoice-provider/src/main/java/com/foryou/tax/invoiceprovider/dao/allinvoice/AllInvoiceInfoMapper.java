package com.foryou.tax.invoiceprovider.dao.allinvoice;

import com.foryou.tax.invoiceapi.pojo.allinvoice.AllInvoiceInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 发票总表 Mapper 接口
 * </p>
 *
 * @author raymon
 * @since 2020-03-18
 */
@Component
@Mapper
public interface AllInvoiceInfoMapper {

    AllInvoiceInfo getInvoiceNum(AllInvoiceInfo allInvoiceInfo);
}
