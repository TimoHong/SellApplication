package com.TimoProject.Sell.controller;

import com.TimoProject.Sell.converter.OrderForm2OrderDTOConverter;
import com.TimoProject.Sell.dto.OrderDTO;
import com.TimoProject.Sell.enums.ResultEnum;
import com.TimoProject.Sell.exception.SellException;
import com.TimoProject.Sell.form.OrderForm;
import com.TimoProject.Sell.service.OrderService;
import com.TimoProject.Sell.utils.ResultVoUtil;
import com.TimoProject.Sell.vo.ResultVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/buyer/order")
@Slf4j
public class BuyerOrderController {
    @Autowired
    private OrderService orderService;
    @PostMapping("/create")
    //create order
    public ResultVO<Map<String,String>>create(@Valid OrderForm orderForm,
                                              BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            log.error("order create error: index incorrect, orderForm={}",orderForm);
            throw new SellException(ResultEnum.PARAM_ERROR.getCode(),
                    bindingResult.getFieldError().getDefaultMessage());
        }
        OrderDTO orderDTO = OrderForm2OrderDTOConverter.convert(orderForm);
        if(CollectionUtils.isEmpty(orderDTO.getOrderDetailList())){
            log.error("order create error: cart can not be empty");
            throw new SellException(ResultEnum.CART_EMPTY);
        }
        OrderDTO createResult = orderService.create(orderDTO);
        Map<String, String> map = new HashMap<>();
        map.put("orderId",createResult.getOrderId());

        return ResultVoUtil.success(map);
    }

    //order list

    //order detail

    //cancel order

}
