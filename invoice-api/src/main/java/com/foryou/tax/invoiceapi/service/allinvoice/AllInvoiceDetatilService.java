package com.foryou.tax.invoiceapi.service.allinvoice;

import com.foryou.tax.invoiceapi.pojo.allinvoice.AllInvoiceDetail;
import com.foryou.tax.invoiceapi.pojo.allinvoice.AllInvoiceInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * <p>
 * 发票明细表 服务类
 * </p>
 *
 * @author raymon
 * @since 2020-03-24
 */
public interface AllInvoiceDetatilService {

    static final Logger log =  LoggerFactory.getLogger(AllInvoiceDetatilService.class);

    List<AllInvoiceDetail> getAllInvoiceDetailInfo(AllInvoiceInfo allInvoiceInfo);

}
