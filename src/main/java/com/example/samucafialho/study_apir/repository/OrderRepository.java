package com.example.samucafialho.study_apir.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.samucafialho.study_apir.model.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long>{

}
