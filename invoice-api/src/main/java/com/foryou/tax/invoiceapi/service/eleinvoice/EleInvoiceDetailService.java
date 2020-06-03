package com.foryou.tax.invoiceapi.service.eleinvoice;

import com.foryou.tax.invoiceapi.pojo.allinvoice.AllInvoiceDetail;
import com.foryou.tax.invoiceapi.pojo.eleinvoice.EleInvoiceDetail;
import com.foryou.tax.invoiceapi.pojo.eleinvoice.EleInvoiceInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 电子发票明细表 服务类
 * </p>
 *
 * @author raymon
 * @since 2020-03-17
 */
public interface EleInvoiceDetailService {

    static final Logger log =  LoggerFactory.getLogger(EleInvoiceDetailService.class);

    List<EleInvoiceDetail> getEleInvoiceDetailInfo(EleInvoiceDetail eleInvoiceDetail);

    int deleteData(EleInvoiceInfo eleInvoiceInfo);

    int insertData(EleInvoiceDetail eleInvoiceDetail);

    String getTaxClassificationCode(AllInvoiceDetail allInvoiceDetail);

    List<Map> getContractDetail(Integer cashflowId);
}
