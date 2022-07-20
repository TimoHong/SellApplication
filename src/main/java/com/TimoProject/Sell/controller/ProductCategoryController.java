package com.TimoProject.Sell.controller;

import com.TimoProject.Sell.service.impl.CategoryServiceImpl;
import com.TimoProject.Sell.vo.ProductCategoryVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("productCategory")
public class ProductCategoryController {

    @Autowired
    protected CategoryServiceImpl service;

    @GetMapping(value = "/all")
    public List<ProductCategoryVO> findAllProductCategories(){

        return service.findAllProductCategories();

    }

    @PostMapping(value = "/create")
    public Integer createProductCategory(@RequestBody ProductCategoryVO productCategoryVO){
        return service.createProductCategory(productCategoryVO);
    }

}