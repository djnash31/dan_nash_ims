package com.qa.ims.controller;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;

import com.qa.ims.persistence.domain.Order;
import com.qa.ims.services.CrudServices;
import com.qa.ims.utils.Utils;


public class OrderController implements CrudController<Order> {
	
	public static final Logger LOGGER = Logger.getLogger(OrderController.class);

	private CrudServices<Order> orderService;

	public OrderController(CrudServices<Order> orderService) {
		this.orderService = orderService;
	}

	private String getInput() {
		return Utils.getInput();
	}
	private int getInt() {
		return Utils.getInt();
	}

	/**
	 * Reads all orders to the logger
	 */
	@Override
	public List<Order> readAll() {
		List<Order> orders = orderService.readAll();
		for (Order order : orders) {
			LOGGER.info(order.toString());
		}
		return orders;
	}

	/**
	 * Creates an order by taking in user input
	 */
	@Override
	public Order create() {
		LOGGER.info("Please enter the product ID");
		int Itemid = getInt();
		LOGGER.info("Please enter the customer ID");
		int customer_id = getInt();
		LOGGER.info("Please enter the cost");
		int ordersCost = getInt();
		LOGGER.info("Please enter the number of iems");
		int ordersNumItems = getInt();
//		LOGGER.info("What is the order date");
		Date ordersDate = Calendar.getInstance().getTime();
		Order order = orderService.create(new Order(Itemid, customer_id, ordersDate, ordersNumItems, ordersCost));
		LOGGER.info("Order created");
		return order;
	}

	/**
	 * Updates an existing order by taking in user input
	 */
	@Override
	public Order update() {
		LOGGER.info("Please enter the id of the Order you would like to update");
		Long id = Long.valueOf(getInput());
		LOGGER.info("Please enter the item ID");
		int Itemid = getInt();
		LOGGER.info("Please enter the customer ID");
		int customer_id = getInt();
		LOGGER.info("Please enter the cost");
		int ordersCost = getInt();
		LOGGER.info("Please enter the number of iems");
		int orderNumItems = getInt();
		LOGGER.info("What is the order date");
		Date ordersDate = Calendar.getInstance().getTime();
		Order order = orderService.update(new Order(id, Itemid, customer_id, ordersDate, orderNumItems, ordersCost));
		LOGGER.info("Order Updated");
		return order;
	}

	/**
	 * Deletes an existing customer by the id of the customer
	 */
	@Override
	public void delete() {
		LOGGER.info("Please enter the id of the Order you would like to delete");
		Long id = Long.valueOf(getInput());
		orderService.delete(id);
	}

	public Order create(Order order) {
		// TODO Auto-generated method stub
		return null;
	}

	public void delete(Long id) {
		// TODO Auto-generated method stub

	}

	public Order update(Order order) {
		// TODO Auto-generated method stub
		return null;
	}
}
