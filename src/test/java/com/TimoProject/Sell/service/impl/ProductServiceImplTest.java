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
    private ProductServiceImpl ProductService;
    private ProductInfoRepository dao;



    @Test
    public void testCreateProductInfo() {
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductId("1235");
        productInfo.setProductName("chips");
        productInfo.setProductPrice(new BigDecimal(1200.0));
        productInfo.setProductStock(100);
        productInfo.setProductDescription("best seller");
        productInfo.setProductIcon("http://chips.jpg");
        productInfo.setProductStatus(0);
        productInfo.setCategoryType(2);
        ProductInfo newOne = ProductService.save(productInfo);



    }

    public void testFindByProductStatus() {
    }
}