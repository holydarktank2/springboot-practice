package com.yulun.springboot_practice.service;

import com.yulun.springboot_practice.model.Product;

public interface ProductService {
    Product getProductById(Integer productId);
}
