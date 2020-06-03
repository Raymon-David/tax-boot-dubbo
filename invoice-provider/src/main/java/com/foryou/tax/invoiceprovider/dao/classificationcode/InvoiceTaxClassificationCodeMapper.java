package com.foryou.tax.invoiceprovider.dao.classificationcode;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.foryou.tax.invoiceapi.pojo.classificationcode.InvoiceTaxClassificationCode;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 税收分类编码 Mapper 接口
 * </p>
 *
 * @author raymon
 * @since 2020-03-31
 */
@Component
@Mapper
public interface InvoiceTaxClassificationCodeMapper extends BaseMapper<InvoiceTaxClassificationCode> {

    InvoiceTaxClassificationCode selectByTaxClassificationCode(String taxClassCode);

    int insertData(InvoiceTaxClassificationCode invoiceTaxClassificationCode);
}
