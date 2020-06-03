package com.foryou.tax.invoiceapi.service.quartz;


import com.foryou.tax.invoiceapi.pojo.quartz.TaskEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public interface TaskService {

    static final Logger log =  LoggerFactory.getLogger(TaskService.class);

    List<TaskEntity> findTaskList(TaskEntity taskEntity);
}
