package com.foryou.tax.invoiceprovider.dao.eleinvoice;

import com.foryou.tax.invoiceapi.pojo.allinvoice.AllInvoiceDetail;
import com.foryou.tax.invoiceapi.pojo.eleinvoice.EleInvoiceDetail;
import com.foryou.tax.invoiceapi.pojo.eleinvoice.EleInvoiceInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 电子发票明细表 Mapper 接口
 * </p>
 *
 * @author raymon
 * @since 2020-03-23
 */
@Component
@Mapper
public interface EleInvoiceDetailMapper  {

    List<EleInvoiceDetail> getEleInvoiceDetailInfo(EleInvoiceDetail eleInvoiceDetail);

    int deleteData(EleInvoiceInfo eleInvoiceInfo);

    int insertData(EleInvoiceDetail eleInvoiceDetail);

    String getTaxClassificationCode(AllInvoiceDetail allInvoiceDetail);

    List<Map> getContractDetail(Integer cashflowId);
}
