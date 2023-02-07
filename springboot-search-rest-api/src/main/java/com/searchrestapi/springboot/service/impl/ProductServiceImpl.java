package com.searchrestapi.springboot.service.impl;

import org.springframework.stereotype.Service;

import com.searchrestapi.springboot.entity.Product;
import com.searchrestapi.springboot.repository.ProductRepository;
import com.searchrestapi.springboot.service.ProductService;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    private ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> searchProducts(String query) {
        List<Product> products = productRepository.searchProductsSQL(query);
        return products;
    }

    @Override
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

}