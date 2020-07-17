package com.qa.ims.persistence.domain;

import java.util.Calendar;
import java.util.Date;

public class Order {

	private Long id;
	private int ordersNumItems;
	private int ordersCost;
	private int Itemid;
	private int customer_id;
	
	public Order(Long id, int ordersNumItems, int ordersCost, int item_id, int customer_id) {
		this.id=id;
		this.ordersNumItems=ordersNumItems;
		this.ordersCost=ordersCost;
		this.Itemid=item_id;
		this.customer_id=customer_id;
	}
	
	public Order(Long id, int item_id, int customer_id) {
		this.id = id;
		this.Itemid = item_id;
		this.customer_id = customer_id;
		
		this.ordersNumItems = 0;
		this.ordersCost = 0;
	}
	
	public Order(int item_id, int customer_id,  int ordersNumItems, int ordersCost) {
		this.Itemid = item_id;
		this.customer_id = customer_id;
		this.ordersNumItems = ordersNumItems ;
		this.ordersCost = ordersCost;
	}
	
	//=======================
	// Methods
	//=======================
	
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

	public int getOrdersCost() {
		return ordersCost;
	}

	public void setOrdersCost(int ordersCost) {
		this.ordersCost = ordersCost;
	}


	public int getItem_id() {
		return Itemid;
	}

	public void setItemid(int Itemid) {
		this.Itemid = Itemid;
	}

	public int getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}


}
