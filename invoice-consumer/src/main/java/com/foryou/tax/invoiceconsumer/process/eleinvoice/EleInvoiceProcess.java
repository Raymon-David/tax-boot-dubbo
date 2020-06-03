package com.foryou.tax.invoiceconsumer.process.eleinvoice;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.fastjson.JSONObject;
import com.foryou.tax.invoiceapi.bean.ErrorBean;
import com.foryou.tax.invoiceapi.bean.error.ErrorDesc;
import com.foryou.tax.invoiceapi.bean.error.ErrorInfo;
import com.foryou.tax.invoiceapi.constant.EleErrorEnum;
import com.foryou.tax.invoiceapi.constant.StatusCodeEnum;
import com.foryou.tax.invoiceapi.pojo.allinvoice.AllInvoiceDetail;
import com.foryou.tax.invoiceapi.pojo.allinvoice.AllInvoiceInfo;
import com.foryou.tax.invoiceapi.pojo.companies.FyCompanies;
import com.foryou.tax.invoiceapi.pojo.eleinvoice.EleInvoiceDetail;
import com.foryou.tax.invoiceapi.pojo.eleinvoice.EleInvoiceInfo;
import com.foryou.tax.invoiceapi.pojo.invoiceobject.InvoiceObjectInfo;
import com.foryou.tax.invoiceapi.service.allinvoice.AllInvoiceDetatilService;
import com.foryou.tax.invoiceapi.service.allinvoice.AllInvoiceInfoService;
import com.foryou.tax.invoiceapi.service.attachment.FyAttachmentDetailService;
import com.foryou.tax.invoiceapi.service.attachment.FyAttachmentInfoService;
import com.foryou.tax.invoiceapi.service.companies.FyCompaniesService;
import com.foryou.tax.invoiceapi.service.eleinvoice.EleInvoiceDetailService;
import com.foryou.tax.invoiceapi.service.eleinvoice.EleInvoiceInfoService;
import com.foryou.tax.invoiceapi.service.invoiceobject.InvoiceObjectInfoService;
import com.foryou.tax.invoiceapi.utils.LoggerUtils;
import com.foryou.tax.invoiceconsumer.process.common.BaseProcess;
import com.foryou.tax.invoiceconsumer.utils.eleinvoice.EleInvoiceDownloadXmlUtil;
import com.foryou.tax.invoiceconsumer.utils.eleinvoice.EleInvoiceSubmitXmlUtil;
import com.foryou.tax.invoiceconsumer.utils.eleinvoice.GetMarginXmlUtil;
import org.apache.logging.log4j.util.PropertiesUtil;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 * @author ：Raymon
 * @date ：Created in 2020/3/17
 * @description : 电子发票process处理类
 */
@Service
public class EleInvoiceProcess extends BaseProcess {

    @Reference(version = "${dubbo.service.version}",
            application = "${dubbo.application.id}",
            url = "${dubbo.protocol.name}://${dubbo.protocol.host}:${dubbo.protocol.port}")
    private EleInvoiceInfoService eleInvoiceInfoService;

    @Reference(version = "${dubbo.service.version}",
            application = "${dubbo.application.id}",
            url = "${dubbo.protocol.name}://${dubbo.protocol.host}:${dubbo.protocol.port}")
    private EleInvoiceDetailService eleInvoiceDetailService;

    @Reference(version = "${dubbo.service.version}",
            application = "${dubbo.application.id}",
            url = "${dubbo.protocol.name}://${dubbo.protocol.host}:${dubbo.protocol.port}")
    private InvoiceObjectInfoService invoiceObjectInfoService;

    @Reference(version = "${dubbo.service.version}",
            application = "${dubbo.application.id}",
            url = "${dubbo.protocol.name}://${dubbo.protocol.host}:${dubbo.protocol.port}")
    private FyCompaniesService fyCompaniesService;

