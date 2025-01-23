package com.yulun.springboot_practice.dao;

import com.yulun.springboot_practice.constant.ProductCategory;
import com.yulun.springboot_practice.dto.ProductRequest;
import com.yulun.springboot_practice.model.Product;

import java.util.List;

public interface ProductDao {

    Integer countProduct(ProductQueryParams productQueryParams);
    List<Product> getProducts(ProductQueryParams productQueryParams);
    Product getProductById(Integer productId);
    Integer createProduct(ProductRequest productRequest);
    void updateProduct(Integer productId, ProductRequest productRequest);
    void updateStock(Integer productId, Integer stock);
    void deleteProductById(Integer productId);
}
