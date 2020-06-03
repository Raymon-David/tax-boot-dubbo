package com.foryou.tax.invoiceprovider.service.impl.attachment;

import com.alibaba.dubbo.config.annotation.Service;
import com.foryou.tax.invoiceapi.pojo.attachment.FyAttachmentDetail;
import com.foryou.tax.invoiceapi.service.attachment.FyAttachmentDetailService;
import com.foryou.tax.invoiceprovider.dao.attachment.FyAttachmentDetailMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * <p>
 * 附件明细表 服务实现类
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
public class FyAttachmentDetailServiceImpl implements FyAttachmentDetailService {

    @Autowired
    FyAttachmentDetailMapper fyAttachmentDetailMapper;

    @Override
    public int insertSelective(FyAttachmentDetail fyAttachmentDetail) {
        return fyAttachmentDetailMapper.insertSelective(fyAttachmentDetail);
    }

    @Override
    public FyAttachmentDetail selectBySourcePkValue(FyAttachmentDetail fyAttachmentDetail) {
        return fyAttachmentDetailMapper.selectBySourcePkValue(fyAttachmentDetail);
    }
}
