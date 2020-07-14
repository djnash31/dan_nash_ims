package com.qa.ims.persistence.domain;

public class Item {
	private Long id;
	private String name;
	private int itemsPrice;
	
	public Item(String name, int itemsPrice) {
		this.name = name;
		this.itemsPrice = itemsPrice;
		}
	public Item(Long id, String name, int itemsPrice) {
		this.id = id;
		this.name=name;
		this.itemsPrice=itemsPrice;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getitemsPrice() {
		return itemsPrice;
	}
	public void setitemsPrice(int itemsPrice) {
		this.itemsPrice = itemsPrice;
	}
	
}
