package com.FSS.FurnitureSaleStore.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.FSS.FurnitureSaleStore.dao.CartService;

import com.FSS.FurnitureSaleStore.model.Cart;


import jakarta.servlet.http.HttpSession;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class CartController {
	@Autowired	
	private CartService cartService;
	
	@GetMapping("/customers/cart")
	public List<Cart> getAllCart(HttpSession session) {
		return cartService.findAll();
	}

	@GetMapping("/customers/cart/{userId}")
	public List<Cart> getAllCartItemsByCustomer(@PathVariable("userId") long cid) {
		return cartService.getAllCartItemsByACustomer(cid);
	}

	@PostMapping("/customers/{userId}/cart/add/{itemId}/quantity/{qty}")
	public Cart addCartItem(@PathVariable("userId") long cid, @PathVariable("itemId") long pid,
			@PathVariable("qty") long qty) {
		return cartService.addCartItem(cid, pid, qty);
	}

	@DeleteMapping("/customers/cart/{userId}/delete/item/{id}")
	public void deleteItemFromCart(@PathVariable("id") long id) {
		cartService.deleteById(id);
	}

}
