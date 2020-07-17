package com.qa.ims.controller;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import com.qa.ims.persistence.dao.Dao;
import com.qa.ims.persistence.dao.itemDao;
import com.qa.ims.persistence.domain.Customer;
import com.qa.ims.persistence.domain.Item;
import com.qa.ims.services.itemServices;

@RunWith(MockitoJUnitRunner.class)
public class ItemControllerTest {
	@Mock
	private itemServices ItemServices;
	
	@Spy
	@InjectMocks
	private ItemController itemController;
	

	@Test
	public void readAllTest() {
		ItemController itemController = new ItemController(ItemServices);
		List<Item> items = new ArrayList<>();
		items.add(new Item("Xbox", 100));
		items.add(new Item("Chair", 50));
		items.add(new Item("Bench", 20));
		Mockito.when(ItemServices.readAll()).thenReturn(items);
		assertEquals(items, itemController.readAll());
	}

	@Test
	public void createTest() {
		String name = "Controller";
		int itemsPrice = 50 ;
		Mockito.doReturn(name, itemsPrice).when(itemController).getInput();
		Item item = new Item(name, itemsPrice);
		Item savedItem = new Item(1L, "controller", 50);
		Mockito.when(ItemServices.create(item)).thenReturn(savedItem);
		assertEquals(savedItem, itemController.create());
	}

	/**
	 *
	 */
	@Test
	public void updateTest() {
		String id = "1";
		String name = "bench";
		int itemsPrice = 30;
		Mockito.doReturn(id, name, itemsPrice).when(itemController).getInput();
		Item item = new Item(1L, name, 30);
		Mockito.when(ItemServices.update(item)).thenReturn(item);
		assertEquals(item, itemController.update());
	}

	/**
	 * Delete doesn't return anything, so we can just verify that it calls the
	 * delete method
	 */
	@Test
	public void deleteTest() {
		String id = "1";
		Mockito.doReturn(id).when(itemController).getInput();
		itemController.delete();
		Mockito.verify(ItemServices, Mockito.times(1)).delete(1L);
	}
}

