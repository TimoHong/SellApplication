package com.TimoProject.SellApp.repository;

import com.TimoProject.SellApp.dataobject.ProductCategory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {
//    @Autowired
//    private ProductCategoryRepository repository;
//    @Transactional
//    @Test
//    public void findOneTest(){
//        ProductCategory productCategory = repository.getOne(1);
//        System.out.println(productCategory.toString());
//    }
//    @Transactional
//    @Test
//    public void saveTest(){
//        ProductCategory productCategory = new ProductCategory();
//        productCategory.setCategoryName("Women Choice");
//        productCategory.setCategoryType(2);
//        productCategory.setCategoryId(2);
//        repository.save(productCategory);
//    }
}