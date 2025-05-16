package com.example.samucafialho.study_apir.dto;

import java.time.LocalDate;
import java.util.List;

import com.example.samucafialho.study_apir.model.Order;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

public class OrderRequestCreate {
    private OrderStatus status;
    
    @JsonFormat(shape = Shape.STRING, pattern = "dd-MM-yyyy")
    private LocalDate dataOrder;
    @JsonFormat(shape = Shape.STRING, pattern = "dd-MM-yyyy")
    private LocalDate dataEntrega;

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
    public OrderStatus getStatus() {
        return status;
    }
    public void setStatus(OrderStatus status) {
        this.status = status;
    }
    public LocalDate getDataOrder() {
        return dataOrder;
    }
    public void setDataOrder(LocalDate dataOrder) {
        this.dataOrder = dataOrder;
    }
    public LocalDate getDataEntrega() {
        return dataEntrega;
    }
    public void setDataEntrega(LocalDate dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

}
