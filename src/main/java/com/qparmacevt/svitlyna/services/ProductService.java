package com.qparmacevt.svitlyna.services;

import com.qparmacevt.svitlyna.models.Products;
import com.qparmacevt.svitlyna.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Products> getAllProducts() {
        return productRepository.findAll();
    }

    public Products getProductById(Long id) {
        return productRepository.findById(id).orElse(null);
    }

    public Products createProduct(Products product) {
        return productRepository.save(product);
    }

    public Products updateProduct(Long id, Products product) {
        return productRepository.findById(id).orElse(null);
    }

    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }
}
