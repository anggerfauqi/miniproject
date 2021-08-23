package com.example.miniproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.miniproject.model.DetailOrder;

public interface DetailOrderRepository extends JpaRepository <DetailOrder, Integer>{

}
