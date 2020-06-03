package com.foryou.tax.invoiceapi.pojo.attachment;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 附件明细表
 * </p>
 *
 * @author raymon
 * @since 2020-03-27
 */

public class FyAttachmentDetail implements Serializable {

    private static final long serialVersionUID = 1L;


    private Integer attachmentId;
    /**
     * 附件来源
     */
    private String sourceTypeCode;
    /**
     * FY_ATTACHMENT_INFO表主键
     */
    private Integer sourcePkValue;
    /**
     * 附件格式
     */
    private String fileTypeCode;
    /**
     * 附件格式
     */
    private String mimeType;
    /**
     * 附件名称
     */
    private String attachmentName;
    /**
     * 附件大小
     */
    private Integer attachmentSize;
    /**
     * 附件路径
     */
    private String attachmentPath;

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


    public Integer getAttachmentId() {
        return attachmentId;
    }

    public void setAttachmentId(Integer attachmentId) {
        this.attachmentId = attachmentId;
    }

    public String getSourceTypeCode() {
        return sourceTypeCode;
    }

    public void setSourceTypeCode(String sourceTypeCode) {
        this.sourceTypeCode = sourceTypeCode;
    }

    public Integer getSourcePkValue() {
        return sourcePkValue;
    }

    public void setSourcePkValue(Integer sourcePkValue) {
        this.sourcePkValue = sourcePkValue;
    }

    public String getFileTypeCode() {
        return fileTypeCode;
    }

    public void setFileTypeCode(String fileTypeCode) {
        this.fileTypeCode = fileTypeCode;
    }

    public String getMimeType() {
        return mimeType;
    }

    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    public String getAttachmentName() {
        return attachmentName;
    }

    public void setAttachmentName(String attachmentName) {
        this.attachmentName = attachmentName;
    }

    public Integer getAttachmentSize() {
        return attachmentSize;
    }

    public void setAttachmentSize(Integer attachmentSize) {
        this.attachmentSize = attachmentSize;
    }

    public String getAttachmentPath() {
        return attachmentPath;
    }

    public void setAttachmentPath(String attachmentPath) {
        this.attachmentPath = attachmentPath;
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
        return "FyAttachmentDetail{" +
        ", attachmentId=" + attachmentId +
        ", sourceTypeCode=" + sourceTypeCode +
        ", sourcePkValue=" + sourcePkValue +
        ", fileTypeCode=" + fileTypeCode +
        ", mimeType=" + mimeType +
        ", attachmentName=" + attachmentName +
        ", attachmentSize=" + attachmentSize +
        ", attachmentPath=" + attachmentPath +
        ", createdBy=" + createdBy +
        ", createTime=" + createTime +
        ", updatedBy=" + updatedBy +
        ", updateTime=" + updateTime +
        "}";
    }
}
