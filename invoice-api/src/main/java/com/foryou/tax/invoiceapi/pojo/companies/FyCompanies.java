package com.foryou.tax.invoiceapi.pojo.companies;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 公司信息表
 * </p>
 *
 * @author raymon
 * @since 2020-03-24
 */
public class FyCompanies implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 公司id
     */
    private Integer companyId;
    /**
     * 公司code
     */
    private String companyCode;
    /**
     * 公司状态，默认 1 为存续
     */
    private Integer companyType;
    /**
     * 公司地址
     */
    private String companyAddress;
    /**
     * 公司电话
     */
    private String companyPhone;
    /**
     * 存续开始时间
     */
    private Date activeStartDate;
    /**
     * 存续结束时间
     */
    private Date activeEndDate;
    /**
     * 公司发票抬头
     */
    private String invoiceTitle;
    /**
     * 公司税收编码
     */
    private String taxRegistryNum;
    /**
     * 公司发票地址电话
     */
    private String invoiceCompanyAddressPhoneNum;
    /**
     * 公司账户所属银行
     */
    private String invoiceCompanyBankAccount;
    /**
     * 公司全称
     */
    private String companyFullName;
    /**
     * 公司简称
     */
    private String companyShortName;
    /**
     * 公司账号
     */
    private String companyBankAccountId;
    /**
     * 公司电子发票余量
     */
    private Integer companyEleMargin;
    /**
     * 公司电子合同id
     */
    private String companyCustomerId;

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


    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    public Integer getCompanyType() {
        return companyType;
    }

    public void setCompanyType(Integer companyType) {
        this.companyType = companyType;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }

    public String getCompanyPhone() {
        return companyPhone;
    }

    public void setCompanyPhone(String companyPhone) {
        this.companyPhone = companyPhone;
    }

    public Date getActiveStartDate() {
        return activeStartDate;
    }

    public void setActiveStartDate(Date activeStartDate) {
        this.activeStartDate = activeStartDate;
    }

    public Date getActiveEndDate() {
        return activeEndDate;
    }

    public void setActiveEndDate(Date activeEndDate) {
        this.activeEndDate = activeEndDate;
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

    public String getInvoiceCompanyAddressPhoneNum() {
        return invoiceCompanyAddressPhoneNum;
    }

    public void setInvoiceCompanyAddressPhoneNum(String invoiceCompanyAddressPhoneNum) {
        this.invoiceCompanyAddressPhoneNum = invoiceCompanyAddressPhoneNum;
    }

    public String getInvoiceCompanyBankAccount() {
        return invoiceCompanyBankAccount;
    }

    public void setInvoiceCompanyBankAccount(String invoiceCompanyBankAccount) {
        this.invoiceCompanyBankAccount = invoiceCompanyBankAccount;
    }

    public String getCompanyFullName() {
        return companyFullName;
    }

    public void setCompanyFullName(String companyFullName) {
        this.companyFullName = companyFullName;
    }

    public String getCompanyShortName() {
        return companyShortName;
    }

    public void setCompanyShortName(String companyShortName) {
        this.companyShortName = companyShortName;
    }

    public String getCompanyBankAccountId() {
        return companyBankAccountId;
    }

    public void setCompanyBankAccountId(String companyBankAccountId) {
        this.companyBankAccountId = companyBankAccountId;
    }

    public Integer getCompanyEleMargin() {
        return companyEleMargin;
    }

    public void setCompanyEleMargin(Integer companyEleMargin) {
        this.companyEleMargin = companyEleMargin;
    }

    public String getCompanyCustomerId() {
        return companyCustomerId;
    }

    public void setCompanyCustomerId(String companyCustomerId) {
        this.companyCustomerId = companyCustomerId;
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
        return "FyCompanies{" +
        ", companyId=" + companyId +
        ", companyCode=" + companyCode +
        ", companyType=" + companyType +
        ", companyAddress=" + companyAddress +
        ", companyPhone=" + companyPhone +
        ", activeStartDate=" + activeStartDate +
        ", activeEndDate=" + activeEndDate +
        ", invoiceTitle=" + invoiceTitle +
        ", taxRegistryNum=" + taxRegistryNum +
        ", invoiceCompanyAddressPhoneNum=" + invoiceCompanyAddressPhoneNum +
        ", invoiceCompanyBankAccount=" + invoiceCompanyBankAccount +
        ", companyFullName=" + companyFullName +
        ", companyShortName=" + companyShortName +
        ", companyBankAccountId=" + companyBankAccountId +
        ", companyEleMargin=" + companyEleMargin +
        ", companyCustomerId=" + companyCustomerId +
        ", createdBy=" + createdBy +
        ", createTime=" + createTime +
        ", updatedBy=" + updatedBy +
        ", updateTime=" + updateTime +
        "}";
    }
}
