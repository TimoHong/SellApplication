package com.TimoProject.Sell.form;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class OrderForm {
    @NotEmpty(message = "Name must fill in")
    private String name;

    @NotEmpty(message = "phone number must fill in")
    private String phone;

    @NotEmpty(message = "address must fill in")
    private String address;
    @NotEmpty(message = "openid must fill in")
    private String openid;
    @NotEmpty(message = "shopping cart can not be empty")
    private String items;
}
