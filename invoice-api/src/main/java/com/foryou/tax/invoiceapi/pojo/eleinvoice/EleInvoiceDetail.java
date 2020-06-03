package com.foryou.tax.invoiceapi.pojo.eleinvoice;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * <p>
 * 电子发票明细表
 * </p>
 *
 * @author raymon
 * @since 2020-03-23
 */
public class EleInvoiceDetail implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 电子发票明细表ID/PK
     */
    private Integer eleInvoiceDetailId;
    /**
     * 电子发票ID
     */
    private Integer eleInvoiceId;
    /**
     * 发票表ID
     */
    private Integer invoiceId;
    /**
     * 发票明细表ID
     */
    private Integer invoiceDetailId;
    /**
     * 合同号
     */
    private String contractNo;
    /**
     * 订单号
     */
    private String billNo;
    /**
     * 商品名称
     */
    private String billName;
    /**
     * 商品编号（税收分类编码）
     */
    private String billCode;
    /**
     * 发票行性质 0代表正常行
     */
    private String lineType;
    /**
     * 规格型号
     */
    private String spec;
    /**
     * 计量单位
     */
    private String unit;
    /**
     * 税率
     */
    private BigDecimal taxRate;
    /**
     * 数量
     */
    private Integer taxQuantity;
    /**
     * 单价
     */
    private BigDecimal taxPrice;
    /**
     * 含税金额
     */
    private BigDecimal totalAmount;
    /**
     * 税收优惠政策标志
     */
    private String yhzcbs;
    /**
     * 享受税收优惠政策内容
     */
    private String yhzcnr;
    /**
     * 零税率标识 空表示非0税率
     */
    private Integer lslbs;
    /**
     * 自行编码
     */
    private String zxbm;
    /**
     * 扣除额
     */
    private BigDecimal kce;
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


    public Integer getEleInvoiceDetailId() {
        return eleInvoiceDetailId;
    }

    public void setEleInvoiceDetailId(Integer eleInvoiceDetailId) {
        this.eleInvoiceDetailId = eleInvoiceDetailId;
    }

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

    public Integer getInvoiceDetailId() {
        return invoiceDetailId;
    }

    public void setInvoiceDetailId(Integer invoiceDetailId) {
        this.invoiceDetailId = invoiceDetailId;
    }

    public String getContractNo() {
        return contractNo;
    }

    public void setContractNo(String contractNo) {
        this.contractNo = contractNo;
    }

    public String getBillNo() {
        return billNo;
    }

    public void setBillNo(String billNo) {
        this.billNo = billNo;
    }

    public String getBillName() {
        return billName;
    }

    public void setBillName(String billName) {
        this.billName = billName;
    }

    public String getBillCode() {
        return billCode;
    }

    public void setBillCode(String billCode) {
        this.billCode = billCode;
    }

    public String getLineType() {
        return lineType;
    }

    public void setLineType(String lineType) {
        this.lineType = lineType;
    }

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public BigDecimal getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(BigDecimal taxRate) {
        this.taxRate = taxRate;
    }

    public Integer getTaxQuantity() {
        return taxQuantity;
    }

    public void setTaxQuantity(Integer taxQuantity) {
        this.taxQuantity = taxQuantity;
    }

    public BigDecimal getTaxPrice() {
        return taxPrice;
    }

    public void setTaxPrice(BigDecimal taxPrice) {
        this.taxPrice = taxPrice;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getYhzcbs() {
        return yhzcbs;
    }

    public void setYhzcbs(String yhzcbs) {
        this.yhzcbs = yhzcbs;
    }

    public String getYhzcnr() {
        return yhzcnr;
    }

    public void setYhzcnr(String yhzcnr) {
        this.yhzcnr = yhzcnr;
    }

    public Integer getLslbs() {
        return lslbs;
    }

    public void setLslbs(Integer lslbs) {
        this.lslbs = lslbs;
    }

    public String getZxbm() {
        return zxbm;
    }

    public void setZxbm(String zxbm) {
        this.zxbm = zxbm;
    }

    public BigDecimal getKce() {
        return kce;
    }

    public void setKce(BigDecimal kce) {
        this.kce = kce;
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
        return "EleInvoiceDetail{" +
                ", eleInvoiceDetailId=" + eleInvoiceDetailId +
                ", eleInvoiceId=" + eleInvoiceId +
                ", invoiceId=" + invoiceId +
                ", invoiceDetailId=" + invoiceDetailId +
                ", contractNo=" + contractNo +
                ", billNo=" + billNo +
                ", billName=" + billName +
                ", billCode=" + billCode +
                ", lineType=" + lineType +
                ", spec=" + spec +
                ", unit=" + unit +
                ", taxRate=" + taxRate +
                ", taxQuantity=" + taxQuantity +
                ", taxPrice=" + taxPrice +
                ", totalAmount=" + totalAmount +
                ", yhzcbs=" + yhzcbs +
                ", yhzcnr=" + yhzcnr +
                ", lslbs=" + lslbs +
                ", zxbm=" + zxbm +
                ", kce=" + kce +
                ", createdBy=" + createdBy +
                ", createTime=" + createTime +
                ", updatedBy=" + updatedBy +
                ", updateTime=" + updateTime +
                "}";
    }
}
