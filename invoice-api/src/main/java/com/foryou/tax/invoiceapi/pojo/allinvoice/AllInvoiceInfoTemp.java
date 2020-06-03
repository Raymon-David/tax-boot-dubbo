package com.foryou.tax.invoiceapi.pojo.allinvoice;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * <p>
 * 发票总表临时表
 * </p>
 *
 * @author raymon
 * @since 2020-04-10
 */
public class AllInvoiceInfoTemp implements Serializable {

    private static final long serialVersionUID = 1L;


    private String companyId;

    private String projectId;

    private String projectNumber;

    private String projectName;

    private String contractId;

    private String contractNumber;

    private String contractName;

    private Date inceptionOfLease;

    private String contractStatus;

    private String contractStatusDesc;

    private String billingMethod;

    private String billingMethodDesc;

    private String billingObjectId;

    private String billingObjectCode;

    private String billingObjectName;

    private String billingObjectIdCard;

    private String objectTaxpayerType;

    private String objectTaxpayerTypeDesc;

    private String objectTaxRegistryNum;

    private String billObjectBpClass;

    private String billObjectBpClassDesc;

    private String taxTypeVat;

    private String description;

    private String invoiceTitle;

    private String invoiceBpAddressPhoneNum;

    private String invoiceBpBankAccount;

    private String taxRegistryNum;

    private String prjSearchTerm1;

    private String prjSearchTerm2;

    private String conSearchTerm1;

    private String conSearchTerm2;

    private String documentType;

    private String bpName;

    private String cashflowId;

    private String cfItem;

    private String cfItemDesc;

    private String times;

    private Date lastReceivedDate;

    private Date dueDate;

    private BigDecimal dueAmount;

    private BigDecimal principal;

    private BigDecimal interest;

    private BigDecimal receivedAmount;

    private BigDecimal receivedPrincipal;

    private BigDecimal receivedInterest;

    private BigDecimal notreceivedAmount;

    private BigDecimal notreceivedPrincipal;

    private BigDecimal notreceivedInterest;

    private BigDecimal billingAmount;

    private BigDecimal billingPrincipal;

    private BigDecimal billingInterest;

    private BigDecimal notbillingAmount;

    private BigDecimal notbillingPrincipal;

    private BigDecimal notbillingInterest;

    private BigDecimal vatDueAmount;

    private BigDecimal vatPrincipal;

    private BigDecimal vatInterest;

    private BigDecimal netDueAmount;

    private BigDecimal netPrincipal;

    private BigDecimal netInterest;

    private String currency;

    private String currencyDesc;

    private String exchangeRate;

    private String exchangeRateType;

    private String exchangeRateTypeDesc;

    private String exchangeRateQuotation;

    private String exchangeRateQuotationDesc;

    private String leaseChannelDesc;

    private String businessType;

    private String businessTypeDesc;

    private String division;

    private String divisionDesc;

    private String billingFrequency;

    private String billingFrequencyN;

    private String billingWay;

    private String billingWayN;

    private BigDecimal needBillingAmount;

    private String invBillingObjectName;

    private String smallScaleTaxpayer;

    private String invoiceInfoConfirm;

    private String invoiceInfoConfirmDesc;

    private Date lastWriteOffDate;

    private String expeditedFlag;

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


    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getProjectNumber() {
        return projectNumber;
    }

    public void setProjectNumber(String projectNumber) {
        this.projectNumber = projectNumber;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getContractId() {
        return contractId;
    }

    public void setContractId(String contractId) {
        this.contractId = contractId;
    }

    public String getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }

    public String getContractName() {
        return contractName;
    }

    public void setContractName(String contractName) {
        this.contractName = contractName;
    }

    public Date getInceptionOfLease() {
        return inceptionOfLease;
    }

    public void setInceptionOfLease(Date inceptionOfLease) {
        this.inceptionOfLease = inceptionOfLease;
    }

    public String getContractStatus() {
        return contractStatus;
    }

    public void setContractStatus(String contractStatus) {
        this.contractStatus = contractStatus;
    }

    public String getContractStatusDesc() {
        return contractStatusDesc;
    }

    public void setContractStatusDesc(String contractStatusDesc) {
        this.contractStatusDesc = contractStatusDesc;
    }

    public String getBillingMethod() {
        return billingMethod;
    }

    public void setBillingMethod(String billingMethod) {
        this.billingMethod = billingMethod;
    }

    public String getBillingMethodDesc() {
        return billingMethodDesc;
    }

