package com.FSS.FurnitureSaleStore.dao;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.FSS.FurnitureSaleStore.exception.CustomerException;
import com.FSS.FurnitureSaleStore.model.Customer;

@Service
public class CustomerService {

	@Autowired
	ICustomer customerRepository;

	public List<Customer> findAllCustomers() {
		return customerRepository.findAll();
	}

	public Optional<Customer> findById(long id) {
		Optional<Customer> customer = customerRepository.findById(id);
		if (customer.isEmpty()) {
			throw new CustomerException("Customer not found");
		}
		return customer;
	}

	public Customer registerCustomer(Customer user) {
		return customerRepository.save(user);
	}

	public Customer findByUsername(String username) {
		return customerRepository.findByUsername(username);
	}

	public Customer findByUsernameAndPassword(String username, String password) {
		Customer user = customerRepository.findByUsernameAndPassword(username, password);
		return user;
	}

	public Customer editCustomer(long id, Customer customer) {
		Customer oldCustomer = customerRepository.findById(id).get();
		oldCustomer.setUsername(customer.getUsername());
		oldCustomer.setEmail(customer.getEmail());
		return customerRepository.save(oldCustomer);
	}

}
