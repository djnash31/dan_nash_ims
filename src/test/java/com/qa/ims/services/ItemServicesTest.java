package com.qa.ims.services;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.qa.ims.controller.ItemController;
import com.qa.ims.persistence.dao.Dao;
import com.qa.ims.persistence.dao.itemDao;
import com.qa.ims.persistence.domain.Item;

@RunWith(MockitoJUnitRunner.class)
public class ItemServicesTest {
		@Mock
		private Dao<Item> itemDao;
		
		@InjectMocks
		private itemServices ItemServices;
		
		@Test
		public void ItemServicesCreateTest() {
			Item item = new Item("Chair", 600);
			ItemServices.create(item);
			Mockito.verify(itemDao, Mockito.times(1)).create(item);
		}
		@Test
		public void ItemServicesReadTest() {
			ItemServices.readAll();
			Mockito.verify(itemDao, Mockito.times(1)).readAll();
		}
		@Test 
		public void ItemServicesUpdateTest() {
			Item item = new Item("Xbox", 200);
			ItemServices.update(item);
			Mockito.verify(itemDao, Mockito.times(1)).update(item);
		}
		@Test
		public void ItemServicesDeleteTest() {
			ItemServices.delete(1L);
			Mockito.verify(itemDao, Mockito.times(1)).delete(1L);
		}
		@Test
		public void constructor() {
			ItemController test = new ItemController(new itemServices(new itemDao("","")));

		}
	}
