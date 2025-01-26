package com.yulun.springboot_practice.service;

import com.yulun.springboot_practice.dto.OrderQueryParams;
import com.yulun.springboot_practice.dto.CreateOrderRequest;
import com.yulun.springboot_practice.model.Order;

import java.util.List;

public interface OrderService {

    Integer countOrder(OrderQueryParams orderQueryParams);
    List<Order> getOrders(OrderQueryParams orderQueryParams);
    Order getOrderById(Integer orderId);
    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);

}
