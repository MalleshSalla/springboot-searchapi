package com.searchrestapi.springboot.service;

import java.util.List;

import com.searchrestapi.springboot.entity.Product;

public interface ProductService {
    List<Product> searchProducts(String query);

    Product createProduct(Product product);
}
