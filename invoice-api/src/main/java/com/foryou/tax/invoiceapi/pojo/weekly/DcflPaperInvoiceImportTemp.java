package com.foryou.tax.invoiceapi.pojo.weekly;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * <p>
 * 从页面导入纸质发票 临时表
 * </p>
 *
 * @author raymon
 * @since 2020-04-22
 */
public class DcflPaperInvoiceImportTemp implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 发票种类
     */
    private String billType;
    /**
     * 发票代码
     */
    private String invoiceCode;
    /**
     * 发票号
     */
    private String invoiceNumber;
    /**
     * 开票机号
     */
    private String billMachineNum;
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
     * 报送状态
     */
    private String submitType;
    /**
     * 报送日志
     */
    private String submitLog;
    /**
     * 所属月份
     */
    private String issuedMonth;
    /**
     * 含税金额 订单总价合计
     */
    private BigDecimal totalAmount;
    /**
     * 税率
     */
    private BigDecimal taxRate;
    /**
     * 税额 合计税额
     */
    private BigDecimal taxAmount;
    /**
     * 商品名称 主要商品名称
     */
    private String productName;
    /**
     * 商品税目
     */
    private String productTaxItem;
    /**
     * 备注
     */
    private String invoiceMemo;
    /**
     * 开票人
     */
    private String issuer;
    /**
     * 收款员
     */
    private String accountPayee;
    /**
     * 打印标志
     */
    private String printType;
    /**
     * 发票作废标志
     */
    private String invoiceInvalidFlag;
    /**
     * 清单标志
     */
    private String listType;
    /**
     * 修复标志
     */
    private String repareType;
    /**
     * 复核人
     */
    private String reviewer;
    /**
     * 销售部门
     */
    private String saleDepartment;
    /**
     * 作废时间
     */
    private Date invoiceInvalidDate;
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


    public String getBillType() {
        return billType;
    }

    public void setBillType(String billType) {
        this.billType = billType;
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

    public String getBillMachineNum() {
        return billMachineNum;
    }

    public void setBillMachineNum(String billMachineNum) {
        this.billMachineNum = billMachineNum;
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

    public String getSubmitType() {
        return submitType;
    }

    public void setSubmitType(String submitType) {
        this.submitType = submitType;
    }

    public String getSubmitLog() {
        return submitLog;
    }

    public void setSubmitLog(String submitLog) {
        this.submitLog = submitLog;
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

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductTaxItem() {
        return productTaxItem;
    }

    public void setProductTaxItem(String productTaxItem) {
        this.productTaxItem = productTaxItem;
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

    public String getAccountPayee() {
        return accountPayee;
    }

    public void setAccountPayee(String accountPayee) {
        this.accountPayee = accountPayee;
    }

    public String getPrintType() {
        return printType;
    }

    public void setPrintType(String printType) {
        this.printType = printType;
    }

    public String getInvoiceInvalidFlag() {
        return invoiceInvalidFlag;
    }

    public void setInvoiceInvalidFlag(String invoiceInvalidFlag) {
        this.invoiceInvalidFlag = invoiceInvalidFlag;
    }

    public String getListType() {
        return listType;
    }

    public void setListType(String listType) {
        this.listType = listType;
    }

    public String getRepareType() {
        return repareType;
    }

    public void setRepareType(String repareType) {
        this.repareType = repareType;
    }

    public String getReviewer() {
        return reviewer;
    }

    public void setReviewer(String reviewer) {
        this.reviewer = reviewer;
    }

    public String getSaleDepartment() {
        return saleDepartment;
    }

    public void setSaleDepartment(String saleDepartment) {
        this.saleDepartment = saleDepartment;
    }

    public Date getInvoiceInvalidDate() {
        return invoiceInvalidDate;
    }

    public void setInvoiceInvalidDate(Date invoiceInvalidDate) {
        this.invoiceInvalidDate = invoiceInvalidDate;
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
        return "DcflPaperInvoiceImportTemp{" +
        ", billType=" + billType +
        ", invoiceCode=" + invoiceCode +
        ", invoiceNumber=" + invoiceNumber +
        ", billMachineNum=" + billMachineNum +
        ", invoiceTitle=" + invoiceTitle +
        ", taxRegistryNum=" + taxRegistryNum +
        ", invoiceObjectAddressPhone=" + invoiceObjectAddressPhone +
        ", invoiceObjectBankAccount=" + invoiceObjectBankAccount +
        ", issuedTime=" + issuedTime +
        ", submitType=" + submitType +
        ", submitLog=" + submitLog +
        ", issuedMonth=" + issuedMonth +
        ", totalAmount=" + totalAmount +
        ", taxRate=" + taxRate +
        ", taxAmount=" + taxAmount +
        ", productName=" + productName +
        ", productTaxItem=" + productTaxItem +
        ", invoiceMemo=" + invoiceMemo +
        ", issuer=" + issuer +
        ", accountPayee=" + accountPayee +
        ", printType=" + printType +
        ", invoiceInvalidFlag=" + invoiceInvalidFlag +
        ", listType=" + listType +
        ", repareType=" + repareType +
        ", reviewer=" + reviewer +
        ", saleDepartment=" + saleDepartment +
        ", invoiceInvalidDate=" + invoiceInvalidDate +
        ", createdBy=" + createdBy +
        ", createTime=" + createTime +
        ", updatedBy=" + updatedBy +
        ", updateTime=" + updateTime +
        "}";
    }
}
