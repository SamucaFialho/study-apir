package com.example.samucafialho.study_apir.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.samucafialho.study_apir.dto.OrderRequestCreate;
import com.example.samucafialho.study_apir.dto.OrderRequestUpdate;
import com.example.samucafialho.study_apir.model.Order;
import com.example.samucafialho.study_apir.repository.OrderRepository;

public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public Order createOrder(OrderRequestCreate dto){
        return orderRepository.save(dto.toModel());
    }

    public Optional<Order> getOrderbyId(Long id){
        return orderRepository.findById(id);
    }

    public List<Order> getAllOrder(){
        return orderRepository.findAll();
    }

    public Optional<Object> updateOrder(Long id, OrderRequestUpdate dto){
        return orderRepository.findById(id)
        .map(p -> orderRepository.save(dto.toModel(p)));
    }

    public boolean deleteOrder(Long id){
        if (orderRepository.existsById(id)){
        orderRepository.deleteById(id); 
            return true;
        }
        return false;
    }



}
