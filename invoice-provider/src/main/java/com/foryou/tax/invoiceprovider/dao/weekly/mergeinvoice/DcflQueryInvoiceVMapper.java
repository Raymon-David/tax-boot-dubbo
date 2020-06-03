package com.foryou.tax.invoiceprovider.dao.weekly.mergeinvoice;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.foryou.tax.invoiceapi.pojo.weekly.mergeinvoice.DcflQueryInvoiceV;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * <p>
 * VIEW Mapper 接口
 * </p>
 *
 * @author raymon
 * @since 2020-05-11
 */
@Component
@Mapper
public interface DcflQueryInvoiceVMapper extends BaseMapper<DcflQueryInvoiceV> {

    DcflQueryInvoiceV dcflQueryInvoiceDataByKeywords(String keyWords);

    List<DcflQueryInvoiceV> queryDcflInvoiceData();
}
