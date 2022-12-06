package com.vtlions.spring12;

import java.util.Map;

public class Cart {
	private int maxSize;
	private Map<Product, Integer> products;

	public Cart() {
	}

	public Cart(int maxSize, Map<Product, Integer> products) {
		this.maxSize = maxSize;
		this.products = products;
	}

	public int getMaxSize() {
		return maxSize;
	}

	public void setMaxSize(int maxSize) {
		this.maxSize = maxSize;
	}

	public Map<Product, Integer> getProducts() {
		return products;
	}

	public void setProducts(Map<Product, Integer> products) {
		this.products = products;
	}

	@Override
	public String toString() {
		return "Cart [maxSize=" + maxSize + ", products=" + products + "]";
	}

}
