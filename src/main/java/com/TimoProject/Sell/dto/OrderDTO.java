package com.TimoProject.Sell.dto;

import com.TimoProject.Sell.dataobject.OrderDetail;
import com.TimoProject.Sell.enums.OrderStatusEnum;
import com.TimoProject.Sell.enums.PayStatusEnum;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
@Data
public class OrderDTO {
    private String orderId;

    private String buyerName;

    private String buyerPhone;

    private String buyerAddress;

    private String buyerOpenid;

    private BigDecimal orderAmount;
    /* default 新訂單. */
    private Integer orderStatus;
    /* default 未支付 */
    private Integer payStatus;

    private Date createTime;

    private Date updateTime;

    private List<OrderDetail> orderDetailList;
}
