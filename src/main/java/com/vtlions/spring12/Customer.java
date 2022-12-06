package com.vtlions.spring12;

public class Customer {
	private String name;
	private Cart cart;

	public Customer() {
	}
	
	public Customer(String name, Cart cart) {
		this.name = name;
		this.cart = cart;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", cart=" + cart + "]";
	}

}
