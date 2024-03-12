package com.FSS.FurnitureSaleStore.model;


import java.sql.Date;
import java.sql.Time;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.stereotype.Component;

import jakarta.persistence.*;
@Component
@Entity
public class Cart {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@ManyToOne()
	@JoinColumn(name = "customer_id")
	private Customer customer;
	
	@ManyToOne()
	@JoinColumn(name = "item_id")
	private Item item;
	
	private long quantity;
	
	@CreationTimestamp
	@Temporal(TemporalType.DATE)
	private Date productPurchasedDate;

	@CreationTimestamp
	@Temporal(TemporalType.TIME)
	private Time productPurchasedTime;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public long getQuantity() {
		return quantity;
	}

	public void setQuantity(long quantity2) {
		this.quantity = quantity2;
	}

	public Date getProductPurchasedDate() {
		return productPurchasedDate;
	}

	public void setProductPurchasedDate(Date productPurchasedDate) {
		this.productPurchasedDate = productPurchasedDate;
	}

	public Time getProductPurchasedTime() {
		return productPurchasedTime;
	}

	public void setProductPurchasedTime(Time productPurchasedTime) {
		this.productPurchasedTime = productPurchasedTime;
	}
	
	
	
}
