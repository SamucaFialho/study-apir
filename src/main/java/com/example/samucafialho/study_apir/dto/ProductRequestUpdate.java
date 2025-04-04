package com.example.samucafialho.study_apir.dto;

import java.math.BigDecimal;

import com.example.samucafialho.study_apir.model.Product;


public class ProductRequestUpdate {
    private BigDecimal valor;

    public Product toModel(Product product){
        product.setValor(this.valor);
        return product;
    }


    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    

}
