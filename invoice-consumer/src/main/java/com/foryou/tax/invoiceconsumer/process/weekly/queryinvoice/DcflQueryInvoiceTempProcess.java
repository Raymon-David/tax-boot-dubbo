package com.foryou.tax.invoiceconsumer.process.weekly.queryinvoice;

import cn.hutool.core.convert.Convert;
import com.alibaba.dubbo.config.annotation.Reference;
import com.foryou.tax.invoiceapi.pojo.weekly.queryinvoice.DcflQueryInvoiceTemp;
import com.foryou.tax.invoiceapi.service.weekly.queryinvoice.DcflQueryInvoiceTempService;
import com.foryou.tax.invoiceapi.utils.DateUtil;
import com.foryou.tax.invoiceapi.utils.JDBCUtil;
import com.foryou.tax.invoiceapi.utils.LoggerUtils;
import com.foryou.tax.invoiceconsumer.process.common.BaseProcess;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author ：Raymon
 * @date ：Created in 2020/4/28
 * @description: 从DCFL销项发票查询导入数据 临时表 process
 */
@Service
public class DcflQueryInvoiceTempProcess extends BaseProcess {

    @Reference(version = "${dubbo.service.version}",
            application = "${dubbo.application.id}",
            url = "${dubbo.protocol.name}://${dubbo.protocol.host}:${dubbo.protocol.port}")
    private DcflQueryInvoiceTempService dcflQueryInvoiceTempService;

    String sql = "SELECT ah.document_number,                                              --单据编号\n" +
            "       ah.bp_name,                                                      --发票抬头\n" +
            "       ah.bp_tax_registry_num,                                          --纳税人识别号\n" +
            "       ah.bp_address_phone_num,\n" +
            "       ah.bp_bank_account,\n" +
            "       (DECODE (ah.contract_id, NULL, NULL, ah.description)) AS description,  --备注\n" +
            "       NVL (ah.total_amount_old, ah.total_amount) AS total_amount,  --总金额\n" +
            "       ah.tax_amount,   --税额\n" +
            "       (select max(al.tax_type_rate)\n" +
            "        from acr_invoice_ln al\n" +
            "        where al.invoice_hd_id = ah.invoice_hd_id ) as tax_type_rate,\n" +
            "       (select sum(al.net_amount)\n" +
            "        from acr_invoice_ln al\n" +
            "        where al.invoice_hd_id = ah.invoice_hd_id ) as net_amount,\n" +
            "       ah.internal_period_num,   --区间\n" +
            "       (NVL ( (SELECT he.bill_date\n" +
            "                 FROM acr_ele_invoice_hd he\n" +
            "                WHERE he.invoice_hd_id = ah.invoice_hd_id),\n" +
            "             ah.invoice_date))\n" +
            "          AS invoice_date,  --开票日期\n" +
            "       (NVL (ah.invoice_number,\n" +
            "             (SELECT he.yfphm\n" +
            "                FROM acr_ele_invoice_hd he\n" +
            "               WHERE he.invoice_hd_id = ah.invoice_hd_id)))\n" +
            "          AS invoice_number,   --发票号码\n" +
            "       ah.invalid_flag ,   --作废标志\n" +
            "       ah.confirmed_date,                                               --复核日期\n" +
            "       (SELECT u.description\n" +
            "          FROM sys_user u\n" +
            "         WHERE u.user_id = ah.confirmed_by)\n" +
            "          AS confirmed_by_n,                                             --复核人\n" +
            "       (SELECT u.description\n" +
            "          FROM sys_user u\n" +
            "         WHERE u.user_id = ah.created_by)\n" +
            "          AS created_by_n,                                               --开票人\n" +
            "       ah.creation_date,     --创建日期\n" +
            "       (NVL (ah.vat_invoice_code,\n" +
            "             (SELECT he.yfpdm\n" +
            "                FROM acr_ele_invoice_hd he\n" +
            "               WHERE he.invoice_hd_id = ah.invoice_hd_id)))\n" +
            "          vat_invoice_code                                            -- 发票代码\n" +
            "  FROM acr_invoice_hd ah\n" +
            "  where ah.accounting_date between sysdate - 8 and sysdate";

