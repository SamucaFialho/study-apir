package com.example.samucafialho.study_apir.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.samucafialho.study_apir.dto.OrderStatus;
import com.example.samucafialho.study_apir.model.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long>{
    public List<Order> findByStatus(OrderStatus status);

}
