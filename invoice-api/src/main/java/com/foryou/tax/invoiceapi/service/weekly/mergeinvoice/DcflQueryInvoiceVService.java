package com.foryou.tax.invoiceapi.service.weekly.mergeinvoice;

import com.foryou.tax.invoiceapi.pojo.weekly.mergeinvoice.DcflQueryInvoiceV;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * <p>
 * VIEW 服务类
 * </p>
 *
 * @author raymon
 * @since 2020-05-11
 */
public interface DcflQueryInvoiceVService {

    static final Logger log =  LoggerFactory.getLogger(DcflQueryInvoiceVService.class);

    DcflQueryInvoiceV dcflQueryInvoiceDataByKeywords(String keyWords);

    List<DcflQueryInvoiceV> queryDcflInvoiceData();
}
