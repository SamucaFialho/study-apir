package com.example.samucafialho.study_apir.dto;

import com.example.samucafialho.study_apir.model.Order;

public class OrderRequestUpdate {


    private String status;

    public Order toModel(Order order){
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
