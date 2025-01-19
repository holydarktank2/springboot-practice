package com.yulun.springboot_practice.service;

import com.yulun.springboot_practice.constant.ProductCategory;
import com.yulun.springboot_practice.dto.ProductRequest;
import com.yulun.springboot_practice.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> getProducts(ProductCategory category, String search);
    Product getProductById(Integer productId);
    Integer createProduct(ProductRequest productRequest);
    void updateProduct(Integer productId, ProductRequest productRequest);
    void deleteProductById(Integer productId);
}
