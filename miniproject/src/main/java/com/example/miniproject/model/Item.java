package com.example.miniproject.model;

import java.sql.Timestamp;

import javax.persistence.*;

@Entity
@Table(name= "items")
public class Item {
		
	private int id;
    private String code;
    private String name;
    private int qty;
    private long price;
    private Timestamp created_at;
    private Timestamp updated_at; 
    
    public Item() {
    	
    }
    
    public Item(int id, String code, String name, int qty, long price, Timestamp created_at, Timestamp updated_at) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.qty = qty;
        this.price = price;
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

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
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
