package com.example.samucafialho.study_apir.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;


@Entity
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String status;

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL,
    orphanRemoval = true)
    private List<Itens> items;


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
    public List<Itens> getItems() {
        return items;
    }
    public void setItems(List<Itens> items) {
        this.items = items;
    }

}
