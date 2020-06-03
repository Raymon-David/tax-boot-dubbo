package com.foryou.tax.invoiceprovider.dao.attachment;

import com.foryou.tax.invoiceapi.pojo.attachment.FyAttachmentInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 附件表（关联表名） Mapper 接口
 * </p>
 *
 * @author raymon
 * @since 2020-03-27
 */
@Component
@Mapper
public interface FyAttachmentInfoMapper {

    int insertSelective(FyAttachmentInfo fyAttachmentInfo);

    FyAttachmentInfo selectByTablePkValue(FyAttachmentInfo fyAttachmentInfo);

    int updateByPrimaryKeySelective(FyAttachmentInfo fyAttachmentInfo);
}
