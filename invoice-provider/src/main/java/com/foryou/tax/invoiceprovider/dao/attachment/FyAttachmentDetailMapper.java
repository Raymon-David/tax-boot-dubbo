package com.foryou.tax.invoiceprovider.dao.attachment;

import com.foryou.tax.invoiceapi.pojo.attachment.FyAttachmentDetail;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 附件明细表 Mapper 接口
 * </p>
 *
 * @author raymon
 * @since 2020-03-27
 */
@Component
@Mapper
public interface FyAttachmentDetailMapper  {

    int insertSelective(FyAttachmentDetail fyAttachmentDetail);

    FyAttachmentDetail selectBySourcePkValue(FyAttachmentDetail fyAttachmentDetail);
}
