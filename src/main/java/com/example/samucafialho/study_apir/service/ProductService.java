package com.example.samucafialho.study_apir.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.samucafialho.study_apir.dto.ProductRequestCreate;
import com.example.samucafialho.study_apir.dto.ProductRequestUpdate;
import com.example.samucafialho.study_apir.model.Product;
import com.example.samucafialho.study_apir.repository.ProductRepository;

@Service
public class ProductService {
    
    @Autowired
    private ProductRepository productRepository;

    public Product createProduct(ProductRequestCreate dto) {
        return productRepository.save(dto.toModel());
        
    }
    public Optional<Product> getProductById(Long id) {
        
        // return products.stream()
        // .filter(p -> p.getId().equals(id))
        // .findFirst();
        return productRepository.findById(id);
        
    }

    public List<Product> getAll(){
        return productRepository.findAll();
    }

    
     public Optional<Product> updateProduct(Long id, ProductRequestUpdate dto) {
        return productRepository.findById(id)
        .map(p -> productRepository.save(dto.toModel(p)));



    //      return products.stream().filter(p -> p.getId().equals(id))
    //              .findFirst()
    //              .map(p -> {
    //                  p.setValor(dto.getValor());
    //                  return p;
    //              });               
    }
    public boolean deleteProduct(Long id) {
        if (productRepository.existsById(id)) {
            productRepository.deleteById(id);
            return true;

        }
        return false;
        
        
        // Optional<Product> opt = productRepository.findById(id);
        // if (opt.isPresent()) {
        //     productRepository.deleteById(id);
        //     return true;
        // }
    }
}