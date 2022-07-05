package com.TimoProject.Sell.enums;

import lombok.Getter;

@Getter
public enum OrderStatusEnum {
    NEW(0, "新訂單"),
    FINISHED(1,"完結"),
    CANCEL(2, "已取消"),
    ;
    private Integer code;
    private String message;


    OrderStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }


}
