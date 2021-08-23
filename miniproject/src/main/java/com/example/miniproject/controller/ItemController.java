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
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.miniproject.model.Item;
import com.example.miniproject.service.ItemService;

@RestController
@RequestMapping("/items")
public class ItemController {
    @Autowired
    ItemService itemService;

    @GetMapping("")
    public List<Item> list() {
        return itemService.listAllItem();
    }

    @GetMapping("/?item_id={id}")
    public ResponseEntity<Item> get(@PathVariable Integer id) {
        try {
        	Item item = itemService.getItem(id);
            return new ResponseEntity<Item>(item, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Item>(HttpStatus.NOT_FOUND);
        }
    }
    
//    @PostMapping("/")
//    public void add(@RequestBody Item item) {
//    	itemService.saveItem(item);
//    }
    
    @PostMapping("/")
    public ResponseEntity<?> post(@RequestBody Item item) {
        try {
            itemService.saveItem(item);
            return new ResponseEntity<>("message : Item added successfully ", HttpStatus.CREATED);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.CONFLICT);
        }
    }
    
    @PutMapping("/?item_id={id}")
    public ResponseEntity<?> update(@RequestBody Item item, @PathVariable Integer id) {
        try {
        	Item existItem = itemService.getItem(id);
            item.setId(id);
            itemService.saveItem(item);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    
    @DeleteMapping("/?item_id={id}")
    public void delete(@PathVariable Integer id) {

    	itemService.deleteItem(id);
    }
}