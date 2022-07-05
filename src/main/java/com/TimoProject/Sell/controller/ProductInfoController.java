package com.TimoProject.Sell.controller;

import com.TimoProject.Sell.service.impl.InfoServiceImpl;
import com.TimoProject.Sell.vo.ProductInfoVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("ProductInfo")
public class ProductInfoController {
    @Autowired
    protected InfoServiceImpl service;

    @GetMapping(value = "/all")
    public List<ProductInfoVO> findByProductStatus(){
        return service.findByProductStatus();
    }
    @PostMapping(value = "/create")
    public  Integer createProductInfo(@RequestBody ProductInfoVO productInfoVO){
        return service.createProductInfo(productInfoVO);
    }
}
