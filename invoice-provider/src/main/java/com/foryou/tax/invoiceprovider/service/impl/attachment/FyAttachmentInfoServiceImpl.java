package com.foryou.tax.invoiceprovider.service.impl.attachment;

import com.alibaba.dubbo.config.annotation.Service;
import com.foryou.tax.invoiceapi.pojo.attachment.FyAttachmentInfo;
import com.foryou.tax.invoiceapi.service.attachment.FyAttachmentInfoService;
import com.foryou.tax.invoiceprovider.dao.attachment.FyAttachmentInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * <p>
 * 附件表（关联表名） 服务实现类
 * </p>
 *
 * @author raymon
 * @since 2020-03-27
 */
@Service(version = "${dubbo.service.version}",
        application = "${dubbo.application.id}",
        protocol = "${dubbo.protocol.id}",
        registry = "${dubbo.registry.id}"
)
public class FyAttachmentInfoServiceImpl  implements FyAttachmentInfoService {

    @Autowired
    FyAttachmentInfoMapper fyAttachmentInfoMapper;

    @Override
    public int insertSelective(FyAttachmentInfo fyAttachmentInfo) {
        return fyAttachmentInfoMapper.insertSelective(fyAttachmentInfo);
    }

    @Override
    public FyAttachmentInfo selectByTablePkValue(FyAttachmentInfo fyAttachmentInfo) {
        return fyAttachmentInfoMapper.selectByTablePkValue(fyAttachmentInfo);
    }

    @Override
    public int updateByPrimaryKeySelective(FyAttachmentInfo fyAttachmentInfo) {
        return fyAttachmentInfoMapper.updateByPrimaryKeySelective(fyAttachmentInfo);
    }
}
