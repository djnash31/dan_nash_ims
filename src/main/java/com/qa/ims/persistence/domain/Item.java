package com.qa.ims.persistence.domain;

public class Item {
	private Long Itemid;
	private String name;
	private int itemsPrice;
	
	public Item(String name, int itemsPrice) {
		this.name = name;
		this.itemsPrice = itemsPrice;
		}
	public Item(Long Itemid, String name, int itemsPrice) {
		this.Itemid = Itemid;
		this.name=name;
		this.itemsPrice=itemsPrice;
	}
	public Long getItemid() {
		return Itemid;
	}
	public void setItemid(Long Itemid) {
		this.Itemid = Itemid;
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
