package com.TimoProject.Sell.repository;

import com.TimoProject.Sell.dataobject.ProductInfo;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.math.BigDecimal;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductInfoRepositoryTest extends TestCase {
    @Autowired
    private ProductInfoRepository dao;
    @Test
    @Transactional
    public void saveTest(){
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductId("12345");
        productInfo.setProductName("chicken");
        productInfo.setProductPrice(new BigDecimal(300.5));
        productInfo.setProductStock(100);
        productInfo.setProductDescription("well done is the best");
        productInfo.setProductIcon("http://exmaple.jpg");
        productInfo.setProductStatus(0);
        productInfo.setCategoryType(2);

        ProductInfo result = dao.save(productInfo);
        Assert.assertNotNull(result);
    }
    @Test
    @Transactional
    public void testFindByProductStatus() throws Exception{
        List<ProductInfo> productInfoList = dao.findByProductStatus(0);
        Assert.assertNotEquals(0,productInfoList.size());
    }
}