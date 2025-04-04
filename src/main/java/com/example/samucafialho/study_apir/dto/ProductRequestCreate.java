package com.example.samucafialho.study_apir.dto;

import java.math.BigDecimal;

import com.example.samucafialho.study_apir.model.Product;

public class ProductRequestCreate {
     private String nome;

     public Product toModel(){
        BigDecimal VALOR_PADRAO = new BigDecimal(2000);
        Product product = new Product();
        product.setNome(this.nome);
        product.setValor(VALOR_PADRAO);
        return product;
     }


    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

}