package com.example.samucafialho.study_apir.dto;

import java.math.BigDecimal;

import com.example.samucafialho.study_apir.model.Product;

public class ItensRequestedCreate {

    private Long productid;
    private BigDecimal valor;
    private BigDecimal quantidade;

    
    public Long getProductid() {
        return productid;
    }
    public void setProductid(Long productid) {
        this.productid = productid;
    }
    public BigDecimal getValor() {
        return valor;
    }
    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }
    public BigDecimal getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(BigDecimal quantidade) {
        this.quantidade = quantidade;
    }

}
