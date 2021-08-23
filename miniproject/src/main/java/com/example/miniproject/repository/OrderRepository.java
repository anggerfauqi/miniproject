package com.example.miniproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.miniproject.model.Order;

public interface OrderRepository extends JpaRepository <Order, Integer> {
	
}
