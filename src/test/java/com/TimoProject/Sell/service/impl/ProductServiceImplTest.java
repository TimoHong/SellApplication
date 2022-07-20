package com.TimoProject.Sell.service.impl;

import com.TimoProject.Sell.dataobject.ProductInfo;
import com.TimoProject.Sell.repository.ProductInfoRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductServiceImplTest extends ProductInfo  {
    @Autowired
    private ProductServiceImpl infoService;
    private ProductInfoRepository dao;



    @Test
    public void testCreateProductInfo() {
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductId("1236");
        productInfo.setProductName("steak1");
        productInfo.setProductPrice(new BigDecimal(1199.5));
        productInfo.setProductStock(100);
        productInfo.setProductDescription("rare is the best");
        productInfo.setProductIcon("http://exmaple.jpg");
        productInfo.setProductStatus(0);
        productInfo.setCategoryType(2);
        ProductInfo newOne = infoService.save(productInfo);



    }

    public void testFindByProductStatus() {
    }
}