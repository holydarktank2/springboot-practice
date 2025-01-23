package com.yulun.springboot_practice.service;

import com.yulun.springboot_practice.dto.CreateOrderRequest;
import com.yulun.springboot_practice.model.Order;

public interface OrderService {
    Order getOrderById(Integer orderId);
    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);

}
