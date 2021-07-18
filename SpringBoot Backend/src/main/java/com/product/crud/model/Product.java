package com.product.crud.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="PRODUCT")
public class Product {
	
	@Id
	@Column(name ="ID")
	private Integer id;
	@Column(name ="NAME")
	private String name;
	@Column(name ="DESCRIPTION")
	private String desc;
	@Column(name ="PRICE")
	private Integer price;
	
	public Product() {
		
	}
	
	public Product(Integer id, String name, String desc, Integer price) {
		super();
		this.id = id;
		this.name = name;
		this.desc = desc;
		this.price = price;
	}
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}

}
