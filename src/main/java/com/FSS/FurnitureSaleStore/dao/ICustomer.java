package com.FSS.FurnitureSaleStore.dao;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.FSS.FurnitureSaleStore.model.Customer;


@Repository
public interface ICustomer extends JpaRepository<Customer,Long>{

	Customer findByUsername(String username);

	Customer findByUsernameAndPassword(String username, String password);

}
