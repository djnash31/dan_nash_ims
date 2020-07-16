package com.qa.ims.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.qa.ims.persistence.dao.Dao;
import com.qa.ims.persistence.dao.itemDao;
import com.qa.ims.persistence.domain.Item;
import com.qa.ims.services.itemServices;

@RunWith(MockitoJUnitRunner.class)
public class ItemControllerTest {

	@Mock
	private Dao<Item> itemDao;
	
	@InjectMocks
	private itemServices ItemServices;
	
	@Test
	public void ItemServicesCreate() {
		Item item = new Item("Chair", 600);
		ItemServices.create(item);
		Mockito.verify(itemDao, Mockito.times(1)).create(item);
	}
	@Test
	public void ItemServicesRead() {
		ItemServices.readAll();
		Mockito.verify(itemDao, Mockito.times(1)).readAll();
	}
	@Test 
	public void ItemServicesUpdate() {
		Item item = new Item("Xbox", 200);
		ItemServices.update(item);
		Mockito.verify(itemDao, Mockito.times(1)).update(item);
	}
	@Test
	public void ItemServicesDelete() {
		ItemServices.delete(1L);
		Mockito.verify(itemDao, Mockito.times(1)).delete(1L);
	}
	@Test
	public void constructor() {
		ItemController test = new ItemController(new itemServices(new itemDao("","")));

	}
}

