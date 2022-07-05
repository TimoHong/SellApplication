package com.TimoProject.Sell.enums;

public enum ProductStatusEnum {
    UP(0,"on stock"),
    DOWN(1,"out of stock")
    ;
    private Integer code;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    private String message;
    ProductStatusEnum(Integer code, String message){
        this.code = code;
        this.message = message;
    }

}