    @Reference(version = "${dubbo.service.version}",
            application = "${dubbo.application.id}",
            url = "${dubbo.protocol.name}://${dubbo.protocol.host}:${dubbo.protocol.port}")
    private AllInvoiceDetatilService allInvoiceDetatilService;

    @Reference(version = "${dubbo.service.version}",
            application = "${dubbo.application.id}",
            url = "${dubbo.protocol.name}://${dubbo.protocol.host}:${dubbo.protocol.port}")
    private AllInvoiceInfoService allInvoiceInfoService;

    @Reference(version = "${dubbo.service.version}",
            application = "${dubbo.application.id}",
            url = "${dubbo.protocol.name}://${dubbo.protocol.host}:${dubbo.protocol.port}")
    private FyAttachmentInfoService fyAttachmentInfoService;

    @Reference(version = "${dubbo.service.version}",
            application = "${dubbo.application.id}",
            url = "${dubbo.protocol.name}://${dubbo.protocol.host}:${dubbo.protocol.port}")
    private FyAttachmentDetailService fyAttachmentDetailService;

    public void eleInvoiceInfoSubmit(HttpServletRequest request, HttpServletResponse response, List<AllInvoiceInfo> allInvoiceDataList){

        /**
         * 查询发票余量
         */
        String getMargin = GetMarginXmlUtil.getMarginXml();
        /**
         * 调用请求接口
         */
        JSONObject marginJsonObject = GetMarginXmlUtil.postData(getMargin);

        ErrorBean errorBean = new ErrorBean();
        ErrorInfo errorInfo = new ErrorInfo();
        ErrorDesc errorDesc = new ErrorDesc();
        if ("false".equals(marginJsonObject.getString("flag"))) {
            errorDesc.setMessage(marginJsonObject.getString("errorMessage"));
            errorDesc.setCode("false");
            errorInfo.setErrDesc(errorDesc);
            errorInfo.setType("error");
            errorBean.setError(errorInfo);
            writeClientJson(response, errorBean, null);
        }else {
            /**
             * 比较发票余量和这次开票的数量，余量不够不允许开票
             */
            int acrEleNumber = Integer.parseInt(marginJsonObject.getString("acrEleNumber"));
            if (acrEleNumber < allInvoiceDataList.size()) {
                errorDesc.setMessage(EleErrorEnum.E_E_2001.getErrorMsg());
                errorDesc.setCode(EleErrorEnum.E_E_2001.getErrorCode());
                errorInfo.setErrDesc(errorDesc);
                errorInfo.setType("error");
                errorBean.setError(errorInfo);
                writeClientJson(response, errorBean, null);
            }else{
                for (int i = 0; i < allInvoiceDataList.size(); i++) {
                    /**
                     * 先把发票头行表信息存到电子发票中间头行表中
                     * 先判断这条发票是否已经执行过开票，也就是电子发票中间表是否存在记录
                     *
                     */
                    EleInvoiceInfo eleInvoiceInfo = new EleInvoiceInfo();
                    eleInvoiceInfo.setInvoiceId(allInvoiceDataList.get(i).getInvoiceId());

                    EleInvoiceInfo eleInvoices = eleInvoiceInfoService.getEleInvoiceInfo(eleInvoiceInfo);

                    /**
                     * 如果出现"请维护对应的税收分类编码"这种错误
                     * 先删掉 ele_invoice_info , ele_invoice_detail 中这条数据
                     * 因为 税收编码跟随着每一条现金流
                     */
                    if(eleInvoices != null){
                        if(EleErrorEnum.E_E_2006.getErrorCode().equals(eleInvoices.getInvoiceInterfaceTaxCode())){
                            long eleId = eleInvoices.getEleInvoiceId();
                            eleInvoiceInfoService.deleteData(eleInvoices);
                            eleInvoiceDetailService.deleteData(eleInvoices);
                        }
                    }

                    /**
                     * 删完之后再重新查询一下
                     */
                    eleInvoices = eleInvoiceInfoService.getEleInvoiceInfo(eleInvoiceInfo);

                    if (eleInvoices == null) {
                        int data = insertEleInvoiceInfo(request, response, allInvoiceDataList.get(i));

                        if (data != 0){
                            //调用发送接口报文封装类
                            String xml = EleInvoiceSubmitXmlUtil.eleInvoiceSubmitXml(allInvoiceDataList.get(i), eleInvoiceInfoService, eleInvoiceDetailService);

                            //调用发送接口工具类
                            JSONObject jsonObject = EleInvoiceSubmitXmlUtil.postData(xml);
                            if (0 == jsonObject.size()) {
                                EleInvoiceInfo eleInvoiceInfo1 = new EleInvoiceInfo();
                                eleInvoiceInfo1.setInvoiceId(allInvoiceDataList.get(i).getInvoiceId());

                                eleInvoiceInfo1.setInvoiceInterfaceTaxCode(EleErrorEnum.E_E_2002.getErrorCode());
                                eleInvoiceInfo1.setInvoiceInterfaceTaxMessage(EleErrorEnum.E_E_2002.getErrorMsg());
                                //更新电子发票状态，表示已经传入金税接口，并更新错误代码和错误提示
                                eleInvoiceInfoService.updateEleInvoiceTaxError(eleInvoiceInfo1);

                                errorDesc.setMessage(EleErrorEnum.E_E_2002.getErrorMsg());
                                errorDesc.setCode(EleErrorEnum.E_E_2002.getErrorCode());
                                errorInfo.setErrDesc(errorDesc);
                                errorInfo.setType("error");
                                errorBean.setError(errorInfo);
                                writeClientJson(response, errorBean, null);
                            } else if ("false".equals(jsonObject.getString("flag"))) {
                                /**
                                 * 凡是
                                 * 开电子发票金税返回报错
                                 * 则把报错信息放入EleInvoiceInfo 的 invoiceInterfaceTaxCode and invoiceInterfaceTaxMessage
                                 *
                                 */
                                String errorCode = jsonObject.getString("statusCode");
                                String errorMessage = jsonObject.getString("errorMessage");

                                EleInvoiceInfo eleInvoiceInfo1 = new EleInvoiceInfo();
                                eleInvoiceInfo1.setInvoiceId(allInvoiceDataList.get(i).getInvoiceId());
                                eleInvoiceInfo1.setInvoiceInterfaceTaxCode(errorCode);
                                eleInvoiceInfo1.setInvoiceInterfaceTaxMessage(errorMessage);
                                //更新电子发票状态，表示已经传入金税接口，并更新错误代码和错误提示
                                eleInvoiceInfoService.updateEleInvoiceTaxError(eleInvoiceInfo1);

                                errorDesc.setMessage(errorMessage);
                                errorDesc.setCode(errorCode);
                                errorInfo.setErrDesc(errorDesc);
                                errorInfo.setType("error");
                                errorBean.setError(errorInfo);
                                writeClientJson(response, errorBean, null);
                            } else {
                                /**
                                 * 更新电子发票状态，表示已经传入金税接口
                                 *
                                 * 电子发票状态 ELE_INVOICE_STATUS_CODE  ES2002  已传入
                                 *
                                 * 电子发票金税接口状态 INVOICE_INTERFACE_STATUS_CODE  EIS3002  已传金税
                                 */
                                EleInvoiceInfo eleInvoiceInfo1 = new EleInvoiceInfo();
                                eleInvoiceInfo1.setInvoiceId(allInvoiceDataList.get(i).getInvoiceId());
                                eleInvoiceInfo1.setEleInvoiceStatusCode(StatusCodeEnum.ES_2002.getStatusCode());
                                eleInvoiceInfo1.setEleInvoiceStatusName(StatusCodeEnum.ES_2002.getStatusName());
                                eleInvoiceInfo1.setInvoiceInterfaceStatusCode(StatusCodeEnum.EIS_3002.getStatusCode());
                                eleInvoiceInfo1.setInvoiceInterfaceStatusName(StatusCodeEnum.EIS_3002.getStatusName());
                                eleInvoiceInfoService.updateEleInvoiceInterfaceStatus(eleInvoiceInfo1);

                                //开票成功结束后，更新发票余量
                                int num = acrEleNumber - allInvoiceDataList.size();

                                /**
                                 * 查询 FY_COMPANIES 表
                                 */
                                FyCompanies fyCompanies = new FyCompanies();
                                fyCompanies.setCompanyId(allInvoiceDataList.get(i).getCompanyId());
                                fyCompanies.setCompanyEleMargin(num);
                                fyCompaniesService.updateCompanyEleMargin(fyCompanies);
                            }
                        }
                    }
                }
            }
        }
    }



