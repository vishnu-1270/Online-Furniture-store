package com.FSS.FurnitureSaleStore.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.FSS.FurnitureSaleStore.model.Cart;


import com.FSS.FurnitureSaleStore.model.Customer;

@Repository
public interface ICart extends JpaRepository<Cart, Long> {

	List<Cart> findByCustomer(Customer customer);

}
