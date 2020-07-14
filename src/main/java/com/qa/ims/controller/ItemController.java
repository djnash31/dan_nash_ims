package com.qa.ims.controller;

import java.util.List;

import org.apache.log4j.Logger;

import com.qa.ims.persistence.domain.Customer;
import com.qa.ims.persistence.domain.Item;
import com.qa.ims.services.CrudServices;
import com.qa.ims.utils.Utils;

public class ItemController implements CrudController<Item> {
	public static final Logger LOGGER = Logger.getLogger(ItemController.class);
	
	private CrudServices<Item> itemService;
	
	public ItemController(CrudServices<Item> itemService) {
		this.itemService = itemService;
	}
	

	String getInput() {
		return Utils.getInput();
	}
	
	/**
	 * Reads all customers to the logger
	 */
	@Override
	public List<Item> readAll() {
		List<Item> items = itemService.readAll();
		for(Item item : items) {
			LOGGER.info(item.toString());
		}
		return items;
	}

	/**
	 * Creates a customer by taking in user input
	 */
	@Override
	public Item create() {
		LOGGER.info("Please enter the name");
		String name = getInput();
		LOGGER.info("Please the item id");
		int itemsPrice = Integer.getInteger(getInput());
		Item item = itemService.create(new Item(name, itemsPrice));
		LOGGER.info("Item created");
		return item;
	}

	/**
	 * Updates an existing customer by taking in user input
	 */
	@Override
	public Item update() {
		LOGGER.info("Please enter the id of the item you would like to update");
		Long id = Long.valueOf(getInput());
		LOGGER.info("Please enter the name");
		String name = getInput();
		LOGGER.info("Please enter a surname");
		int itemsPrice = Integer.getInteger(getInput());
		Item item = itemService.update(new Item(id, name, itemsPrice));
		LOGGER.info("Item Updated");
		return item;
	}

	/**
	 * Deletes an existing customer by the id of the customer
	 */
	@Override
	public void delete() {
		LOGGER.info("Please enter the id of the item you would like to delete");
		Long id = Long.valueOf(getInput());
		itemService.delete(id);
	}


	public Item create(Item item ) {
		// TODO Auto-generated method stub
		return null;
	}


	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}


	public Item update(Item item) {
		// TODO Auto-generated method stub
		return null;
	}
	
}

}
