package com.example.miniproject.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.miniproject.model.DetailOrder;
import com.example.miniproject.model.Item;
import com.example.miniproject.service.DetailOrderService;

@RestController
@RequestMapping("/detail_orders")
public class DetailOrderController {
    @Autowired
    DetailOrderService detailOrderService;

    @GetMapping("")
    public List<DetailOrder> list() {
        return detailOrderService.listAllDetailOrder();
    }
    
    @GetMapping("/?detail_id={id}")
    public ResponseEntity<DetailOrder> get(@PathVariable Integer id) {
        try {
        	DetailOrder detailOrder = detailOrderService.getDetailOrder(id);
            return new ResponseEntity<DetailOrder>(detailOrder, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<DetailOrder>(HttpStatus.NOT_FOUND);
        }
    }
    
    @GetMapping("/?order_id={order_id}")
    public List<DetailOrder> listSelectedDetailOrder(@PathVariable Integer order_id) {
        try {
        	DetailOrder detailOrder = detailOrderService.getDetailOrder(order_id);
            return detailOrderService.listSelectedDetailOrder(detailOrder, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return detailOrderService.listSelectedDetailOrder(HttpStatus.NOT_FOUND);
        }
    }
    
//    @PostMapping("/")
//    public void add(@RequestBody DetailOrder detailOrder) {
//    	detailOrderService.saveDetailOrder(detailOrder);
//    }
    
    @PostMapping("/")
    public ResponseEntity<?> post(@RequestBody DetailOrder detailOrder) {
        try {
        	detailOrderService.saveDetailOrder(detailOrder);
            return new ResponseEntity<>("message : Detail order added successfully ", HttpStatus.CREATED);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.CONFLICT);
        }
    }
    
    @PutMapping("/?detail_id={id}")
    public ResponseEntity<?> update(@RequestBody DetailOrder detailOrder, @PathVariable Integer id) {
        try {
        	DetailOrder existDetailOrder = detailOrderService.getDetailOrder(id);
            detailOrder.setId(id);
            detailOrderService.saveDetailOrder(detailOrder);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @DeleteMapping("/?detail_id={id}")
    public void delete(@PathVariable Integer id) {

    	detailOrderService.deleteDetailOrder(id);
    }
}