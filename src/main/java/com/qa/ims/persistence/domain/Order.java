package com.qa.ims.persistence.domain;

import java.util.Calendar;
import java.util.Date;

public class Order {

	private Long id;
	private int ordersNumItems;
	private int ordersCost;
	private Date ordersDate;
	private int Itemid;
	private int customer_id;
	
	public Order(Long id, int ordersNumItems, int ordersCost, Date ordersDate, int item_id, int customer_id) {
		this.id=id;
		this.ordersNumItems=ordersNumItems;
		this.ordersCost=ordersCost;
		this.ordersDate=ordersDate;
		this.Itemid=item_id;
		this.customer_id=customer_id;
	}
	
	public Order(Long id, int item_id, int customer_id) {
		this.id = id;
		this.Itemid = item_id;
		this.customer_id = customer_id;
		
		this.ordersNumItems = 0;
		this.ordersCost = 0;
//		this.ordersDate = 0;
		this.ordersDate = Calendar.getInstance().getTime();
		System.out.println("Date:" + this.ordersDate.toString());
		System.out.println("Date length:" + this.ordersDate.toString().length());
	}
	
	public Order(int item_id, int customer_id, Date ordersDate, int ordersNumItems, int ordersCost) {
		this.Itemid = item_id;
		this.customer_id = customer_id;
		this.ordersDate = Calendar.getInstance().getTime();
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

	public Date getOrdersDate() {
		return ordersDate;
	}

	public void setOrdersDate(Date ordersDate) {
		this.ordersDate = ordersDate;
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