    /**
     *
     * 如果是以下报错，则插入 ELE_INVOICE_INFO 表中 INVOICE_INTERFACE_TAX_CODE 和 INVOICE_INTERFACE_TAX_MESSAGE
     *
     * 1。开电子发票没有存在开票手机号码
     * 2。电子发票只能开普票
     * 3。开票人名称过长，不符合
     * 4。没有对应的税收分类编码
     *
     */
    public int insertEleInvoiceInfo(HttpServletRequest request, HttpServletResponse response, AllInvoiceInfo allInvoiceInfo){

        String saleTax = "";
        int success = 0;
        ErrorBean errorBean = new ErrorBean();
        ErrorInfo errorInfo = new ErrorInfo();
        ErrorDesc errorDesc = new ErrorDesc();

        try {
            Properties properties = new Properties();
            InputStream is = PropertiesUtil.class.getClassLoader()
                    .getResourceAsStream("config.properties");
            properties.load(is);
            saleTax = properties.getProperty("eleinvoice.saleTax");
        } catch (Exception e) {
            e.printStackTrace();
        }

        /**
         * 先判断这条发票是否已经执行过开票，也就是电子发票表是否存在记录
         */
        EleInvoiceInfo eleInvoiceInfo = new EleInvoiceInfo();
        eleInvoiceInfo.setInvoiceId(allInvoiceInfo.getInvoiceId());
        EleInvoiceInfo eleInvoiceHds = eleInvoiceInfoService.getEleInvoiceInfo(eleInvoiceInfo);

        if (eleInvoiceHds != null) {
            errorDesc.setMessage(EleErrorEnum.E_E_2000.getErrorMsg());
            errorDesc.setCode(EleErrorEnum.E_E_2000.getErrorCode());
            errorInfo.setErrDesc(errorDesc);
            errorInfo.setType("error");
            errorBean.setError(errorInfo);
            writeClientJson(response, errorBean, null);
        } else {
            /**
             * 流水号
             * 关键字段不能为空，必须唯一 由数字、字母、下划线组成 字段固定长度是20位
             * 规则 EI_年月日_companycode_100000001
             */
            FyCompanies fyCompanies = new FyCompanies();
            fyCompanies.setCompanyId(allInvoiceInfo.getCompanyId());
            String serialNum = eleInvoiceInfoService.getSerialNum(fyCompanies);
            /**
             * 购货方企业类型
             * 查询开票对象表
             */
            if(allInvoiceInfo.getObjectCode() == null){

                errorDesc.setMessage(EleErrorEnum.E_E_2007.getErrorMsg());
                errorDesc.setCode(EleErrorEnum.E_E_2007.getErrorCode());
                errorInfo.setErrDesc(errorDesc);
                errorInfo.setType("error");
                errorBean.setError(errorInfo);
                writeClientJson(response, errorBean, null);
            }else{

                InvoiceObjectInfo invoiceObjectInfo1 = new InvoiceObjectInfo();
                invoiceObjectInfo1.setObjectCode(allInvoiceInfo.getObjectCode());
                InvoiceObjectInfo invoiceObjectInfo = invoiceObjectInfoService.getInvoiceObjectInfo(invoiceObjectInfo1);

                /**
                 * 01：企业
                 * 02：机关执业单位
                 * 03：个人
                 * 04：其他
                 */
                String custType = invoiceObjectInfo.getObjectTypeCode();
                if("".equals(custType) || custType == null){
                    EleInvoiceInfo a = new EleInvoiceInfo();
                    a.setInvoiceId(allInvoiceInfo.getInvoiceId());
                    a.setInvoiceInterfaceTaxCode(EleErrorEnum.E_E_2008.getErrorCode());
                    a.setInvoiceInterfaceTaxMessage(EleErrorEnum.E_E_2008.getErrorMsg());
                    //更新电子发票状态，表示已经传入金税接口，并更新错误代码和错误提示
                    eleInvoiceInfoService.updateEleInvoiceTaxError(a);
                }

                /**
                 * 获取电话号码
                 * 查询开票对象表
                 */
                String custTelephone = invoiceObjectInfo.getInvoicePhone();
                if ("".equals(custTelephone) || custTelephone == null) {
                    /**
                     * 如果开电子发票报错，则把报错信息放入 ELE_INVOICE_INFO 表中 INVOICE_INTERFACE_TAX_CODE 和 INVOICE_INTERFACE_TAX_MESSAGE
                     */
                    EleInvoiceInfo a = new EleInvoiceInfo();
                    a.setInvoiceId(allInvoiceInfo.getInvoiceId());
                    a.setInvoiceInterfaceTaxCode(EleErrorEnum.E_E_2003.getErrorCode());
                    a.setInvoiceInterfaceTaxMessage(EleErrorEnum.E_E_2003.getErrorMsg());
                    //更新电子发票状态，表示已经传入金税接口，并更新错误代码和错误提示
                    eleInvoiceInfoService.updateEleInvoiceTaxError(a);
                }
                /**
                 * 获取邮箱
                 * 查询开票对象表
                 */
                String email = invoiceObjectInfo.getInvoiceEmail();

                /**
                 * 判断发票类型，如果是专票，不允许开
                 */
                if ("0".equals(allInvoiceInfo.getInvoiceKind())) {

                    EleInvoiceInfo a = new EleInvoiceInfo();
                    a.setInvoiceId(allInvoiceInfo.getInvoiceId());
                    a.setInvoiceInterfaceTaxCode(EleErrorEnum.E_E_2004.getErrorCode());
                    a.setInvoiceInterfaceTaxMessage(EleErrorEnum.E_E_2004.getErrorMsg());
                    //更新电子发票状态，表示已经传入金税接口，并更新错误代码和错误提示
                    eleInvoiceInfoService.updateEleInvoiceTaxError(a);
                }

                //获取开票人名称
                String name = allInvoiceInfo.getIssuer().toString();
                //获取确认人名称
                String fhrName = allInvoiceInfo.getReviewer().toString();
                System.out.println(name.length());
                if (name.length() > 4 || fhrName.length() > 4) {

                    EleInvoiceInfo a = new EleInvoiceInfo();
                    a.setInvoiceId(allInvoiceInfo.getInvoiceId());
                    a.setInvoiceInterfaceTaxCode(EleErrorEnum.E_E_2005.getErrorCode());
                    a.setInvoiceInterfaceTaxMessage(EleErrorEnum.E_E_2005.getErrorMsg());
                    //更新电子发票状态，表示已经传入金税接口，并更新错误代码和错误提示
                    eleInvoiceInfoService.updateEleInvoiceTaxError(a);
                }

                //插入电子发票中间头表
                EleInvoiceInfo eleInvoiceInfo1 = new EleInvoiceInfo();
                eleInvoiceInfo1.setInvoiceId(allInvoiceInfo.getInvoiceId());
                eleInvoiceInfo1.setDocumentType("ELE_INVOICE_INFO");
                eleInvoiceInfo1.setDocumentCategory("ELE_INVOICE_INFO");
                //流水号
                eleInvoiceInfo1.setSerialNum(serialNum);
                eleInvoiceInfo1.setSaleTax(saleTax);
                eleInvoiceInfo1.setCustName(allInvoiceInfo.getObjectName());
                eleInvoiceInfo1.setCustTaxNo(allInvoiceInfo.getTaxRegistryNum());
                eleInvoiceInfo1.setCustAddr(allInvoiceInfo.getInvoiceObjectAddressPhone());
                eleInvoiceInfo1.setCustTelephone(custTelephone);
                eleInvoiceInfo1.setCustPhone("");
                eleInvoiceInfo1.setCustEmail(email);
                eleInvoiceInfo1.setCustBankAccount(allInvoiceInfo.getInvoiceObjectBankAccount());
                eleInvoiceInfo1.setCustType(custType);
                eleInvoiceInfo1.setEleInvoiceMemo(allInvoiceInfo.getInvoiceMemo());
                eleInvoiceInfo1.setEleInvoiceType("3");
                eleInvoiceInfo1.setIssuedTime(new Date());
                eleInvoiceInfo1.setCancelNum("");
                //开票类型 1代表开正票
                eleInvoiceInfo1.setBillType("1");
                //默认0  代表正常冲红，电子发票
                eleInvoiceInfo1.setSpecialRedFlag("0");
                //正票正常开具
                eleInvoiceInfo1.setOperationCode("10");
                //用户名称
                eleInvoiceInfo1.setIssuer(allInvoiceInfo.getIssuer());
                //同开票人
                eleInvoiceInfo1.setReviewer(allInvoiceInfo.getReviewer());
                //原发票代码 红冲使用，这里是空
                eleInvoiceInfo1.setFormerInvoiceCode("");
                //原发票代码 红冲使用，这里是空
                eleInvoiceInfo1.setFormerInvoiceNum("");
                //正常票填0
                eleInvoiceInfo1.setInvoiceReverseDesc("0");
                eleInvoiceInfo1.setEleInvoiceStatusCode(StatusCodeEnum.ES_2001.getStatusCode());
                eleInvoiceInfo1.setEleInvoiceStatusName(StatusCodeEnum.ES_2001.getStatusName());
                eleInvoiceInfo1.setInvoiceInterfaceStatusCode(StatusCodeEnum.EIS_3001.getStatusCode());
                eleInvoiceInfo1.setInvoiceInterfaceStatusName(StatusCodeEnum.EIS_3001.getStatusName());
                /**
                 * request 里有用户相关信息
                 */
                eleInvoiceInfoService.insertData(eleInvoiceInfo1);

                /**
                 * 插入电子发票明细表
                 */
                List<AllInvoiceDetail> allInvoiceDetails = allInvoiceDetatilService.getAllInvoiceDetailInfo(allInvoiceInfo);
                for (int i = 0; i < allInvoiceDetails.size(); i++) {
                    /**
                     * 获取合同编号
                     * 插入 ELE_INVOICE_DETAIL 中的 CONTRACT_NO 和 BILL_NO
                     */
                    List<Map> list = eleInvoiceDetailService.getContractDetail(allInvoiceDetails.get(i).getCashflowId());

                    /**
                     * 通过 ALL_INVOICE_DETAIL 中的 CASHFLOW_ID 和 CASHFLOW_ITEM_CODE
                     * ALL_INVOICE_INFO 中的 COMMODITY_CODE
                     * 从 INVOICE_TAX_CLASSIFICATION_CODE
                     * 获取每一个行项目的税收分类编码
                     *
                     */
                    String code = eleInvoiceDetailService.getTaxClassificationCode(allInvoiceDetails.get(i));

                    if ("".equals(code) || code == null) {

                        EleInvoiceInfo a = new EleInvoiceInfo();
                        a.setInvoiceId(allInvoiceInfo.getInvoiceId());
                        a.setInvoiceInterfaceTaxCode(EleErrorEnum.E_E_2006.getErrorCode());
                        a.setInvoiceInterfaceTaxMessage(EleErrorEnum.E_E_2006.getErrorMsg());
                        //更新电子发票状态，表示已经传入金税接口，并更新错误代码和错误提示
                        eleInvoiceInfoService.updateEleInvoiceTaxError(a);
                        return success;
                    }

                    EleInvoiceDetail eleInvoiceDetail = new EleInvoiceDetail();
                    eleInvoiceDetail.setEleInvoiceId(eleInvoiceInfo1.getEleInvoiceId());
                    eleInvoiceDetail.setInvoiceId(allInvoiceDetails.get(i).getInvoiceId());
                    eleInvoiceDetail.setContractNo(String.valueOf(list.get(0).get("contractNumber")));
                    eleInvoiceDetail.setBillNo(String.valueOf(list.get(0).get("contractNumber")));
                    eleInvoiceDetail.setBillName(allInvoiceDetails.get(i).getProductName());
                    //税收分类编码
                    eleInvoiceDetail.setBillCode(code);
                    eleInvoiceDetail.setLineType("0");
                    eleInvoiceDetail.setSpec(allInvoiceDetails.get(i).getSpec());
                    eleInvoiceDetail.setUnit("台");
                    eleInvoiceDetail.setTaxRate(BigDecimal.valueOf(allInvoiceDetails.get(i).getTaxRate()));
                    eleInvoiceDetail.setTaxQuantity(allInvoiceDetails.get(i).getTaxQuantity());
                    eleInvoiceDetail.setTaxPrice(allInvoiceDetails.get(i).getTaxPrice());
                    eleInvoiceDetail.setTotalAmount(allInvoiceDetails.get(i).getTotalAmount());
                    eleInvoiceDetail.setYhzcbs("0");
                    eleInvoiceDetail.setYhzcnr("");
                    eleInvoiceDetail.setLslbs(null);
                    eleInvoiceDetail.setZxbm("");
                    eleInvoiceDetail.setKce(null);
                    eleInvoiceDetailService.insertData(eleInvoiceDetail);
                }

            }
            success = 1;
        }
        return success;
    }

