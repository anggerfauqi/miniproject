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

import com.example.miniproject.model.Item;
import com.example.miniproject.model.Order;
import com.example.miniproject.service.OrderService;

@RestController
@RequestMapping("/orders")
public class OrderController {
    @Autowired
    OrderService orderService;

    @GetMapping("")
    public List<Order> list() {
        return orderService.listAllOrder();
    }

    @GetMapping("/?order_id={id}")
    public ResponseEntity<Order> get(@PathVariable Integer id) {
        try {
        	Order order = orderService.getOrder(id);
            return new ResponseEntity<Order>(order, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Order>(HttpStatus.NOT_FOUND);
        }
    }
    
//    @PostMapping("/")
//    public void add(@RequestBody Order order) {
//    	orderService.saveOrder(order);
//    }
    
    @PostMapping("/")
    public ResponseEntity<?> post(@RequestBody Order order) {
        try {
        	orderService.saveOrder(order);
        	return new ResponseEntity<>("message : Order has been received with register number : "+order.getCode(), HttpStatus.CREATED);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.CONFLICT);
        }
    }
    
    @PutMapping("/?order_id={id}")
    public ResponseEntity<?> update(@RequestBody Order order, @PathVariable Integer id) {
        try {
        	Order existOrder = orderService.getOrder(id);
            order.setId(id);
            orderService.saveOrder(order);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @DeleteMapping("/?order_id={id}")
    public void delete(@PathVariable Integer id) {

    	orderService.deleteOrder(id);
    }
}