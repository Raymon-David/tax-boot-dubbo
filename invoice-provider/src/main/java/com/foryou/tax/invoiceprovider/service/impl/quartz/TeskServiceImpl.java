package com.foryou.tax.invoiceprovider.service.impl.quartz;

import com.alibaba.dubbo.config.annotation.Service;
import com.foryou.tax.invoiceapi.pojo.quartz.TaskEntity;
import com.foryou.tax.invoiceapi.service.quartz.TaskService;
import com.foryou.tax.invoiceprovider.dao.quartz.TaskMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author ：Raymon
 * @date ：Created in 2020/4/21
 * @description:
 */
@Service(version = "${dubbo.service.version}",
        application = "${dubbo.application.id}",
        protocol = "${dubbo.protocol.id}",
        registry = "${dubbo.registry.id}"
)
public class TeskServiceImpl implements TaskService {

    @Autowired
    TaskMapper taskMapper;

    @Override
    public List<TaskEntity> findTaskList(TaskEntity taskEntity) {
        return taskMapper.findTaskList(taskEntity);
    }
}
