package com.FSS.FurnitureSaleStore.model;

import java.sql.Date;
import java.sql.Time;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.stereotype.Component;

import jakarta.persistence.*;

@Component
@Entity
public class Item {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	private String name;
	private String description;
	private String category;

	@Column(length = 1000)
	private String image;
	private int price;

	@CreationTimestamp
	@Temporal(TemporalType.DATE)
	private Date productAddedDate;

	@CreationTimestamp
	@Temporal(TemporalType.TIME)
	private Time productAddedTime;

	public Item() {
		super();
	}

	public Item(String name, String description, String category, String image, int price, Date productAddedDate,
			Time productAddedTime) {
		super();
		this.name = name;
		this.description = description;
		this.category = category;
		this.image = image;
		this.price = price;
		this.productAddedDate = productAddedDate;
		this.productAddedTime = productAddedTime;
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Date getProductAddedDate() {
		return productAddedDate;
	}

	public void setProductAddedDate(Date productAddedDate) {
		this.productAddedDate = productAddedDate;
	}

	public Time getProductAddedTime() {
		return productAddedTime;
	}

	public void setProductAddedTime(Time productAddedTime) {
		this.productAddedTime = productAddedTime;
	}

}
