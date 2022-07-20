package com.TimoProject.Sell.service;

import com.TimoProject.Sell.dataobject.ProductCategory;
import com.TimoProject.Sell.vo.ProductCategoryVO;

import java.util.List;

public interface CategoryService {
    ProductCategory findOne(Integer categoryId);
    List<ProductCategory> findAll();
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
    ProductCategory save(ProductCategory productCategory);

}
