package com.TimoProject.Sell.converter;

import com.TimoProject.Sell.dataobject.OrderDetail;
import com.TimoProject.Sell.dto.OrderDTO;
import com.TimoProject.Sell.enums.ResultEnum;
import com.TimoProject.Sell.exception.SellException;
import com.TimoProject.Sell.form.OrderForm;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import lombok.extern.slf4j.Slf4j;
import net.bytebuddy.description.method.MethodDescription;

import java.util.ArrayList;
import java.util.List;
@Slf4j
public class OrderForm2OrderDTOConverter {
    public static OrderDTO convert(OrderForm orderForm){
        Gson gson = new Gson();
        OrderDTO orderDTO = new OrderDTO();

        orderDTO.setBuyerName((orderForm.getName()));
        orderDTO.setBuyerPhone((orderForm.getPhone()));
        orderDTO.setBuyerAddress(orderForm.getAddress());
        orderDTO.setBuyerOpenid(orderForm.getOpenid());
        List<OrderDetail> orderDetailList = new ArrayList<>();
        try {
           orderDetailList = gson.fromJson(orderForm.getItems(),
                    new TypeToken<List<OrderDetail>>() {
                    }.getType());
        }catch (Exception e){
            log.error("object transfer error, string={}", orderForm.getItems());
            throw new SellException(ResultEnum.PARAM_ERROR);
        }


        orderDTO.setOrderDetailList(orderDetailList);
        return orderDTO;
    }
}
