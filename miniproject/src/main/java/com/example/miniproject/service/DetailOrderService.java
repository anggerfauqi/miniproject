package com.example.miniproject.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.example.miniproject.model.DetailOrder;
import com.example.miniproject.repository.DetailOrderRepository;

@Service
@Transactional
public class DetailOrderService {
    @Autowired
    private DetailOrderRepository detailorderRepository;
    public List<DetailOrder> listAllDetailOrder() {
        return detailorderRepository.findAll();
    }

    public void saveDetailOrder(DetailOrder detailOrder) {
    	detailorderRepository.save(detailOrder);
    }

    public DetailOrder getDetailOrder(Integer id) {
        return detailorderRepository.findById(id).get();
    }
    
    public Optional<DetailOrder> listSelectedDetailOrder(Integer order_id) {
        return detailorderRepository.findById(order_id);
    }

    public void deleteDetailOrder(Integer id) {
    	detailorderRepository.deleteById(id);
    }

	public List<DetailOrder> listSelectedDetailOrder(DetailOrder detailOrder, HttpStatus ok) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<DetailOrder> listSelectedDetailOrder(HttpStatus notFound) {
		// TODO Auto-generated method stub
		return null;
	}
}