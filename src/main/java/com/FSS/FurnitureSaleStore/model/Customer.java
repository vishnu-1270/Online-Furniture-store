package com.FSS.FurnitureSaleStore.model;

import org.springframework.stereotype.Component;

import jakarta.persistence.*;
@Component
@Entity
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String username;
	private String email;
	private String password;
	private String address;
	
	@Column(columnDefinition = "varchar(255) default 'USER'")
	public String role;
	
	public Customer() {
		super();
		this.role = "USER";
	}

	public Customer(String username, String email, String password, String role) {
		super();
		this.username = username;
		this.email = email;
		this.password = password;
		this.role = role;
	}

	public long getId() {
		return id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", username=" + username + ", email=" + email + ", password=" + password
				+ ", address=" + address + ", role=" + role + "]";
	}

	
}
