package com.foryou.tax.invoiceapi.constant;

public enum InvoiceMergeErrorEnum {

    /**
     * 错误信息
     */
    IMEE_10001("10001", "发票备注上的名称和购货名称不一致"),
    IMEE_10002("10002", "金税系统与融资租赁系统开票日期不一致"),
    IMEE_10003("10003", "金税系统与融资租赁系统含税金额不一致"),
    IMEE_10004("10004", "金税系统与融资租赁系统不含税金额不一致"),
    IMEE_10005("10005", "金税系统与融资租赁系统税额不一致"),
    IMEE_10006("10006", "金税系统与融资租赁系统反冲标志不一致"),
    IMEE_10007("10007", "融资租赁系统无该条数据"),
    IMEE_10008("10008", "融资租赁系统开票日期为空"),
    IMEE_10009("10009", "融资租赁系统含税金额为空"),
    IMEE_10010("10010", "融资租赁系统不含税金额为空"),
    IMEE_10011("10011", "融资租赁系统税额为空"),
    IMEE_10012("10012", "融资租赁系统反冲标志为空")
    ;


    InvoiceMergeErrorEnum () {
    }

    private String errorCode;

    private String errorMsg;

    InvoiceMergeErrorEnum(String errorCode, String errorMsg) {
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }
}
