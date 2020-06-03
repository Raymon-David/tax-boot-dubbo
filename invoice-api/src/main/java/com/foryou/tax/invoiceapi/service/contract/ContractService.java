package com.foryou.tax.invoiceapi.service.contract;

import com.foryou.tax.invoiceapi.pojo.contract.ContractInfoPojo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * 查询合同信息
 * Created by raymon.
 */
public interface ContractService {

    static final Logger log =  LoggerFactory.getLogger(ContractService.class);

    List<ContractInfoPojo> queryContractInfoByRedis();

    ContractInfoPojo queryContractInfoByContractNO(ContractInfoPojo record);
}
