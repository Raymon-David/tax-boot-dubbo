package com.foryou.tax.invoiceprovider.dao.quartz;

import com.foryou.tax.invoiceapi.pojo.quartz.TaskEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author ：Raymon
 * @date ：Created in 2020/4/21
 * @description:
 */
@Component
@Mapper
public interface TaskMapper {

    List<TaskEntity> findTaskList(TaskEntity taskEntity);
}
