package com.TimoProject.Sell.repository;

import com.TimoProject.Sell.dataobject.OrderDetail;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderDetailRepositoryTest {
    @Autowired
    private OrderDetailRepository dao;

    @Test
    public void saveTest(){
        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setDetailId("987654321987");
        orderDetail.setOrderId("2505632");
        orderDetail.setProductIcon("http://test.jpg");
        orderDetail.setProductName("beef");
        orderDetail.setProductId("1234");
        orderDetail.setProductPrice(new BigDecimal(123.0));
        orderDetail.setProductQuantity(2);

        OrderDetail result = dao.save(orderDetail);
        Assert.assertNotNull(result);
    }

    @Test
    public void findByOrderId() throws Exception{
        List<OrderDetail> orderDetailList = dao.findByOrderId("111111111");
        Assert.assertNotEquals(0,orderDetailList.size());
    }
}