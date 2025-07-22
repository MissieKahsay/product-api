package com.mk.productapi.service;

import com.mk.productapi.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAllProducts();
    Product getProductById(Long id);
    Product createProduct(Product product);
    void deleteProduct(Long id);
}
