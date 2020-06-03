package com.foryou.tax.invoiceapi.pojo.allinvoice;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * <p>
 * 发票明细表
 * </p>
 *
 * @author raymon
 * @since 2020-03-24
 */
public class AllInvoiceDetail implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 发票明细表ID/PK
     */
    private Integer invoiceDetailId;
    /**
     * 发票表ID
     */
    private Integer invoiceId;
    /**
     * 现金流ID
     */
    private Integer cashflowId;
    /**
     * 现金流项目CODE
     */
    private String cashflowItemCode;
    /**
     * 商品ID
     */
    private Integer productId;
    /**
     * 商品名称
     */
    private String productName;
    /**
     * 规格型号
     */
    private String spec;
    /**
     * 数量
     */
    private Integer taxQuantity;
    /**
     * 计量单位
     */
    private String unit;
    /**
     * 含税单价
     */
    private BigDecimal taxPrice;
    /**
     * 不含税单价
     */
    private BigDecimal taxNetPrice;
    /**
     * 税种
     */
    private String taxType;
    /**
     * 税率
     */
    private Integer taxRate;
    /**
     * 含税标志
     */
    private String taxIncludedFlag;
    /**
     * 含税金额
     */
    private BigDecimal totalAmount;
    /**
     * 税额
     */
    private BigDecimal taxAmount;
    /**
     * 不含税金额
     */
    private BigDecimal taxNetAmount;
    /**
     * 行备注/行摘要
     */
    private String invoiceDetailMemo;

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


    public Integer getInvoiceDetailId() {
        return invoiceDetailId;
    }

    public void setInvoiceDetailId(Integer invoiceDetailId) {
        this.invoiceDetailId = invoiceDetailId;
    }

    public Integer getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(Integer invoiceId) {
        this.invoiceId = invoiceId;
    }

    public Integer getCashflowId() {
        return cashflowId;
    }

    public void setCashflowId(Integer cashflowId) {
        this.cashflowId = cashflowId;
    }

    public String getCashflowItemCode() {
        return cashflowItemCode;
    }

    public void setCashflowItemCode(String cashflowItemCode) {
        this.cashflowItemCode = cashflowItemCode;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }

    public Integer getTaxQuantity() {
        return taxQuantity;
    }

    public void setTaxQuantity(Integer taxQuantity) {
        this.taxQuantity = taxQuantity;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public BigDecimal getTaxPrice() {
        return taxPrice;
    }

    public void setTaxPrice(BigDecimal taxPrice) {
        this.taxPrice = taxPrice;
    }

    public BigDecimal getTaxNetPrice() {
        return taxNetPrice;
    }

    public void setTaxNetPrice(BigDecimal taxNetPrice) {
        this.taxNetPrice = taxNetPrice;
    }

    public String getTaxType() {
        return taxType;
    }

    public void setTaxType(String taxType) {
        this.taxType = taxType;
    }

    public Integer getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(Integer taxRate) {
        this.taxRate = taxRate;
    }

    public String getTaxIncludedFlag() {
        return taxIncludedFlag;
    }

    public void setTaxIncludedFlag(String taxIncludedFlag) {
        this.taxIncludedFlag = taxIncludedFlag;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public BigDecimal getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(BigDecimal taxAmount) {
        this.taxAmount = taxAmount;
    }

    public BigDecimal getTaxNetAmount() {
        return taxNetAmount;
    }

    public void setTaxNetAmount(BigDecimal taxNetAmount) {
        this.taxNetAmount = taxNetAmount;
    }

    public String getInvoiceDetailMemo() {
        return invoiceDetailMemo;
    }

    public void setInvoiceDetailMemo(String invoiceDetailMemo) {
        this.invoiceDetailMemo = invoiceDetailMemo;
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
        return "AllInvoiceDetatil{" +
                ", invoiceDetailId=" + invoiceDetailId +
                ", invoiceId=" + invoiceId +
                ", cashflowId=" + cashflowId +
                ", cashflowItemCode=" + cashflowItemCode +
                ", productId=" + productId +
                ", productName=" + productName +
                ", spec=" + spec +
                ", taxQuantity=" + taxQuantity +
                ", unit=" + unit +
                ", taxPrice=" + taxPrice +
                ", taxNetPrice=" + taxNetPrice +
                ", taxType=" + taxType +
                ", taxRate=" + taxRate +
                ", taxIncludedFlag=" + taxIncludedFlag +
                ", totalAmount=" + totalAmount +
                ", taxAmount=" + taxAmount +
                ", taxNetAmount=" + taxNetAmount +
                ", invoiceDetailMemo=" + invoiceDetailMemo +
                ", createdBy=" + createdBy +
                ", createTime=" + createTime +
                ", updatedBy=" + updatedBy +
                ", updateTime=" + updateTime +
                "}";
    }
}
