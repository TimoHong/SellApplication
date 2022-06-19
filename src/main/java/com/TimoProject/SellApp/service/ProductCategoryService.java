package com.TimoProject.SellApp.service;


import com.TimoProject.SellApp.dataobject.ProductCategory;
import com.TimoProject.SellApp.repository.ProductCategoryRepository;
import com.TimoProject.SellApp.vo.ProductCategoryVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductCategoryService {

    @Autowired
    protected ProductCategoryRepository dao;

    public List<ProductCategoryVO> findAllProductCategories() {

        List<ProductCategory> productCategories = dao.findAll();

//        for (int i = 0; i < productCategories.size(); i++) {
//            ProductCategory productCategory = productCategories.get(i);
//        }

        List<ProductCategoryVO> results = new ArrayList<>();
        for (ProductCategory productCategory : productCategories) {
            ProductCategoryVO vo = new ProductCategoryVO();
            vo.setCategoryId(productCategory.getCategoryId());
            vo.setCategoryName(productCategory.getCategoryName());
            vo.setCategoryType(productCategory.getCategoryType());
            results.add(vo);
        }

        return results;
    }


    public Integer createProductCategory(ProductCategoryVO vo){
        ProductCategory entity = new ProductCategory();
        entity.setCategoryId(vo.getCategoryId());
        entity.setCategoryName(vo.getCategoryName());
        entity.setCategoryType(vo.getCategoryType());
        ProductCategory newOne = dao.save(entity);
        return newOne.getCategoryId();
    }


    public void createProductCategories(List<ProductCategoryVO> list){



    }

}
