package com.example.samucafialho.study_apir.dto;

import java.util.List;

import com.example.samucafialho.study_apir.model.Order;

public class OrderRequestCreate {
    private String status;

    private List<ItensRequestedCreate> itens;

    public List<ItensRequestedCreate> getItens() {
        return itens;
    }
    public void setItens(List<ItensRequestedCreate> itens) {
        this.itens = itens;
    }

    public Order toModel(){
        Order order = new Order();
        order.setStatus(this.status);
        return order;
    }
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
