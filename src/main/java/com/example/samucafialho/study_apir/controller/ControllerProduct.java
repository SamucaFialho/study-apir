package com.example.samucafialho.study_apir.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.samucafialho.study_apir.service.ProductService;

@RestController
@RequestMapping("produtos")
public class ControllerProduct {

    @Autowired
    private ProductService productservice = new ProductService();

    @PostMapping
    public ResponseEntity<String> create() {
        productservice.createProduct(null);
        return ResponseEntity.status(201).body("Produto cadastrado");
    }

    @DeleteMapping
    public ResponseEntity<Void> delete() {
        productservice.deleteProduct(0);
        return ResponseEntity.status(204).build();

    }

    @PutMapping
    public ResponseEntity<String> update() {
        productservice.updateProduct(0, null);
        return ResponseEntity.status(200).body("Produto atualizado");
    }

    @GetMapping
    public ResponseEntity<String> find() {
        productservice.getProductById(0);
        return ResponseEntity.status(200).body("Maça");

    }
}
