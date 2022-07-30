package com.TimoProject.Sell.enums;

public enum ResultEnum {
    PARAM_ERROR(1, "index error"),
    PRODUCT_NOT_EXIST(10, "product not exist"),
    PRODUCT_STOCK_ERROR(11, "product stock error"),
    ORDER_NOT_EXIST(12,"order not exist"),
    ORDERDETAIL_NOT_EXIST(13,"order detail not exist"),
    ORDER_STATUS_ERROR(14,"order status error"),
    ORDER_UPDATE_FAIL(15,"order update fail"),
    ORDER_DETAIL_EMPTY(16,"order detail is empty"),
    ORDER_PAY_STATUS_ERROR(17, "order pay status error"),

    CART_EMPTY(18,"Cart can not be empty"),
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
