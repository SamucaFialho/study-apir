package com.example.samucafialho.study_apir.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.samucafialho.study_apir.model.Product;

@Service
public class ProductService {
    private List<Product> products = new ArrayList<>();

    private Long sequence = 1L;

    public Product createProduct(Product product) {
        product.setId(sequence++);
        products.add(product);
        return product;
    }
    public Product getProductById(Long id) {
        return null;
    }
    // public Optional<Product> updateProduct(Long id, Product product) {
        
    //     return products.stream()
    //             .filter(e -> e.getId().equals(id))
    //             .findFirst()
    //             .map(p -> {
    //                 p.setNome(product.getNome());
    //                 return p;
    //             });               
    // }

    public Product updateProduct(Long id, Product product) {        
        return product;  
    }

    public void deleteProduct(Long id) {

    }
}