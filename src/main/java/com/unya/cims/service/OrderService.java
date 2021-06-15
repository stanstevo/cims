package com.unya.cims.service;

import com.unya.cims.entity.Orders;
import com.unya.cims.repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public List<Orders> findAll() {
        return orderRepository.findAll();
    }

    public void saveAll(List<Orders> orders) {
        orderRepository.saveAll(orders);
    }

}

