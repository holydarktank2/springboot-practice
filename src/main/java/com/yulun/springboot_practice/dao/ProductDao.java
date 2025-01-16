package com.yulun.springboot_practice.dao;

import com.yulun.springboot_practice.model.Product;

public interface ProductDao {
    Product getProductById(Integer productId);
}