    public void setBillingMethodDesc(String billingMethodDesc) {
        this.billingMethodDesc = billingMethodDesc;
    }

    public String getBillingObjectId() {
        return billingObjectId;
    }

    public void setBillingObjectId(String billingObjectId) {
        this.billingObjectId = billingObjectId;
    }

    public String getBillingObjectCode() {
        return billingObjectCode;
    }

    public void setBillingObjectCode(String billingObjectCode) {
        this.billingObjectCode = billingObjectCode;
    }

    public String getBillingObjectName() {
        return billingObjectName;
    }

    public void setBillingObjectName(String billingObjectName) {
        this.billingObjectName = billingObjectName;
    }

    public String getBillingObjectIdCard() {
        return billingObjectIdCard;
    }

    public void setBillingObjectIdCard(String billingObjectIdCard) {
        this.billingObjectIdCard = billingObjectIdCard;
    }

    public String getObjectTaxpayerType() {
        return objectTaxpayerType;
    }

    public void setObjectTaxpayerType(String objectTaxpayerType) {
        this.objectTaxpayerType = objectTaxpayerType;
    }

    public String getObjectTaxpayerTypeDesc() {
        return objectTaxpayerTypeDesc;
    }

    public void setObjectTaxpayerTypeDesc(String objectTaxpayerTypeDesc) {
        this.objectTaxpayerTypeDesc = objectTaxpayerTypeDesc;
    }

    public String getObjectTaxRegistryNum() {
        return objectTaxRegistryNum;
    }

    public void setObjectTaxRegistryNum(String objectTaxRegistryNum) {
        this.objectTaxRegistryNum = objectTaxRegistryNum;
    }

    public String getBillObjectBpClass() {
        return billObjectBpClass;
    }

    public void setBillObjectBpClass(String billObjectBpClass) {
        this.billObjectBpClass = billObjectBpClass;
    }

    public String getBillObjectBpClassDesc() {
        return billObjectBpClassDesc;
    }

    public void setBillObjectBpClassDesc(String billObjectBpClassDesc) {
        this.billObjectBpClassDesc = billObjectBpClassDesc;
    }

    public String getTaxTypeVat() {
        return taxTypeVat;
    }

