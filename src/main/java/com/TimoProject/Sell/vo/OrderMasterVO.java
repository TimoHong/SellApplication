package com.TimoProject.Sell.vo;

import com.TimoProject.Sell.enums.OrderStatusEnum;
import com.TimoProject.Sell.enums.PayStatusEnum;
import lombok.Data;

import javax.persistence.Entity;
import java.math.BigDecimal;
import java.util.Date;

@Data
public class OrderMasterVO {
    private String orderId;

    private String buyerName;

    private String buyerPhone;

    private String buyerAddress;

    private String buyerOpenid;

    private BigDecimal orderAmount;
    /* default 新訂單. */
    private Integer orderStatus = OrderStatusEnum.NEW.getCode();
    /* default 未支付 */
    private Integer payStatus = PayStatusEnum.WAIT.getCode();


}
