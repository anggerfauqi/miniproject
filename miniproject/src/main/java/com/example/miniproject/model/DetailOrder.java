package com.example.miniproject.model;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "detail_orders")
public class DetailOrder {
	private int id;
	private int order_id;
	private int item_id;
	private int item_qty;
    private long total_price;
    private Timestamp created_at;
    private Timestamp updated_at; 
    
	public DetailOrder() {
	    	
	    }
    
	public DetailOrder(int id, int order_id, int item_id, int item_qty, long total_price, Timestamp created_at, Timestamp updated_at) {
        this.id = id;
        this.order_id = order_id;
        this.item_id = item_id;
        this.item_qty = item_qty;
        this.total_price = total_price;
        this.created_at = created_at;
        this.updated_at = updated_at;   
    }

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getOrder_id() {
		return order_id;
	}

	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}

	public int getItem_id() {
		return item_id;
	}

	public void setItem_id(int item_id) {
		this.item_id = item_id;
	}

	public int getItem_qty() {
		return item_qty;
	}

	public void setItem_qty(int item_qty) {
		this.item_qty = item_qty;
	}

	public long getTotal_price() {
		return total_price;
	}

	public void setTotal_price(long total_price) {
		this.total_price = total_price;
	}

	public Timestamp getCreated_at() {
		return created_at;
	}

	public void setCreated_at(Timestamp created_at) {
		this.created_at = created_at;
	}

	public Timestamp getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(Timestamp updated_at) {
		this.updated_at = updated_at;
	}
	
      
}