    public void dcflQueryInvoiceTempImport(HttpServletRequest request, HttpServletResponse response) {

        LoggerUtils.debug(getClass(), "DCFL_QUERY_INVOICE_TEMP 备份开始");
        String newTableName = "DCFL_QUERY_INVOICE_TEMP_" + DateUtil.parseDate(new Date());
        dcflQueryInvoiceTempService.backUpData(newTableName);
        LoggerUtils.debug(getClass(), "DCFL_QUERY_INVOICE_TEMP 备份结束");

        LoggerUtils.debug(getClass(), "DCFL_QUERY_INVOICE_TEMP 删除开始");
        dcflQueryInvoiceTempService.deleteData();
        LoggerUtils.debug(getClass(), "DCFL_QUERY_INVOICE_TEMP 删除结束");

        LoggerUtils.debug(getClass(), "DCFL_QUERY_INVOICE_TEMP sql is: " + sql);

        List<Map<String, String>> mapList = JDBCUtil.selectData(sql);

        for (int i = 0; i < mapList.size(); i++){
            DcflQueryInvoiceTemp dcflQueryInvoiceTemp = new DcflQueryInvoiceTemp();
            dcflQueryInvoiceTemp.setDocumentNumber(Convert.toStr(mapList.get(i).get("document_number")));
            dcflQueryInvoiceTemp.setInvoiceCode(Convert.toStr(mapList.get(i).get("vat_invoice_code")));
            dcflQueryInvoiceTemp.setInvoiceNumber(Convert.toStr(mapList.get(i).get("invoice_number")));
            dcflQueryInvoiceTemp.setInvoiceTitle(Convert.toStr(mapList.get(i).get("bp_name")));
            dcflQueryInvoiceTemp.setTaxRegistryNum(Convert.toStr(mapList.get(i).get("bp_tax_registry_num")));
            dcflQueryInvoiceTemp.setInvoiceObjectAddressPhone(Convert.toStr(mapList.get(i).get("bp_address_phone_num")));
            dcflQueryInvoiceTemp.setInvoiceObjectBankAccount(Convert.toStr(mapList.get(i).get("bp_bank_account")));
            dcflQueryInvoiceTemp.setIssuedTime(Convert.toDate(mapList.get(i).get("invoice_date")));
            dcflQueryInvoiceTemp.setIssuedMonth(Convert.toStr(mapList.get(i).get("internal_period_num")));
            dcflQueryInvoiceTemp.setTotalAmount(Convert.toBigDecimal(mapList.get(i).get("total_amount")));
            dcflQueryInvoiceTemp.setTaxAmount(Convert.toBigDecimal(mapList.get(i).get("tax_amount")));
            dcflQueryInvoiceTemp.setTaxNetAmount(Convert.toBigDecimal(mapList.get(i).get("net_amount")));
            dcflQueryInvoiceTemp.setTaxRate(Convert.toBigDecimal(mapList.get(i).get("tax_type_rate")));
            dcflQueryInvoiceTemp.setInvoiceMemo(Convert.toStr(mapList.get(i).get("description")));
            dcflQueryInvoiceTemp.setIssuer(Convert.toStr(mapList.get(i).get("created_by_n")));
            dcflQueryInvoiceTemp.setReviewer(Convert.toStr(mapList.get(i).get("confirmed_by_n")));
            dcflQueryInvoiceTemp.setInvoiceInvalidFlag(Convert.toStr(mapList.get(i).get("invalid_flag")));
            dcflQueryInvoiceTemp.setCreateTime(Convert.toDate(mapList.get(i).get("creation_date")));

            LoggerUtils.debug(getClass(), "DcflQueryInvoiceTemp is: " + dcflQueryInvoiceTemp);
            dcflQueryInvoiceTempService.insertData(dcflQueryInvoiceTemp);
        }

    }
}
