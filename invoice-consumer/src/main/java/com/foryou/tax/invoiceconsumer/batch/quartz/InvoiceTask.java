package com.foryou.tax.invoiceconsumer.batch.quartz;

import com.foryou.tax.invoiceapi.utils.LoggerUtils;
import com.foryou.tax.invoiceconsumer.process.allinvoice.AllInvoiceProcess;
import com.foryou.tax.invoiceconsumer.process.weekly.queryinvoice.DcflQueryInvoiceTempProcess;
import com.foryou.tax.invoiceconsumer.process.weekly.writeoffinfo.WriteOffInfoProcess;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.quartz.QuartzJobBean;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author ：Raymon
 * @date ：Created in 2020/4/21
 * @description: 现金事物查询一周的数据量，发票创建查询所有数据
 */
public class InvoiceTask extends QuartzJobBean {

    @Autowired
    private WriteOffInfoProcess writeOffInfoProcess;

    @Autowired
    private AllInvoiceProcess allInvoiceProcess;

    @Autowired
    private DcflQueryInvoiceTempProcess dcflQueryInvoiceTempProcess;

    public InvoiceTask(){}

    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        HttpServletRequest request = null;
        HttpServletResponse response = null;

        LoggerUtils.debug(getClass(), "InvoiceTask start");

        LoggerUtils.debug(getClass(), "导入发票创建 开始");
        allInvoiceProcess.dcflCreateInvoiceImport(request, response);
        LoggerUtils.debug(getClass(), "导入发票创建 结束");

        LoggerUtils.debug(getClass(), "导入现金事务查询 开始");
        writeOffInfoProcess.writeOffInfoImport(request, response);
        LoggerUtils.debug(getClass(), "导入现金事务查询 结束");

        LoggerUtils.debug(getClass(), "导入销项发票查询 开始");
        dcflQueryInvoiceTempProcess.dcflQueryInvoiceTempImport(request, response);
        LoggerUtils.debug(getClass(), "导入销项发票查询 结束");

        LoggerUtils.debug(getClass(), "InvoiceTask end");
    }


}
