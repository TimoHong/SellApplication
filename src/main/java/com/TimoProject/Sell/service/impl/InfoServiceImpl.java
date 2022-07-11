package com.TimoProject.Sell.service.impl;

import com.TimoProject.Sell.dataobject.ProductInfo;
import com.TimoProject.Sell.enums.ProductStatusEnum;
import com.TimoProject.Sell.repository.ProductInfoRepository;
import com.TimoProject.Sell.service.ProductService;
import com.TimoProject.Sell.vo.ProductInfoVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.lang.constant.Constable;
import java.util.ArrayList;
import java.util.List;

@Service
public class InfoServiceImpl implements ProductService {
    @Autowired
    protected ProductInfoRepository dao;
    
    @Override
    public ProductInfo findOne(String productId) {
        return dao.getOne(productId);
    }

    @Override
    public List<ProductInfo> findUpAll() {
        return dao.findByProductStatus(ProductStatusEnum.UP.getCode());
    }

    @Override
    public Page<ProductInfo> findAll(Pageable pageable) {
        return dao.findAll(pageable);
    }

    public ProductInfo save(ProductInfo entity){
        return dao.save(entity);
    }
    public String createProductInfo(ProductInfoVO vo){
        ProductInfo entity = new ProductInfo();
        entity.setProductPrice(vo.getProductPrice());
        entity.setProductDescription(vo.getProductDescription());
        entity.setProductIcon(vo.getProductIcon());
        entity.setProductName(vo.getProductName());
        entity.setProductId(vo.getProductId());

        ProductInfo newOne = dao.save(entity);
        return newOne.getProductId();

    }

    public List<ProductInfoVO> findByProductStatus() {
        List<ProductInfo> productInfos = dao.findAll();
        List<ProductInfoVO> results = new ArrayList<>();
        for(ProductInfo productInfo : productInfos){
            ProductInfoVO vo = new ProductInfoVO();
            vo.setProductId(productInfo.getProductId());
            vo.setProductDescription(productInfo.getProductDescription());
            vo.setProductIcon(productInfo.getProductIcon());
            vo.setProductName(productInfo.getProductName());
            vo.setProductPrice(productInfo.getProductPrice());
            results.add(vo);

        }
        return results;


    }

}
