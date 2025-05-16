package com.example.samucafialho.study_apir.dto;

import com.example.samucafialho.study_apir.model.Order;

public class OrderRequestUpdate {


    private OrderStatus status;

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Order toModel(Order order){
        order.setStatus(this.status);
        return order;
    }


    
    
}
