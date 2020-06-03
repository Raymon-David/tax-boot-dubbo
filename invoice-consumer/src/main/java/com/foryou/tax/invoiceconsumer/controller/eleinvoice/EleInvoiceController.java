package com.foryou.tax.invoiceconsumer.controller.eleinvoice;

import com.foryou.tax.invoiceapi.pojo.allinvoice.AllInvoiceInfo;
import com.foryou.tax.invoiceconsumer.process.eleinvoice.EleInvoiceProcess;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * <p>
 * 电子发票表 前端控制器
 * </p>
 *
 * @author raymon
 * @since 2020-03-16
 */
@RestController
public class EleInvoiceController {

    @Autowired
    private EleInvoiceProcess eleInvoiceProcess;

    /**
     * 金税接口发票开票接口入口
     */
    @RequestMapping(value = "/eleInvoice/info/submit")
    public void eleInvoiceInfoSubmit(HttpServletRequest request, HttpServletResponse response, @RequestBody List<AllInvoiceInfo> allInvoiceDataList){

        eleInvoiceProcess.eleInvoiceInfoSubmit(request, response, allInvoiceDataList);
    }


    /**
     * 金税接口发票下载接口
     */
    @RequestMapping(value = "/eleInvoice/info/download")
    public void eleInvoiceInfoDownload(HttpServletRequest request, HttpServletResponse response, @RequestBody List<AllInvoiceInfo> allInvoiceDataList){

        eleInvoiceProcess.eleInvoiceInfoDownload(request, response, allInvoiceDataList);
    }
}

