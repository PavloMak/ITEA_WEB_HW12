package com.vtlions.spring12;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomerConfiguration {

	@Bean()
	public Product getProduct() {
		Product product = new Product();
		product.setId(4);
		product.setName("Gun");
		product.setPrice(60);
		return product;
	}

	@Bean
	public Cart getCart() {
		Cart cart = new Cart();
		Map<Product, Integer> products = new HashMap<Product, Integer>();
		products.put(getProduct(), 1);
		cart.setMaxSize(30);
		cart.setProducts(products);
		return cart;
	}

	@Bean
	public Customer getCustomer() {
		Customer customer = new Customer();
		customer.setName("Anton");
		customer.setCart(getCart());
		return customer;
	}

}
