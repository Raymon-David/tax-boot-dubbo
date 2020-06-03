package com.foryou.tax.invoiceapi.service.weekly.writeoffinfo;

import com.foryou.tax.invoiceapi.pojo.weekly.writeoffinfo.WriteOffInfoTemp;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 核销事务查询临时表 服务类
 * </p>
 *
 * @author raymon
 * @since 2020-04-13
 */
public interface WriteOffInfoTempService{

    static final Logger log =  LoggerFactory.getLogger(WriteOffInfoTempService.class);

    int insertData(WriteOffInfoTemp writeOffInfoTemp);

    int backUpData(String newTableName);

    int deleteData();

    List<Map<String, Object>> writeOffInfoQueryWeekly();
}
