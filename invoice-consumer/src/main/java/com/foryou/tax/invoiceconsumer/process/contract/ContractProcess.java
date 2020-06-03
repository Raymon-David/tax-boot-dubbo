package com.foryou.tax.invoiceconsumer.process.contract;

import com.alibaba.dubbo.config.annotation.Reference;
import com.foryou.tax.invoiceapi.pojo.contract.ContractInfoPojo;
import com.foryou.tax.invoiceapi.service.contract.ContractService;
import com.foryou.tax.invoiceapi.utils.LoggerUtils;
import com.foryou.tax.invoiceconsumer.process.common.BaseProcess;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @author ：Raymon
 * @date ：Created in 2020/3/11
 * @description : 合同处理process
 */
@Service
public class ContractProcess extends BaseProcess {

    @Reference(version = "${dubbo.service.version}",
            application = "${dubbo.application.id}",
            url = "dubbo://127.0.0.1:20880")
    private ContractService contractService;

    /**
     * 根据合同号查询合同信息
     */
    public void queryContractInfoByContractNO(HttpServletRequest request, HttpServletResponse response, @RequestParam(defaultValue = "") String contract_no){
        ContractInfoPojo record = new ContractInfoPojo();
        record.setCntrtNo(contract_no);
        ContractInfoPojo contractInfo = contractService.queryContractInfoByContractNO(record);
        LoggerUtils.debug(getClass(),"根据合同号查询合同信息" + contractInfo);
        writeClientJson(response, contractInfo, null);
    }

    /**
     * 通过redis查询合同信息
     */
    public void queryContractInfoByRedis(HttpServletRequest request, HttpServletResponse response){
        List<ContractInfoPojo> contractInfo = contractService.queryContractInfoByRedis();
        LoggerUtils.debug(getClass(),"通过redis查询合同信息" + contractInfo);
        writeClientJson(response, contractInfo, null);
    }
}
