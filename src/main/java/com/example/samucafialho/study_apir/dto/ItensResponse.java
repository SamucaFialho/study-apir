package com.example.samucafialho.study_apir.dto;

import java.math.BigDecimal;

import com.example.samucafialho.study_apir.model.Itens;

public class ItensResponse {

    private Long id;
    private String nomeProduto;
    private BigDecimal valor;
    private BigDecimal quantidade;

    public ItensResponse toDto(Itens itens){
        this.setId(itens.getId());
        this.setNomeProduto(itens.getProduct().getNome());
        this.setValor(itens.getValor());
        this.setQuantidade(itens.getQuantidade());
        return this;
    }

    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNomeProduto() {
        return nomeProduto;
    }
    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
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
