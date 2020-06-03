package com.foryou.tax.invoiceapi.service.attachment;

import com.foryou.tax.invoiceapi.pojo.attachment.FyAttachmentDetail;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <p>
 * 附件明细表 服务类
 * </p>
 *
 * @author raymon
 * @since 2020-03-27
 */
public interface FyAttachmentDetailService {

    static final Logger log =  LoggerFactory.getLogger(FyAttachmentDetailService.class);

    int insertSelective(FyAttachmentDetail fyAttachmentDetail);

    FyAttachmentDetail selectBySourcePkValue(FyAttachmentDetail fyAttachmentDetail);
}