    public void eleInvoiceInfoDownload(HttpServletRequest request, HttpServletResponse response, List<AllInvoiceInfo> allInvoiceDataList) {

        for (int i = 0; i < allInvoiceDataList.size(); i++){
            /**
             * 通过 invoiceid 获取单据号 invoicenum
             */
            AllInvoiceInfo allInvoiceInfo = allInvoiceInfoService.getInvoiceNum(allInvoiceDataList.get(i));
            String invoiceNum = allInvoiceInfo.getInvoiceNum();
            LoggerUtils.debug(getClass(), "下载的单据号是：" + invoiceNum);
            //获取下载电子发票报文
            String xml = EleInvoiceDownloadXmlUtil.getXml(allInvoiceDataList.get(i), eleInvoiceInfoService);
            LoggerUtils.debug(getClass(), "下载的XML是：" + xml);
            JSONObject jsonObject = EleInvoiceDownloadXmlUtil.postData(xml, eleInvoiceInfoService, fyAttachmentInfoService, fyAttachmentDetailService);

            ErrorBean errorBean = new ErrorBean();
            ErrorInfo errorInfo = new ErrorInfo();
            ErrorDesc errorDesc = new ErrorDesc();

            if ("false".equals(jsonObject.getString("flag"))) {
                LoggerUtils.error(getClass(), "下载的单据号是：" + invoiceNum + "电子发票下载失败，失败原因：" + jsonObject.getString("errorMessage"));

                errorDesc.setMessage(jsonObject.getString("errorMessage"));
                errorDesc.setCode("false");
                errorInfo.setErrDesc(errorDesc);
                errorInfo.setType("error");
                errorBean.setError(errorInfo);
                writeClientJson(response, errorBean, null);
            }else {
                LoggerUtils.debug(getClass(), "下载的单据号是：" + invoiceNum + "电子发票下载成功");
            }
        }
    }
}
