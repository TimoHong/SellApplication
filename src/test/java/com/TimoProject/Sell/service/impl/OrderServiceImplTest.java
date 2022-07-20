package com.TimoProject.Sell.service.impl;

import com.TimoProject.Sell.dataobject.OrderDetail;
import com.TimoProject.Sell.dataobject.OrderMaster;
import com.TimoProject.Sell.dto.OrderDTO;
import com.TimoProject.Sell.enums.OrderStatusEnum;
import com.TimoProject.Sell.repository.OrderMasterRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class OrderServiceImplTest {

    @Autowired
    private OrderServiceImpl orderService;

    private final String BUYER_OPENID = "1101110";

    private final String ORDER_ID = "1658126606886706051";

    @Test
    public void create() throws Exception {

        OrderDTO orderDTO = new OrderDTO();
        orderDTO.setBuyerName("Timo");
        orderDTO.setBuyerAddress("HK");
        orderDTO.setBuyerPhone("123456789012");
        orderDTO.setBuyerOpenid(BUYER_OPENID);

        //购物车
        List<OrderDetail> orderDetailList = new ArrayList<>();
        OrderDetail o1 = new OrderDetail();
        o1.setProductId("1234");
        o1.setProductQuantity(1);

        orderDetailList.add(o1);
        orderDTO.setOrderDetailList(orderDetailList);

        OrderDTO result = orderService.create(orderDTO);
        log.info("【创建订单】result={}", result);
        Assert.assertNotNull(result);
    }
    @Test
    public void cancel(){
        OrderDTO orderDTO = orderService.findOne(ORDER_ID);
        OrderDTO result = orderService.cancel(orderDTO);
        Assert.assertEquals(OrderStatusEnum.CANCEL.getCode(),result.getOrderStatus());
    }
}