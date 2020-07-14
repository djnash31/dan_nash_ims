package com.qa.ims.persistence.domain;

import java.sql.Date;

public class Order {

	private Long id;
	private int ordersNumItems;
	private double ordersCost;
	private Date ordersDate;
	private int item_id;
	private int customer_id;
	
	public Order(Long id, int ordersNumItems, double ordersCost, Date ordersDate, int item_id, int customer_id) {
		this.id=id;
		this.ordersNumItems=ordersNumItems;
		this.ordersCost=ordersCost;
		this.ordersDate=ordersDate;
		this.item_id=item_id;
		this.customer_id=customer_id;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getOrdersNumItems() {
		return ordersNumItems;
	}

	public void setOrdersNumItems(int ordersNumItems) {
		this.ordersNumItems = ordersNumItems;
	}

	public double getOrdersCost() {
		return ordersCost;
	}

	public void setOrdersCost(double ordersCost) {
		this.ordersCost = ordersCost;
	}

	public Date getOrdersDate() {
		return ordersDate;
	}

	public void setOrdersDate(Date ordersDate) {
		this.ordersDate = ordersDate;
	}

	public int getItem_id() {
		return item_id;
	}

	public void setItem_id(int item_id) {
		this.item_id = item_id;
	}

	public int getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	
}
