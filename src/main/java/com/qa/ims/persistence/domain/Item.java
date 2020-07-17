package com.qa.ims.persistence.domain;

public class Item {
	private Long item_id;
	private String name;
	private int itemsPrice;
	
	public Item(String name, int itemsPrice) {
		this.name = name;
		this.itemsPrice = itemsPrice;
		}
	public Item(Long id, String name, int itemsPrice) {
		this.item_id = id;
		this.name=name;
		this.itemsPrice=itemsPrice;
	}
	public Long getItem_id() {
		return item_id;
	}
	public void setItemid(Long id) {
		this.item_id = id;
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
