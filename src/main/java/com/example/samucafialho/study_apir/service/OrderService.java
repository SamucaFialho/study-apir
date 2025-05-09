package com.example.samucafialho.study_apir.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.hibernate.cache.spi.support.AbstractReadWriteAccess.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.samucafialho.study_apir.dto.OrderRequestCreate;
import com.example.samucafialho.study_apir.dto.OrderRequestUpdate;
import com.example.samucafialho.study_apir.model.Itens;
import com.example.samucafialho.study_apir.model.Order;
import com.example.samucafialho.study_apir.model.Product;
import com.example.samucafialho.study_apir.repository.ItensRepository;
import com.example.samucafialho.study_apir.repository.OrderRepository;
import com.example.samucafialho.study_apir.repository.ProductRepository;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private ItensRepository itensRepository;
    @Autowired
    private ProductRepository productRepository;

    public Order createOrder(OrderRequestCreate dto){
        Order order = new Order();
        order.setStatus("Aberto");

        List<Itens> itens = dto.getItens().stream().map(p -> {
            Itens item = new Itens();

            Product product = productRepository.findById(p.getProductid())
            .orElseThrow(() ->
            new RuntimeException(
                "Produto inexistente: " + p.getProductid()
            ));
            
            item.setProduct(product);
            item.setValor(p.getValor());
            item.setQuantidade(p.getQuantidade());
            item.setOrder(order);
            return item;

        }).collect(Collectors.toList());

        order.setItems(itens);
        return orderRepository.save(order);
        // return orderRepository.save(dto.toModel());

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

    public List<Order> findByStatus(@PathVariable String status){
        orderService

    }



}
