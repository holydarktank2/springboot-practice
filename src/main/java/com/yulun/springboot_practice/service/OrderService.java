package com.yulun.springboot_practice.service;

import com.yulun.springboot_practice.dto.CreateOrderRequest;

public interface OrderService {
    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}
