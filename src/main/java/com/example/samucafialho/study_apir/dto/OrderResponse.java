package com.example.samucafialho.study_apir.dto;

import java.util.List;

import com.example.samucafialho.study_apir.model.Order;

public class OrderResponse {

    private Long id;
    private String status;
    private List<ItensResponse> itens;


    public List<ItensResponse> getItens() {
        return itens;
    }

    public void setItens(List<ItensResponse> itens) {
        this.itens = itens;
    }

    public OrderResponse toDto(Order order){
        this.setId(order.getId());
        this.setStatus(order.getStatus());
        return this;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
}
