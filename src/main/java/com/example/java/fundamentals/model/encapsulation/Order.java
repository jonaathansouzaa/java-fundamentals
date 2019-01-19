package com.example.java.fundamentals.model.encapsulation;

public class Order {

	private Item item;
	private Integer quantity;
	private Double totalPrice;

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getTotalPrice() {
		this.totalPrice = quantity * item.getPrice();
		return totalPrice;
	}

}
