package com.TimoProject.SellApp.controller;

import com.TimoProject.SellApp.dataobject.ProductCategory;
import com.TimoProject.SellApp.service.ProductCategoryService;
import com.TimoProject.SellApp.vo.ProductCategoryVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("productCategory")
public class ProductCategoryController {

    @Autowired
    protected ProductCategoryService service;

    @GetMapping(value = "/all")
    public List<ProductCategoryVO> findAllProductCategories(){

        return service.findAllProductCategories();

    }

    @PostMapping(value = "/create")
    public Integer createProductCategory(@RequestBody ProductCategoryVO productCategoryVO){
        return service.createProductCategory(productCategoryVO);
    }

}
