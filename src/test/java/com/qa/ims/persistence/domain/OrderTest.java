package com.qa.ims.persistence.domain;

import static org.junit.Assert.assertEquals;



import org.junit.Test;

public class OrderTest {

	@Test
	public void test_Constructor1() {
		Order test = new Order(1L, 1, 1, 1, 1);
	}
	@Test
	public void test_Constructor2() {
		Order test = new Order(1L, 1, 1);
	}
	@Test
	public void test_Constructor3() {
		Order test = new Order( 1, 1, 1, 1);
	}
	@Test
	public void test_getsetId() {
		Order test = new Order(1L, 1, 1);
		test.setId(2L);
		assertEquals((Long)2L, test.getId());
	}
	@Test
	public void test_getsetNum() {
		Order test = new Order(1L, 1, 1);
		test.setOrdersNumItems(2);
		assertEquals(2, test.getOrdersNumItems());
	}
	@Test
	public void test_getsetItems() {
		Order test = new Order(1L, 1, 1);
		test.setOrdersCost(5);
		assertEquals(5, test.getOrdersCost());
	}
	@Test
	public void test_getsetItemid() {
		Order test = new Order(1L, 1, 1);
		test.setItemid(2);
		assertEquals(2, test.getItem_id());
	}
	@Test
	public void test_getsetCustomerId() {
		Order test = new Order(1L, 1, 1);
		test.setCustomer_id(5);
		assertEquals(5, test.getCustomer_id());
	}

}
