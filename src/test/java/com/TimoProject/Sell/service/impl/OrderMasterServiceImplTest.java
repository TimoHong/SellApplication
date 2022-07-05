package com.TimoProject.Sell.service.impl;

import com.TimoProject.Sell.dataobject.OrderMaster;
import com.TimoProject.Sell.repository.OrderMasterRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderMasterServiceImplTest {
    @Autowired
    private OrderMasterServiceImpl infoService;
    private OrderMasterRepository dao;

    @Test
    public void save() {
        OrderMaster orderMaster = new OrderMaster();
        orderMaster.setOrderId("123456");
        orderMaster.setBuyerName("Test");
        orderMaster.setBuyerPhone("123456789123");
        orderMaster.setBuyerAddress("HK");
        orderMaster.setBuyerOpenid("110110");
        orderMaster.setOrderAmount(new BigDecimal(2.3));
        OrderMaster result = infoService.save(orderMaster);
    }
}