package com.qa.ims.persistence.domain;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ItemTest {
	@Test
	public void test_Constructor() {
		Item test = new Item("XBOX ", 200);
	}
	@Test
	public void test_Constructor2() {
		Item test = new Item(1L, "Xbox", 4 );
	}
	@Test
	public void test_getsetId() {
		Item test = new Item(1L, "Xbox", 4 );
		test.setItemid(2L);
		assertEquals((Long)2L, test.getItem_id());
	}
	@Test 
	public void test_getsetName() {
		Item test = new Item(1L, "Xbox", 4 );
		test.setName("James");
		assertEquals("James", test.getName());
	}
	@Test
	public void test_getsetPrice() {
		Item test = new Item(1L, "Xbox", 4 );
		test.setitemsPrice(200);
		assertEquals(200, test.getitemsPrice());
	}
	
}
