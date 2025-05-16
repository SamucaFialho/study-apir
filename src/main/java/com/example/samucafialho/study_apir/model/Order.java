package com.example.samucafialho.study_apir.model;

import java.time.LocalDate;
import java.util.List;

import com.example.samucafialho.study_apir.dto.OrderStatus;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;


@Entity
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Enumerated(EnumType.STRING)
    private OrderStatus status;

    private LocalDate dataOrder;
    
    private LocalDate dataEntrega;

   
    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL,
    orphanRemoval = true)
    private List<Itens> items;


    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public List<Itens> getItems() {
        return items;
    }
    public void setItems(List<Itens> items) {
        this.items = items;
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