    public void setTaxTypeVat(String taxTypeVat) {
        this.taxTypeVat = taxTypeVat;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getInvoiceTitle() {
        return invoiceTitle;
    }

    public void setInvoiceTitle(String invoiceTitle) {
        this.invoiceTitle = invoiceTitle;
    }

    public String getInvoiceBpAddressPhoneNum() {
        return invoiceBpAddressPhoneNum;
    }

    public void setInvoiceBpAddressPhoneNum(String invoiceBpAddressPhoneNum) {
        this.invoiceBpAddressPhoneNum = invoiceBpAddressPhoneNum;
    }

    public String getInvoiceBpBankAccount() {
        return invoiceBpBankAccount;
    }

    public void setInvoiceBpBankAccount(String invoiceBpBankAccount) {
        this.invoiceBpBankAccount = invoiceBpBankAccount;
    }

    public String getTaxRegistryNum() {
        return taxRegistryNum;
    }

    public void setTaxRegistryNum(String taxRegistryNum) {
        this.taxRegistryNum = taxRegistryNum;
    }

    public String getPrjSearchTerm1() {
        return prjSearchTerm1;
    }

    public void setPrjSearchTerm1(String prjSearchTerm1) {
        this.prjSearchTerm1 = prjSearchTerm1;
    }

    public String getPrjSearchTerm2() {
        return prjSearchTerm2;
    }

    public void setPrjSearchTerm2(String prjSearchTerm2) {
        this.prjSearchTerm2 = prjSearchTerm2;
    }

    public String getConSearchTerm1() {
        return conSearchTerm1;
    }

    public void setConSearchTerm1(String conSearchTerm1) {
        this.conSearchTerm1 = conSearchTerm1;
    }

    public String getConSearchTerm2() {
        return conSearchTerm2;
    }

    public void setConSearchTerm2(String conSearchTerm2) {
        this.conSearchTerm2 = conSearchTerm2;
    }

    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    public String getBpName() {
        return bpName;
    }

    public void setBpName(String bpName) {
        this.bpName = bpName;
    }

    public String getCashflowId() {
        return cashflowId;
    }

    public void setCashflowId(String cashflowId) {
        this.cashflowId = cashflowId;
    }

    public String getCfItem() {
        return cfItem;
    }

    public void setCfItem(String cfItem) {
        this.cfItem = cfItem;
    }

    public String getCfItemDesc() {
        return cfItemDesc;
    }

    public void setCfItemDesc(String cfItemDesc) {
        this.cfItemDesc = cfItemDesc;
    }

    public String getTimes() {
        return times;
    }

    public void setTimes(String times) {
        this.times = times;
    }

    public Date getLastReceivedDate() {
        return lastReceivedDate;
    }

    public void setLastReceivedDate(Date lastReceivedDate) {
        this.lastReceivedDate = lastReceivedDate;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public BigDecimal getDueAmount() {
        return dueAmount;
    }

    public void setDueAmount(BigDecimal dueAmount) {
        this.dueAmount = dueAmount;
    }

    public BigDecimal getPrincipal() {
        return principal;
    }

    public void setPrincipal(BigDecimal principal) {
        this.principal = principal;
    }

    public BigDecimal getInterest() {
        return interest;
    }

    public void setInterest(BigDecimal interest) {
        this.interest = interest;
    }

    public BigDecimal getReceivedAmount() {
        return receivedAmount;
    }

    public void setReceivedAmount(BigDecimal receivedAmount) {
        this.receivedAmount = receivedAmount;
    }

    public BigDecimal getReceivedPrincipal() {
        return receivedPrincipal;
    }

    public void setReceivedPrincipal(BigDecimal receivedPrincipal) {
        this.receivedPrincipal = receivedPrincipal;
    }

    public BigDecimal getReceivedInterest() {
        return receivedInterest;
    }

    public void setReceivedInterest(BigDecimal receivedInterest) {
        this.receivedInterest = receivedInterest;
    }

    public BigDecimal getNotreceivedAmount() {
        return notreceivedAmount;
    }

    public void setNotreceivedAmount(BigDecimal notreceivedAmount) {
        this.notreceivedAmount = notreceivedAmount;
    }

    public BigDecimal getNotreceivedPrincipal() {
        return notreceivedPrincipal;
    }

    public void setNotreceivedPrincipal(BigDecimal notreceivedPrincipal) {
        this.notreceivedPrincipal = notreceivedPrincipal;
    }

    public BigDecimal getNotreceivedInterest() {
        return notreceivedInterest;
    }

    public void setNotreceivedInterest(BigDecimal notreceivedInterest) {
        this.notreceivedInterest = notreceivedInterest;
    }

    public BigDecimal getBillingAmount() {
        return billingAmount;
    }

    public void setBillingAmount(BigDecimal billingAmount) {
        this.billingAmount = billingAmount;
    }

    public BigDecimal getBillingPrincipal() {
        return billingPrincipal;
    }

    public void setBillingPrincipal(BigDecimal billingPrincipal) {
        this.billingPrincipal = billingPrincipal;
    }

    public BigDecimal getBillingInterest() {
        return billingInterest;
    }

    public void setBillingInterest(BigDecimal billingInterest) {
        this.billingInterest = billingInterest;
    }

    public BigDecimal getNotbillingAmount() {
        return notbillingAmount;
    }

    public void setNotbillingAmount(BigDecimal notbillingAmount) {
        this.notbillingAmount = notbillingAmount;
    }

    public BigDecimal getNotbillingPrincipal() {
        return notbillingPrincipal;
    }

    public void setNotbillingPrincipal(BigDecimal notbillingPrincipal) {
        this.notbillingPrincipal = notbillingPrincipal;
    }

    public BigDecimal getNotbillingInterest() {
        return notbillingInterest;
    }

    public void setNotbillingInterest(BigDecimal notbillingInterest) {
        this.notbillingInterest = notbillingInterest;
    }

    public BigDecimal getVatDueAmount() {
        return vatDueAmount;
    }

    public void setVatDueAmount(BigDecimal vatDueAmount) {
        this.vatDueAmount = vatDueAmount;
    }

    public BigDecimal getVatPrincipal() {
        return vatPrincipal;
    }

    public void setVatPrincipal(BigDecimal vatPrincipal) {
        this.vatPrincipal = vatPrincipal;
    }

    public BigDecimal getVatInterest() {
        return vatInterest;
    }

    public void setVatInterest(BigDecimal vatInterest) {
        this.vatInterest = vatInterest;
    }

    public BigDecimal getNetDueAmount() {
        return netDueAmount;
    }

    public void setNetDueAmount(BigDecimal netDueAmount) {
        this.netDueAmount = netDueAmount;
    }

    public BigDecimal getNetPrincipal() {
        return netPrincipal;
    }

    public void setNetPrincipal(BigDecimal netPrincipal) {
        this.netPrincipal = netPrincipal;
    }

    public BigDecimal getNetInterest() {
        return netInterest;
    }

    public void setNetInterest(BigDecimal netInterest) {
        this.netInterest = netInterest;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getCurrencyDesc() {
        return currencyDesc;
    }

    public void setCurrencyDesc(String currencyDesc) {
        this.currencyDesc = currencyDesc;
    }

    public String getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(String exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public String getExchangeRateType() {
        return exchangeRateType;
    }

    public void setExchangeRateType(String exchangeRateType) {
        this.exchangeRateType = exchangeRateType;
    }

    public String getExchangeRateTypeDesc() {
        return exchangeRateTypeDesc;
    }

    public void setExchangeRateTypeDesc(String exchangeRateTypeDesc) {
        this.exchangeRateTypeDesc = exchangeRateTypeDesc;
    }

    public String getExchangeRateQuotation() {
        return exchangeRateQuotation;
    }

    public void setExchangeRateQuotation(String exchangeRateQuotation) {
        this.exchangeRateQuotation = exchangeRateQuotation;
    }

    public String getExchangeRateQuotationDesc() {
        return exchangeRateQuotationDesc;
    }

    public void setExchangeRateQuotationDesc(String exchangeRateQuotationDesc) {
        this.exchangeRateQuotationDesc = exchangeRateQuotationDesc;
    }

    public String getLeaseChannelDesc() {
        return leaseChannelDesc;
    }

    public void setLeaseChannelDesc(String leaseChannelDesc) {
        this.leaseChannelDesc = leaseChannelDesc;
    }

    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }

    public String getBusinessTypeDesc() {
        return businessTypeDesc;
    }

    public void setBusinessTypeDesc(String businessTypeDesc) {
        this.businessTypeDesc = businessTypeDesc;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public String getDivisionDesc() {
        return divisionDesc;
    }

    public void setDivisionDesc(String divisionDesc) {
        this.divisionDesc = divisionDesc;
    }

    public String getBillingFrequency() {
        return billingFrequency;
    }

    public void setBillingFrequency(String billingFrequency) {
        this.billingFrequency = billingFrequency;
    }

    public String getBillingFrequencyN() {
        return billingFrequencyN;
    }

    public void setBillingFrequencyN(String billingFrequencyN) {
        this.billingFrequencyN = billingFrequencyN;
    }

    public String getBillingWay() {
        return billingWay;
    }

    public void setBillingWay(String billingWay) {
        this.billingWay = billingWay;
    }

    public String getBillingWayN() {
        return billingWayN;
    }

    public void setBillingWayN(String billingWayN) {
        this.billingWayN = billingWayN;
    }

    public BigDecimal getNeedBillingAmount() {
        return needBillingAmount;
    }

    public void setNeedBillingAmount(BigDecimal needBillingAmount) {
        this.needBillingAmount = needBillingAmount;
    }

    public String getInvBillingObjectName() {
        return invBillingObjectName;
    }

    public void setInvBillingObjectName(String invBillingObjectName) {
        this.invBillingObjectName = invBillingObjectName;
    }

    public String getSmallScaleTaxpayer() {
        return smallScaleTaxpayer;
    }

    public void setSmallScaleTaxpayer(String smallScaleTaxpayer) {
        this.smallScaleTaxpayer = smallScaleTaxpayer;
    }

    public String getInvoiceInfoConfirm() {
        return invoiceInfoConfirm;
    }

    public void setInvoiceInfoConfirm(String invoiceInfoConfirm) {
        this.invoiceInfoConfirm = invoiceInfoConfirm;
    }

    public String getInvoiceInfoConfirmDesc() {
        return invoiceInfoConfirmDesc;
    }

    public void setInvoiceInfoConfirmDesc(String invoiceInfoConfirmDesc) {
        this.invoiceInfoConfirmDesc = invoiceInfoConfirmDesc;
    }

    public Date getLastWriteOffDate() {
        return lastWriteOffDate;
    }

    public void setLastWriteOffDate(Date lastWriteOffDate) {
        this.lastWriteOffDate = lastWriteOffDate;
    }

    public String getExpeditedFlag() {
        return expeditedFlag;
    }

    public void setExpeditedFlag(String expeditedFlag) {
        this.expeditedFlag = expeditedFlag;
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
        return "AllInvoiceInfoTemp{" +
                ", companyId=" + companyId +
                ", projectId=" + projectId +
                ", projectNumber=" + projectNumber +
                ", projectName=" + projectName +
                ", contractId=" + contractId +
                ", contractNumber=" + contractNumber +
                ", contractName=" + contractName +
                ", inceptionOfLease=" + inceptionOfLease +
                ", contractStatus=" + contractStatus +
                ", contractStatusDesc=" + contractStatusDesc +
                ", billingMethod=" + billingMethod +
                ", billingMethodDesc=" + billingMethodDesc +
                ", billingObjectId=" + billingObjectId +
                ", billingObjectCode=" + billingObjectCode +
                ", billingObjectName=" + billingObjectName +
                ", billingObjectIdCard=" + billingObjectIdCard +
                ", objectTaxpayerType=" + objectTaxpayerType +
                ", objectTaxpayerTypeDesc=" + objectTaxpayerTypeDesc +
                ", objectTaxRegistryNum=" + objectTaxRegistryNum +
                ", billObjectBpClass=" + billObjectBpClass +
                ", billObjectBpClassDesc=" + billObjectBpClassDesc +
                ", taxTypeVat=" + taxTypeVat +
                ", description=" + description +
                ", invoiceTitle=" + invoiceTitle +
                ", invoiceBpAddressPhoneNum=" + invoiceBpAddressPhoneNum +
                ", invoiceBpBankAccount=" + invoiceBpBankAccount +
                ", taxRegistryNum=" + taxRegistryNum +
                ", prjSearchTerm1=" + prjSearchTerm1 +
                ", prjSearchTerm2=" + prjSearchTerm2 +
                ", conSearchTerm1=" + conSearchTerm1 +
                ", conSearchTerm2=" + conSearchTerm2 +
                ", documentType=" + documentType +
                ", bpName=" + bpName +
                ", cashflowId=" + cashflowId +
                ", cfItem=" + cfItem +
                ", cfItemDesc=" + cfItemDesc +
                ", times=" + times +
                ", lastReceivedDate=" + lastReceivedDate +
                ", dueDate=" + dueDate +
                ", dueAmount=" + dueAmount +
                ", principal=" + principal +
                ", interest=" + interest +
                ", receivedAmount=" + receivedAmount +
                ", receivedPrincipal=" + receivedPrincipal +
                ", receivedInterest=" + receivedInterest +
                ", notreceivedAmount=" + notreceivedAmount +
                ", notreceivedPrincipal=" + notreceivedPrincipal +
                ", notreceivedInterest=" + notreceivedInterest +
                ", billingAmount=" + billingAmount +
                ", billingPrincipal=" + billingPrincipal +
                ", billingInterest=" + billingInterest +
                ", notbillingAmount=" + notbillingAmount +
                ", notbillingPrincipal=" + notbillingPrincipal +
                ", notbillingInterest=" + notbillingInterest +
                ", vatDueAmount=" + vatDueAmount +
                ", vatPrincipal=" + vatPrincipal +
                ", vatInterest=" + vatInterest +
                ", netDueAmount=" + netDueAmount +
                ", netPrincipal=" + netPrincipal +
                ", netInterest=" + netInterest +
                ", currency=" + currency +
                ", currencyDesc=" + currencyDesc +
                ", exchangeRate=" + exchangeRate +
                ", exchangeRateType=" + exchangeRateType +
                ", exchangeRateTypeDesc=" + exchangeRateTypeDesc +
                ", exchangeRateQuotation=" + exchangeRateQuotation +
                ", exchangeRateQuotationDesc=" + exchangeRateQuotationDesc +
                ", leaseChannelDesc=" + leaseChannelDesc +
                ", businessType=" + businessType +
                ", businessTypeDesc=" + businessTypeDesc +
                ", division=" + division +
                ", divisionDesc=" + divisionDesc +
                ", billingFrequency=" + billingFrequency +
                ", billingFrequencyN=" + billingFrequencyN +
                ", billingWay=" + billingWay +
                ", billingWayN=" + billingWayN +
                ", needBillingAmount=" + needBillingAmount +
                ", invBillingObjectName=" + invBillingObjectName +
                ", smallScaleTaxpayer=" + smallScaleTaxpayer +
                ", invoiceInfoConfirm=" + invoiceInfoConfirm +
                ", invoiceInfoConfirmDesc=" + invoiceInfoConfirmDesc +
                ", lastWriteOffDate=" + lastWriteOffDate +
                ", expeditedFlag=" + expeditedFlag +
                ", createdBy=" + createdBy +
                ", createTime=" + createTime +
                ", updatedBy=" + updatedBy +
                ", updateTime=" + updateTime +
                "}";
    }
}
