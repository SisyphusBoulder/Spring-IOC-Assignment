package com.qa.java.spring.ioc.beans;

public class Order {

	private int id;
	private int customerId;
	private float orderValue;
	private String orderDate;
	
	public Order() {
		System.out.println("Order constructor invoked");
	}
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public int getCustomerId() {
		return customerId;
	}
	
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public float getOrderValue() {
		return orderValue;
	}
	
	public void setOrderValue(float orderValue) {
		this.orderValue = orderValue;
	}
	public String getOrderDate() {
		return orderDate;
	}
	
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", customerId=" + customerId + ", orderValue=" + orderValue + ", orderDate="
				+ orderDate + "]";
	}
	public void init() {
		System.out.println("Init method of Order Bean");
	}
	/*
	 * Will be called only for singleton instances
	 */
	public void destroy() {
		System.out.println("Destroy method of Order Bean");
	}
}
