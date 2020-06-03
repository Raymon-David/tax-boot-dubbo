package com.foryou.tax.invoiceprovider.dao.invoiceobject;

import com.foryou.tax.invoiceapi.pojo.invoiceobject.InvoiceObjectInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 开票对象信息表 Mapper 接口
 * </p>
 *
 * @author raymon
 * @since 2020-03-23
 */
@Component
@Mapper
public interface InvoiceObjectInfoMapper {

    InvoiceObjectInfo getInvoiceObjectInfo(InvoiceObjectInfo invoiceObjectInfo);
}
