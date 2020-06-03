package com.foryou.tax.invoiceapi.service.weekly;

import com.foryou.tax.invoiceapi.pojo.weekly.DcflEleInvoiceImportTemp;
import com.foryou.tax.invoiceapi.pojo.weekly.DcflPaperInvoiceImportTemp;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <p>
 * 从页面导入电子发票 临时表 服务类
 * </p>
 *
 * @author raymon
 * @since 2020-04-20
 */
public interface DcflEleInvoiceImportTempService {

    static final Logger log =  LoggerFactory.getLogger(DcflEleInvoiceImportTempService.class);

    int insetEleData(DcflEleInvoiceImportTemp dcflEleInvoiceImportTemp);

    int insetPaperData(DcflPaperInvoiceImportTemp dcflPaperInvoiceImportTemp);

    int backUpPaperData(String newTableName);

    int deletePaperData();

    int backUpEleData(String newTableName);

    int deleteEleData();
}
