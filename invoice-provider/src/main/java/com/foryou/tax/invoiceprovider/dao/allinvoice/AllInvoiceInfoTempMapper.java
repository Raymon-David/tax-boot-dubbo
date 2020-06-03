package com.foryou.tax.invoiceprovider.dao.allinvoice;

import com.foryou.tax.invoiceapi.pojo.allinvoice.AllInvoiceInfoTemp;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 发票总表临时表 Mapper 接口
 * </p>
 *
 * @author raymon
 * @since 2020-04-08
 */
@Component
@Mapper
public interface AllInvoiceInfoTempMapper{

    int insertData(AllInvoiceInfoTemp allInvoiceInfoTemp);

    int backUpData(@Param("newTableName") String newTableName);

    int deleteData();

    List<Map<String, Object>> createInvoiceQueryWeekly();
}
