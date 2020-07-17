//package com.qa.ims.services;
//
//@RunWith(MockitoJUnitRunner.class)
//
//public class OrderServicesTest {
//	package com.qa.ims.services;
//
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.Mockito;
//
//			@Mock
//			private Dao<Order> orderDao;
//			
//			@InjectMocks
//			private OrderServices orderServices;
//			
//			@Test
//			public void OrderServicesCreateTest() {
//				Order order = new Order(100L, 600, 1);
//				orderServices.create(order);
//				Mockito.verify(orderDao, Mockito.times(1)).create(item);
//			}
//			@Test
//			public void OrderServicesReadTest() {
//				ItemServices.readAll();
//				Mockito.verify(itemDao, Mockito.times(1)).readAll();
//			}
//			@Test 
//			public void OrderServicesUpdateTest() {
//				Order order = new Item(100, 200);
//				orderServices.update(order);
//				Mockito.verify(orderDao, Mockito.times(1)).update(order);
//			}
//			@Test
//			public void OrderServicesDeleteTest() {
//				orderServices.delete(1L);
//				Mockito.verify(orderDao, Mockito.times(1)).delete(1L);
//			}
//			@Test
//			public void constructor() {
//				OrderController test = new OrderController(new OrderServices(new orderDao("","")));
//
//			}
//		}
//
//}
