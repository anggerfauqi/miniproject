package com.example.miniproject.model;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "orders")
public class Order {
	private int id;
    private String code;
    private String name;
    private String address;
    private long total_price;
    private String note;
    private Timestamp created_at;
    private Timestamp updated_at; 
    
	public Order() {
	    	
	    }
    
    public Order(int id, String code, String name, String address, long total_price, String note, Timestamp created_at, Timestamp updated_at) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.address = address;
        this.total_price = total_price;
        this.note = note;
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

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getTotal_price() {
		return total_price;
	}

	public void setTotal_price(long total_price) {
		this.total_price = total_price;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
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
