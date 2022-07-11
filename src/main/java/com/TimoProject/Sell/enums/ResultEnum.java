package com.TimoProject.Sell.enums;

public enum ResultEnum {
    PRODUCT_NOT_EXIST(10, "product not exist"),
    ;
    private Integer code;
    private String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
