package com.foryou.tax.invoiceapi.bean;

import com.foryou.tax.invoiceapi.bean.error.ErrorInfo;

public class ErrorBean {
    private ErrorInfo error;

    public ErrorInfo getError() {
        return error;
    }

    public void setError(ErrorInfo error) {
        this.error = error;
    }
}
