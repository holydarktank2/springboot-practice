package com.yulun.springboot_practice.dao;

import com.yulun.springboot_practice.constant.ProductCategory;
import com.yulun.springboot_practice.dto.ProductRequest;
import com.yulun.springboot_practice.model.Product;

import java.util.List;

public interface ProductDao {
    List<Product> getProducts(ProductCategory category, String search);
    Product getProductById(Integer productId);
    Integer createProduct(ProductRequest productRequest);
    void updateProduct(Integer productId, ProductRequest productRequest);
    void deleteProductById(Integer productId);
}
