package com.foryou.tax.invoiceapi.pojo.invoiceobject;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 开票对象信息表
 * </p>
 *
 * @author raymon
 * @since 2020-03-23
 */
public class InvoiceObjectInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer invoiceObjectInfoId;
    /**
     * 开票对象code  IOI20201000001
     */
    private String objectCode;
    /**
     * 开票对象name
     */
    private String objectName;
    /**
     * 开票对象手机
     */
    private String objectPhone;
    /**
     * 身份证号
     */
    private String objectIdCard;
    /**
     * 统一信用代码
     */
    private String objectSocialCode;
    /**
     * 开票对象邮箱
     */
    private String objectEmail;
    /**
     * 开票对象类型code 01：企业 02：机关执业单位 03：个人 04：其他
     */
    private String objectTypeCode;
    /**
     * 开票对象类型name 01：企业 02：机关执业单位 03：个人 04：其他
     */
    private String objectTypeName;
    /**
     * 开票对象税收类型code 01：一般纳税人 02：小规模纳税人
     */
    private String objectTaxTypeCode;
    /**
     * 开票对象税收类型name 01：一般纳税人 02：小规模纳税人
     */
    private String objectTaxTypeName;
    /**
     * 税收编码
     */
    private String objectTaxRegistryNum;
    /**
     * 发票抬头
     */
    private String invoiceTitle;
    /**
     * 开票对象银行账号
     */
    private String invoiceObjectBankAccountNum;
    /**
     * 开票对象地址
     */
    private String invoiceObjectAddress;
    /**
     * 开票对象银行
     */
    private String invoiceObjectBank;
    /**
     * 发票手机
     */
    private String invoicePhone;
    /**
     * 发票邮箱
     */
    private String invoiceEmail;
    /**
     * 发票验证状态
     */
    private String invoiceInfoType;
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


    public Integer getInvoiceObjectInfoId() {
        return invoiceObjectInfoId;
    }

    public void setInvoiceObjectInfoId(Integer invoiceObjectInfoId) {
        this.invoiceObjectInfoId = invoiceObjectInfoId;
    }

    public String getObjectCode() {
        return objectCode;
    }

    public void setObjectCode(String objectCode) {
        this.objectCode = objectCode;
    }

    public String getObjectName() {
        return objectName;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    public String getObjectPhone() {
        return objectPhone;
    }

    public void setObjectPhone(String objectPhone) {
        this.objectPhone = objectPhone;
    }

    public String getObjectIdCard() {
        return objectIdCard;
    }

    public void setObjectIdCard(String objectIdCard) {
        this.objectIdCard = objectIdCard;
    }

    public String getObjectSocialCode() {
        return objectSocialCode;
    }

    public void setObjectSocialCode(String objectSocialCode) {
        this.objectSocialCode = objectSocialCode;
    }

    public String getObjectEmail() {
        return objectEmail;
    }

    public void setObjectEmail(String objectEmail) {
        this.objectEmail = objectEmail;
    }

    public String getObjectTypeCode() {
        return objectTypeCode;
    }

    public void setObjectTypeCode(String objectTypeCode) {
        this.objectTypeCode = objectTypeCode;
    }

    public String getObjectTypeName() {
        return objectTypeName;
    }

    public void setObjectTypeName(String objectTypeName) {
        this.objectTypeName = objectTypeName;
    }

    public String getObjectTaxTypeCode() {
        return objectTaxTypeCode;
    }

    public void setObjectTaxTypeCode(String objectTaxTypeCode) {
        this.objectTaxTypeCode = objectTaxTypeCode;
    }

    public String getObjectTaxTypeName() {
        return objectTaxTypeName;
    }

    public void setObjectTaxTypeName(String objectTaxTypeName) {
        this.objectTaxTypeName = objectTaxTypeName;
    }

    public String getObjectTaxRegistryNum() {
        return objectTaxRegistryNum;
    }

    public void setObjectTaxRegistryNum(String objectTaxRegistryNum) {
        this.objectTaxRegistryNum = objectTaxRegistryNum;
    }

    public String getInvoiceTitle() {
        return invoiceTitle;
    }

    public void setInvoiceTitle(String invoiceTitle) {
        this.invoiceTitle = invoiceTitle;
    }

    public String getInvoiceObjectBankAccountNum() {
        return invoiceObjectBankAccountNum;
    }

    public void setInvoiceObjectBankAccountNum(String invoiceObjectBankAccountNum) {
        this.invoiceObjectBankAccountNum = invoiceObjectBankAccountNum;
    }

    public String getInvoiceObjectAddress() {
        return invoiceObjectAddress;
    }

    public void setInvoiceObjectAddress(String invoiceObjectAddress) {
        this.invoiceObjectAddress = invoiceObjectAddress;
    }

    public String getInvoiceObjectBank() {
        return invoiceObjectBank;
    }

    public void setInvoiceObjectBank(String invoiceObjectBank) {
        this.invoiceObjectBank = invoiceObjectBank;
    }

    public String getInvoicePhone() {
        return invoicePhone;
    }

    public void setInvoicePhone(String invoicePhone) {
        this.invoicePhone = invoicePhone;
    }

    public String getInvoiceEmail() {
        return invoiceEmail;
    }

    public void setInvoiceEmail(String invoiceEmail) {
        this.invoiceEmail = invoiceEmail;
    }

    public String getInvoiceInfoType() {
        return invoiceInfoType;
    }

    public void setInvoiceInfoType(String invoiceInfoType) {
        this.invoiceInfoType = invoiceInfoType;
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
        return "InvoiceObjectInfo{" +
        ", invoiceObjectInfoId=" + invoiceObjectInfoId +
        ", objectCode=" + objectCode +
        ", objectName=" + objectName +
        ", objectPhone=" + objectPhone +
        ", objectIdCard=" + objectIdCard +
        ", objectSocialCode=" + objectSocialCode +
        ", objectEmail=" + objectEmail +
        ", objectTypeCode=" + objectTypeCode +
        ", objectTypeName=" + objectTypeName +
        ", objectTaxTypeCode=" + objectTaxTypeCode +
        ", objectTaxTypeName=" + objectTaxTypeName +
        ", objectTaxRegistryNum=" + objectTaxRegistryNum +
        ", invoiceTitle=" + invoiceTitle +
        ", invoiceObjectBankAccountNum=" + invoiceObjectBankAccountNum +
        ", invoiceObjectAddress=" + invoiceObjectAddress +
        ", invoiceObjectBank=" + invoiceObjectBank +
        ", invoicePhone=" + invoicePhone +
        ", invoiceEmail=" + invoiceEmail +
        ", invoiceInfoType=" + invoiceInfoType +
        ", createdBy=" + createdBy +
        ", createTime=" + createTime +
        ", updatedBy=" + updatedBy +
        ", updateTime=" + updateTime +
        "}";
    }
}
