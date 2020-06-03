package com.foryou.tax.invoiceapi.pojo.eleinvoice;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 电子发票表
 * </p>
 *
 * @author raymon
 * @since 2020-03-18
 */
public class EleInvoiceInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 电子发票ID/PK
     */
    private Integer eleInvoiceId;
    /**
     * 发票表ID
     */
    private Integer invoiceId;
    /**
     * 单据类型
     */
    private String documentType;
    /**
     * 单据类别
     */
    private String documentCategory;
    /**
     * 流水号
     */
    private String serialNum;
    /**
     * 销方税号
     */
    private String saleTax;
    /**
     * 购方名称
     */
    private String custName;
    /**
     * 购方税号
     */
    private String custTaxNo;
    /**
     * 购方地址
     */
    private String custAddr;
    /**
     * 购货方手机号
     */
    private String custTelephone;
    /**
     * 购方固定电话
     */
    private String custPhone;
    /**
     * 购方邮箱
     */
    private String custEmail;
    /**
     * 开户行+账号
     */
    private String custBankAccount;
    /**
     * 购货方企业类型
     */
    private String custType;
    /**
     * 备注
     */
    private String eleInvoiceMemo;
    /**
     * 发票类型
     */
    private String eleInvoiceType;
    /**
     * 退货单号
     */
    private String cancelNum;
    /**
     * 开票类型
     */
    private String billType;
    /**
     * 特殊红冲标志
     */
    private String specialRedFlag;
    /**
     * 操作代码
     */
    private String operationCode;
    /**
     * 收款员
     */
    private String accountPayee;
    /**
     * 记账日期
     */
    private Date accountTime;
    /**
     * 开票人
     */
    private Integer issuer;
    /**
     * 开票日期
     */
    private Date issuedTime;
    /**
     * 复核人
     */
    private Integer reviewer;
    /**
     * 复核日期
     */
    private Date reviewedTime;
    /**
     * 原发票代码
     */
    private String formerInvoiceCode;
    /**
     * 原发票号码
     */
    private String formerInvoiceNum;
    /**
     * 电子发票状态CODE
     */
    private String eleInvoiceStatusCode;
    /**
     * 电子发票状态NAME
     */
    private String eleInvoiceStatusName;
    /**
     * 电子接口返回的pdf附件URL
     */
    private String pdfUrl;
    /**
     * 发票日期（金税可回传）
     */
    private Date invoiceDate;
    /**
     * 发票号（金税可回传）
     */
    private String invoiceNumber;
    /**
     * 发票代码（金税可回传）
     */
    private String invoiceCode;
    /**
     * 金税接口状态CODE（PENDING / TRANSFERED / BACK）
     */
    private String invoiceInterfaceStatusCode;
    /**
     * 金税接口状态NAME（PENDING-暂挂 / TRANSFERRED-已传金税 / BACK-金税已回写）
     */
    private String invoiceInterfaceStatusName;
    /**
     * 金税返回code
     */
    private String invoiceInterfaceTaxCode;
    /**
     * 金税返回message
     */
    private String invoiceInterfaceTaxMessage;
    /**
     * 发票取消标志 取消不通过金税，取消后返回到发票创建
     */
    private String invoiceCancelFlag;
    /**
     * 发票取消说明
     */
    private String invoiceCancelDesc;
    /**
     * 发票取消日期
     */
    private Date invoiceCancelDate;
    /**
     * 发票作废标志 通过金税，暂时只有纸票行为
     */
    private String invoiceInvalidFlag;
    /**
     * 发票作废说明
     */
    private String invoiceInvalidDesc;
    /**
     * 发票作废CODE
     */
    private String invoiceInvalidCode;
    /**
     * 发票作废NAME
     */
    private String invoiceInvalidName;
    /**
     * 金税返回作废code
     */
    private String invoiceInterfaceInvalidCode;
    /**
     * 金税返回作废message
     */
    private String invoiceInterfaceInvalidMessage;
    /**
     * 发票作废日期
     */
    private Date invoiceInvalidDate;
    /**
     * 发票反冲标志 通过金税，纸票的普票不能跨月，纸票的专票可以跨月；电票的普票和专票都可以跨月
     */
    private String invoiceReverseFlag;
    /**
     * 发票反冲说明
     */
    private String invoiceReverseDesc;
    /**
     * 发票反冲CODE N/未反冲 ，W/被反冲，R/反冲
     */
    private String invoiceReverseCode;
    /**
     * 发票反冲NAME
     */
    private String invoiceReverseName;
    /**
     * 金税返回反冲code
     */
    private String invoiceInterfaceReverseCode;
    /**
     * 金税返回反冲message
     */
    private String invoiceInterfaceReverseMessage;
    /**
     * 专用发票红票通知单号
     */
    private String invoiceRedNoticeNum;
    /**
     * 发票反冲日期
     */
    private Date invoiceReverseDate;
    /**
     * 创建人
     */
    private Integer createdBy;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 更新人
     */
    private Integer updatedBy;
    /**
     * 更新时间
     */
    private Date updateTime;


    public Integer getEleInvoiceId() {
        return eleInvoiceId;
    }

    public void setEleInvoiceId(Integer eleInvoiceId) {
        this.eleInvoiceId = eleInvoiceId;
    }

    public Integer getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(Integer invoiceId) {
        this.invoiceId = invoiceId;
    }

    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    public String getDocumentCategory() {
        return documentCategory;
    }

    public void setDocumentCategory(String documentCategory) {
        this.documentCategory = documentCategory;
    }

    public String getSerialNum() {
        return serialNum;
    }

    public void setSerialNum(String serialNum) {
        this.serialNum = serialNum;
    }

    public String getSaleTax() {
        return saleTax;
    }

    public void setSaleTax(String saleTax) {
        this.saleTax = saleTax;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getCustTaxNo() {
        return custTaxNo;
    }

    public void setCustTaxNo(String custTaxNo) {
        this.custTaxNo = custTaxNo;
    }

    public String getCustAddr() {
        return custAddr;
    }

    public void setCustAddr(String custAddr) {
        this.custAddr = custAddr;
    }

    public String getCustTelephone() {
        return custTelephone;
    }

    public void setCustTelephone(String custTelephone) {
        this.custTelephone = custTelephone;
    }

    public String getCustPhone() {
        return custPhone;
    }

    public void setCustPhone(String custPhone) {
        this.custPhone = custPhone;
    }

    public String getCustEmail() {
        return custEmail;
    }

    public void setCustEmail(String custEmail) {
        this.custEmail = custEmail;
    }

    public String getCustBankAccount() {
        return custBankAccount;
    }

    public void setCustBankAccount(String custBankAccount) {
        this.custBankAccount = custBankAccount;
    }

    public String getCustType() {
        return custType;
    }

    public void setCustType(String custType) {
        this.custType = custType;
    }

    public String getEleInvoiceMemo() {
        return eleInvoiceMemo;
    }

    public void setEleInvoiceMemo(String eleInvoiceMemo) {
        this.eleInvoiceMemo = eleInvoiceMemo;
    }

    public String getEleInvoiceType() {
        return eleInvoiceType;
    }

    public void setEleInvoiceType(String eleInvoiceType) {
        this.eleInvoiceType = eleInvoiceType;
    }

    public String getCancelNum() {
        return cancelNum;
    }

    public void setCancelNum(String cancelNum) {
        this.cancelNum = cancelNum;
    }

    public String getBillType() {
        return billType;
    }

    public void setBillType(String billType) {
        this.billType = billType;
    }

    public String getSpecialRedFlag() {
        return specialRedFlag;
    }

    public void setSpecialRedFlag(String specialRedFlag) {
        this.specialRedFlag = specialRedFlag;
    }

    public String getOperationCode() {
        return operationCode;
    }

    public void setOperationCode(String operationCode) {
        this.operationCode = operationCode;
    }

    public String getAccountPayee() {
        return accountPayee;
    }

    public void setAccountPayee(String accountPayee) {
        this.accountPayee = accountPayee;
    }

    public Date getAccountTime() {
        return accountTime;
    }

    public void setAccountTime(Date accountTime) {
        this.accountTime = accountTime;
    }

    public Integer getIssuer() {
        return issuer;
    }

    public void setIssuer(Integer issuer) {
        this.issuer = issuer;
    }

    public Date getIssuedTime() {
        return issuedTime;
    }

    public void setIssuedTime(Date issuedTime) {
        this.issuedTime = issuedTime;
    }

    public Integer getReviewer() {
        return reviewer;
    }

    public void setReviewer(Integer reviewer) {
        this.reviewer = reviewer;
    }

    public Date getReviewedTime() {
        return reviewedTime;
    }

    public void setReviewedTime(Date reviewedTime) {
        this.reviewedTime = reviewedTime;
    }

    public String getFormerInvoiceCode() {
        return formerInvoiceCode;
    }

    public void setFormerInvoiceCode(String formerInvoiceCode) {
        this.formerInvoiceCode = formerInvoiceCode;
    }

    public String getFormerInvoiceNum() {
        return formerInvoiceNum;
    }

    public void setFormerInvoiceNum(String formerInvoiceNum) {
        this.formerInvoiceNum = formerInvoiceNum;
    }

    public String getEleInvoiceStatusCode() {
        return eleInvoiceStatusCode;
    }

    public void setEleInvoiceStatusCode(String eleInvoiceStatusCode) {
        this.eleInvoiceStatusCode = eleInvoiceStatusCode;
    }

    public String getEleInvoiceStatusName() {
        return eleInvoiceStatusName;
    }

    public void setEleInvoiceStatusName(String eleInvoiceStatusName) {
        this.eleInvoiceStatusName = eleInvoiceStatusName;
    }

    public String getPdfUrl() {
        return pdfUrl;
    }

    public void setPdfUrl(String pdfUrl) {
        this.pdfUrl = pdfUrl;
    }

    public Date getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(Date invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public String getInvoiceCode() {
        return invoiceCode;
    }

    public void setInvoiceCode(String invoiceCode) {
        this.invoiceCode = invoiceCode;
    }

    public String getInvoiceInterfaceStatusCode() {
        return invoiceInterfaceStatusCode;
    }

    public void setInvoiceInterfaceStatusCode(String invoiceInterfaceStatusCode) {
        this.invoiceInterfaceStatusCode = invoiceInterfaceStatusCode;
    }

    public String getInvoiceInterfaceStatusName() {
        return invoiceInterfaceStatusName;
    }

    public void setInvoiceInterfaceStatusName(String invoiceInterfaceStatusName) {
        this.invoiceInterfaceStatusName = invoiceInterfaceStatusName;
    }

    public String getInvoiceInterfaceTaxCode() {
        return invoiceInterfaceTaxCode;
    }

    public void setInvoiceInterfaceTaxCode(String invoiceInterfaceTaxCode) {
        this.invoiceInterfaceTaxCode = invoiceInterfaceTaxCode;
    }

    public String getInvoiceInterfaceTaxMessage() {
        return invoiceInterfaceTaxMessage;
    }

    public void setInvoiceInterfaceTaxMessage(String invoiceInterfaceTaxMessage) {
        this.invoiceInterfaceTaxMessage = invoiceInterfaceTaxMessage;
    }

    public String getInvoiceCancelFlag() {
        return invoiceCancelFlag;
    }

    public void setInvoiceCancelFlag(String invoiceCancelFlag) {
        this.invoiceCancelFlag = invoiceCancelFlag;
    }

    public String getInvoiceCancelDesc() {
        return invoiceCancelDesc;
    }

    public void setInvoiceCancelDesc(String invoiceCancelDesc) {
        this.invoiceCancelDesc = invoiceCancelDesc;
    }

    public Date getInvoiceCancelDate() {
        return invoiceCancelDate;
    }

    public void setInvoiceCancelDate(Date invoiceCancelDate) {
        this.invoiceCancelDate = invoiceCancelDate;
    }

    public String getInvoiceInvalidFlag() {
        return invoiceInvalidFlag;
    }

    public void setInvoiceInvalidFlag(String invoiceInvalidFlag) {
        this.invoiceInvalidFlag = invoiceInvalidFlag;
    }

    public String getInvoiceInvalidDesc() {
        return invoiceInvalidDesc;
    }

    public void setInvoiceInvalidDesc(String invoiceInvalidDesc) {
        this.invoiceInvalidDesc = invoiceInvalidDesc;
    }

    public String getInvoiceInvalidCode() {
        return invoiceInvalidCode;
    }

    public void setInvoiceInvalidCode(String invoiceInvalidCode) {
        this.invoiceInvalidCode = invoiceInvalidCode;
    }

    public String getInvoiceInvalidName() {
        return invoiceInvalidName;
    }

    public void setInvoiceInvalidName(String invoiceInvalidName) {
        this.invoiceInvalidName = invoiceInvalidName;
    }

    public String getInvoiceInterfaceInvalidCode() {
        return invoiceInterfaceInvalidCode;
    }

    public void setInvoiceInterfaceInvalidCode(String invoiceInterfaceInvalidCode) {
        this.invoiceInterfaceInvalidCode = invoiceInterfaceInvalidCode;
    }

    public String getInvoiceInterfaceInvalidMessage() {
        return invoiceInterfaceInvalidMessage;
    }

    public void setInvoiceInterfaceInvalidMessage(String invoiceInterfaceInvalidMessage) {
        this.invoiceInterfaceInvalidMessage = invoiceInterfaceInvalidMessage;
    }

    public Date getInvoiceInvalidDate() {
        return invoiceInvalidDate;
    }

    public void setInvoiceInvalidDate(Date invoiceInvalidDate) {
        this.invoiceInvalidDate = invoiceInvalidDate;
    }

    public String getInvoiceReverseFlag() {
        return invoiceReverseFlag;
    }

    public void setInvoiceReverseFlag(String invoiceReverseFlag) {
        this.invoiceReverseFlag = invoiceReverseFlag;
    }

    public String getInvoiceReverseDesc() {
        return invoiceReverseDesc;
    }

    public void setInvoiceReverseDesc(String invoiceReverseDesc) {
        this.invoiceReverseDesc = invoiceReverseDesc;
    }

    public String getInvoiceReverseCode() {
        return invoiceReverseCode;
    }

    public void setInvoiceReverseCode(String invoiceReverseCode) {
        this.invoiceReverseCode = invoiceReverseCode;
    }

    public String getInvoiceReverseName() {
        return invoiceReverseName;
    }

    public void setInvoiceReverseName(String invoiceReverseName) {
        this.invoiceReverseName = invoiceReverseName;
    }

    public String getInvoiceInterfaceReverseCode() {
        return invoiceInterfaceReverseCode;
    }

    public void setInvoiceInterfaceReverseCode(String invoiceInterfaceReverseCode) {
        this.invoiceInterfaceReverseCode = invoiceInterfaceReverseCode;
    }

    public String getInvoiceInterfaceReverseMessage() {
        return invoiceInterfaceReverseMessage;
    }

    public void setInvoiceInterfaceReverseMessage(String invoiceInterfaceReverseMessage) {
        this.invoiceInterfaceReverseMessage = invoiceInterfaceReverseMessage;
    }

    public String getInvoiceRedNoticeNum() {
        return invoiceRedNoticeNum;
    }

    public void setInvoiceRedNoticeNum(String invoiceRedNoticeNum) {
        this.invoiceRedNoticeNum = invoiceRedNoticeNum;
    }

    public Date getInvoiceReverseDate() {
        return invoiceReverseDate;
    }

    public void setInvoiceReverseDate(Date invoiceReverseDate) {
        this.invoiceReverseDate = invoiceReverseDate;
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
        return "EleInvoiceInfo{" +
                ", eleInvoiceId=" + eleInvoiceId +
                ", invoiceId=" + invoiceId +
                ", documentType=" + documentType +
                ", documentCategory=" + documentCategory +
                ", serialNum=" + serialNum +
                ", saleTax=" + saleTax +
                ", custName=" + custName +
                ", custTaxNo=" + custTaxNo +
                ", custAddr=" + custAddr +
                ", custTelephone=" + custTelephone +
                ", custPhone=" + custPhone +
                ", custEmail=" + custEmail +
                ", custBankAccount=" + custBankAccount +
                ", custType=" + custType +
                ", eleInvoiceMemo=" + eleInvoiceMemo +
                ", eleInvoiceType=" + eleInvoiceType +
                ", cancelNum=" + cancelNum +
                ", billType=" + billType +
                ", specialRedFlag=" + specialRedFlag +
                ", operationCode=" + operationCode +
                ", accountPayee=" + accountPayee +
                ", accountTime=" + accountTime +
                ", issuer=" + issuer +
                ", issuedTime=" + issuedTime +
                ", reviewer=" + reviewer +
                ", reviewedTime=" + reviewedTime +
                ", formerInvoiceCode=" + formerInvoiceCode +
                ", formerInvoiceNum=" + formerInvoiceNum +
                ", eleInvoiceStatusCode=" + eleInvoiceStatusCode +
                ", eleInvoiceStatusName=" + eleInvoiceStatusName +
                ", pdfUrl=" + pdfUrl +
                ", invoiceDate=" + invoiceDate +
                ", invoiceNumber=" + invoiceNumber +
                ", invoiceCode=" + invoiceCode +
                ", invoiceInterfaceStatusCode=" + invoiceInterfaceStatusCode +
                ", invoiceInterfaceStatusName=" + invoiceInterfaceStatusName +
                ", invoiceInterfaceTaxCode=" + invoiceInterfaceTaxCode +
                ", invoiceInterfaceTaxMessage=" + invoiceInterfaceTaxMessage +
                ", invoiceCancelFlag=" + invoiceCancelFlag +
                ", invoiceCancelDesc=" + invoiceCancelDesc +
                ", invoiceCancelDate=" + invoiceCancelDate +
                ", invoiceInvalidFlag=" + invoiceInvalidFlag +
                ", invoiceInvalidDesc=" + invoiceInvalidDesc +
                ", invoiceInvalidCode=" + invoiceInvalidCode +
                ", invoiceInvalidName=" + invoiceInvalidName +
                ", invoiceInterfaceInvalidCode=" + invoiceInterfaceInvalidCode +
                ", invoiceInterfaceInvalidMessage=" + invoiceInterfaceInvalidMessage +
                ", invoiceInvalidDate=" + invoiceInvalidDate +
                ", invoiceReverseFlag=" + invoiceReverseFlag +
                ", invoiceReverseDesc=" + invoiceReverseDesc +
                ", invoiceReverseCode=" + invoiceReverseCode +
                ", invoiceReverseName=" + invoiceReverseName +
                ", invoiceInterfaceReverseCode=" + invoiceInterfaceReverseCode +
                ", invoiceInterfaceReverseMessage=" + invoiceInterfaceReverseMessage +
                ", invoiceRedNoticeNum=" + invoiceRedNoticeNum +
                ", invoiceReverseDate=" + invoiceReverseDate +
                ", createdBy=" + createdBy +
                ", createTime=" + createTime +
                ", updatedBy=" + updatedBy +
                ", updateTime=" + updateTime +
                "}";
    }
}
