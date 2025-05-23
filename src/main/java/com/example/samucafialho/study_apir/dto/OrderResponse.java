package com.example.samucafialho.study_apir.dto;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

import com.example.samucafialho.study_apir.model.Order;

public class OrderResponse {

    private Long id;
    private String status;
    private LocalDate dataEntrega;
    
    private List<ItensResponse> itens;


    public List<ItensResponse> getItens() {
        return itens;
    }

    public void setItens(List<ItensResponse> itens) {
        this.itens = itens;
    }

    public OrderResponse toDto(Order order){
        this.setId(order.getId());
        this.setStatus(order.getStatus().getMensagem());
        this.setDataEntrega(order.getDataEntrega());
        List<ItensResponse> items = order.getItems()
        .stream().map(p -> new ItensResponse().toDto(p))
        .collect(Collectors.toList());
        this.setItens(items);
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
    public LocalDate getDataEntrega() {
        return dataEntrega;
    }
    public void setDataEntrega(LocalDate dataEntrega) {
        this.dataEntrega = dataEntrega;
    }
}
