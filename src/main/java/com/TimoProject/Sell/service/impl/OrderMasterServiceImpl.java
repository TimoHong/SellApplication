package com.TimoProject.Sell.service.impl;

import com.TimoProject.Sell.dataobject.OrderMaster;
import com.TimoProject.Sell.repository.OrderMasterRepository;
import com.TimoProject.Sell.service.OrderMasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderMasterServiceImpl implements OrderMasterService {
    @Autowired
    OrderMasterRepository dao;
    @Override
    public OrderMaster save(OrderMaster orderMaster) {
        return dao.save(orderMaster);
    }


}
