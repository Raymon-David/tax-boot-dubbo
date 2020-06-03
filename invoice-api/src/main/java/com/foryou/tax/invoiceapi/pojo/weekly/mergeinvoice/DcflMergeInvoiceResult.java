package com.foryou.tax.invoiceapi.pojo.weekly.mergeinvoice;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * <p>
 * 金税系统的开票数据和融资资料系统的开票数据对比result
 * </p>
 *
 * @author raymon
 * @since 2020-05-11
 */
public class DcflMergeInvoiceResult implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 单据编号
     */
    private String documentNumber;
    /**
     * 关键字
     */
    private String keywords;
    /**
     * 合同号
     */
    private String contractNumber;
    /**
     * 发票代码
     */
    private String invoiceCode;
    /**
     * 发票号
     */
    private String invoiceNumber;
    /**
     * 购方名称
     */
    private String invoiceTitle;
    /**
     * 购方税号
     */
    private String taxRegistryNum;
    /**
     * 购方地址电话
     */
    private String invoiceObjectAddressPhone;
    /**
     * 开户行+账号
     */
    private String invoiceObjectBankAccount;
    /**
     * 开票日期
     */
    private Date issuedTime;
    /**
     * 所属月份
     */
    private String issuedMonth;
    /**
     * 含税金额 订单总价合计
     */
    private BigDecimal totalAmount;
    /**
     * 不含税金额 合计金额
     */
    private BigDecimal taxNetAmount;
    /**
     * 税率
     */
    private BigDecimal taxRate;
    /**
     * 税额 合计税额
     */
    private BigDecimal taxAmount;
    /**
     * 备注
     */
    private String invoiceMemo;
    /**
     * 开票人
     */
    private String issuer;
    /**
     * 复核人
     */
    private String reviewer;
    /**
     * 发票作废标志
     */
    private String invoiceInvalidFlag;
    /**
     * 对比结果
     */
    private String invoiceMergeResult;
    private Integer createdBy;
    /**
     * 创建时间
     */
    private Date createTime;
    private Integer updatedBy;
    /**
     * 更新时间
     */
    private Date updateTime;


    public String getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public String getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }

    public String getInvoiceCode() {
        return invoiceCode;
    }

    public void setInvoiceCode(String invoiceCode) {
        this.invoiceCode = invoiceCode;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public String getInvoiceTitle() {
        return invoiceTitle;
    }

    public void setInvoiceTitle(String invoiceTitle) {
        this.invoiceTitle = invoiceTitle;
    }

    public String getTaxRegistryNum() {
        return taxRegistryNum;
    }

    public void setTaxRegistryNum(String taxRegistryNum) {
        this.taxRegistryNum = taxRegistryNum;
    }

    public String getInvoiceObjectAddressPhone() {
        return invoiceObjectAddressPhone;
    }

    public void setInvoiceObjectAddressPhone(String invoiceObjectAddressPhone) {
        this.invoiceObjectAddressPhone = invoiceObjectAddressPhone;
    }

    public String getInvoiceObjectBankAccount() {
        return invoiceObjectBankAccount;
    }

    public void setInvoiceObjectBankAccount(String invoiceObjectBankAccount) {
        this.invoiceObjectBankAccount = invoiceObjectBankAccount;
    }

    public Date getIssuedTime() {
        return issuedTime;
    }

    public void setIssuedTime(Date issuedTime) {
        this.issuedTime = issuedTime;
    }

    public String getIssuedMonth() {
        return issuedMonth;
    }

    public void setIssuedMonth(String issuedMonth) {
        this.issuedMonth = issuedMonth;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public BigDecimal getTaxNetAmount() {
        return taxNetAmount;
    }

    public void setTaxNetAmount(BigDecimal taxNetAmount) {
        this.taxNetAmount = taxNetAmount;
    }

    public BigDecimal getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(BigDecimal taxRate) {
        this.taxRate = taxRate;
    }

    public BigDecimal getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(BigDecimal taxAmount) {
        this.taxAmount = taxAmount;
    }

    public String getInvoiceMemo() {
        return invoiceMemo;
    }

    public void setInvoiceMemo(String invoiceMemo) {
        this.invoiceMemo = invoiceMemo;
    }

    public String getIssuer() {
        return issuer;
    }

    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    public String getReviewer() {
        return reviewer;
    }

    public void setReviewer(String reviewer) {
        this.reviewer = reviewer;
    }

    public String getInvoiceInvalidFlag() {
        return invoiceInvalidFlag;
    }

    public void setInvoiceInvalidFlag(String invoiceInvalidFlag) {
        this.invoiceInvalidFlag = invoiceInvalidFlag;
    }

    public String getInvoiceMergeResult() {
        return invoiceMergeResult;
    }

    public void setInvoiceMergeResult(String invoiceMergeResult) {
        this.invoiceMergeResult = invoiceMergeResult;
    }

    public Integer getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(Integer updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "DcflMergeInvoiceResult{" +
        ", documentNumber=" + documentNumber +
        ", keywords=" + keywords +
        ", contractNumber=" + contractNumber +
        ", invoiceCode=" + invoiceCode +
        ", invoiceNumber=" + invoiceNumber +
        ", invoiceTitle=" + invoiceTitle +
        ", taxRegistryNum=" + taxRegistryNum +
        ", invoiceObjectAddressPhone=" + invoiceObjectAddressPhone +
        ", invoiceObjectBankAccount=" + invoiceObjectBankAccount +
        ", issuedTime=" + issuedTime +
        ", issuedMonth=" + issuedMonth +
        ", totalAmount=" + totalAmount +
        ", taxNetAmount=" + taxNetAmount +
        ", taxRate=" + taxRate +
        ", taxAmount=" + taxAmount +
        ", invoiceMemo=" + invoiceMemo +
        ", issuer=" + issuer +
        ", reviewer=" + reviewer +
        ", invoiceInvalidFlag=" + invoiceInvalidFlag +
        ", invoiceMergeResult=" + invoiceMergeResult +
        ", createdBy=" + createdBy +
        ", createTime=" + createTime +
        ", updatedBy=" + updatedBy +
        ", updateTime=" + updateTime +
        "}";
    }
}
