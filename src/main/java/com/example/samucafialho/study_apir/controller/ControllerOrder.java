package com.example.samucafialho.study_apir.controller;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.samucafialho.study_apir.dto.OrderRequestCreate;
import com.example.samucafialho.study_apir.dto.OrderRequestUpdate;
import com.example.samucafialho.study_apir.dto.OrderResponse;
import com.example.samucafialho.study_apir.model.Order;
import com.example.samucafialho.study_apir.service.OrderService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("pedidos")
public class ControllerOrder {

    @Autowired
    private OrderService orderService;


    @PostMapping("/{id}")
    public ResponseEntity<OrderResponse> create(@PathVariable Long id, 
    @RequestBody OrderRequestCreate dto){

        Order order = orderService.createOrder(dto);

        OrderResponse response = new OrderResponse().toDto(order);

        return ResponseEntity.status(201).body(response);
    }

    @GetMapping("/{id}")
    public ResponseEntity<OrderResponse> findbyId(@PathVariable Long id){

        return orderService.getOrderbyId(id)
        .map(p -> new OrderResponse().toDto(p))
        .map(ResponseEntity::ok)
        .orElse(ResponseEntity.notFound().build());

    }

    @GetMapping 
    ResponseEntity<List<OrderResponse>> getAll(){
        List<OrderResponse> response =
        orderService.getAllOrder().stream()
        .map(p -> new OrderResponse().toDto(p))
        .collect(Collectors.toList());
        return ResponseEntity.ok(response);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        boolean result = orderService.deleteOrder(id);

        if (result) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }


    @PutMapping("/{id}")
    public ResponseEntity<OrderResponse> update(@PathVariable Long id, 
                                        @RequestBody OrderRequestUpdate dto){


    return orderService.updateOrder(id, dto)
    .map(p -> new OrderResponse().toDto(null))
    .map(ResponseEntity::ok)
    .orElse(ResponseEntity.notFound().build());
 }
    

    

}
