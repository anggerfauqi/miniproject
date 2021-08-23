package com.example.miniproject.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.miniproject.model.Order;
import com.example.miniproject.repository.OrderRepository;

@Service
@Transactional
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;
    public List<Order> listAllOrder() {
        return orderRepository.findAll();
    }

    public void saveOrder(Order order) {
    	orderRepository.save(order);
    }

    public Order getOrder(Integer id) {
        return orderRepository.findById(id).get();
    }

    public void deleteOrder(Integer id) {
    	orderRepository.deleteById(id);
    }
}