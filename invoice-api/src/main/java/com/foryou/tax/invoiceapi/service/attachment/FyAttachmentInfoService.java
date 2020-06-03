package com.foryou.tax.invoiceapi.service.attachment;


import com.foryou.tax.invoiceapi.pojo.attachment.FyAttachmentInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <p>
 * 附件表（关联表名） 服务类
 * </p>
 *
 * @author raymon
 * @since 2020-03-27
 */
public interface FyAttachmentInfoService {

    static final Logger log =  LoggerFactory.getLogger(FyAttachmentInfoService.class);

    int insertSelective(FyAttachmentInfo fyAttachmentInfo);

    FyAttachmentInfo selectByTablePkValue(FyAttachmentInfo fyAttachmentInfo);

    int updateByPrimaryKeySelective(FyAttachmentInfo fyAttachmentInfo);
}
