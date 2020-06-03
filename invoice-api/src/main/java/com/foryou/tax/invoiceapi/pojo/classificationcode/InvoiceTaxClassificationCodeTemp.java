package com.foryou.tax.invoiceapi.pojo.classificationcode;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 税收分类编码临时表
 * </p>
 *
 * @author raymon
 * @since 2020-03-31
 */
public class InvoiceTaxClassificationCodeTemp implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer classId;
    /**
     * 合同类型
     */
    private String contractType;

    private String contractTypeN;
    /**
     * 设备名称
     */
    private String division;

    private String divisionN;
    /**
     * 现金流项目
     */
    private String cfItem;

    private String cfItemN;
    /**
     * 现金流类型
     */
    private String cfType;

    private String cfTypeN;
    /**
     * 税收分类编码
     */
    private String taxClassNum;
    /**
     * 版本
     */
    private String goodsVersion;

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


    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public String getContractType() {
        return contractType;
    }

    public void setContractType(String contractType) {
        this.contractType = contractType;
    }

    public String getContractTypeN() {
        return contractTypeN;
    }

    public void setContractTypeN(String contractTypeN) {
        this.contractTypeN = contractTypeN;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public String getDivisionN() {
        return divisionN;
    }

    public void setDivisionN(String divisionN) {
        this.divisionN = divisionN;
    }

    public String getCfItem() {
        return cfItem;
    }

    public void setCfItem(String cfItem) {
        this.cfItem = cfItem;
    }

    public String getCfItemN() {
        return cfItemN;
    }

    public void setCfItemN(String cfItemN) {
        this.cfItemN = cfItemN;
    }

    public String getCfType() {
        return cfType;
    }

    public void setCfType(String cfType) {
        this.cfType = cfType;
    }

    public String getCfTypeN() {
        return cfTypeN;
    }

    public void setCfTypeN(String cfTypeN) {
        this.cfTypeN = cfTypeN;
    }

    public String getTaxClassNum() {
        return taxClassNum;
    }

    public void setTaxClassNum(String taxClassNum) {
        this.taxClassNum = taxClassNum;
    }

    public String getGoodsVersion() {
        return goodsVersion;
    }

    public void setGoodsVersion(String goodsVersion) {
        this.goodsVersion = goodsVersion;
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
        return "InvoiceTaxClassificationCodeTemp{" +
        ", classId=" + classId +
        ", contractType=" + contractType +
        ", contractTypeN=" + contractTypeN +
        ", division=" + division +
        ", divisionN=" + divisionN +
        ", cfItem=" + cfItem +
        ", cfItemN=" + cfItemN +
        ", cfType=" + cfType +
        ", cfTypeN=" + cfTypeN +
        ", taxClassNum=" + taxClassNum +
        ", goodsVersion=" + goodsVersion +
        ", createdBy=" + createdBy +
        ", createTime=" + createTime +
        ", updatedBy=" + updatedBy +
        ", updateTime=" + updateTime +
        "}";
    }
}
