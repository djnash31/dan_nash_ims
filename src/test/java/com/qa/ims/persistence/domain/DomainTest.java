package com.qa.ims.persistence.domain;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class DomainTest {
	
	@Test
	public void customerTest() {
		Domain domain = Domain.CUSTOMER;
		assertTrue(domain.getDescription().toLowerCase().contains("customer"));
	}
	
	@Test
	public void itemTest() {
		Domain domain = Domain.ITEM;
		assertTrue(domain.getDescription().toLowerCase().contains("item"));
	}
	
	@Test
	public void orderTest() {
		Domain domain = Domain.ORDER;
		assertTrue(domain.getDescription().toLowerCase().contains("items"));
	}
	
	@Test
	public void stopTest() {
		Domain domain = Domain.STOP;
		assertTrue(domain.getDescription().toLowerCase().contains("close"));
	}

//	@Test
//	public void test_domains() {
//		Domain test = new printDomains();
//		
//	}
	@Test
	public void test_domains2() {
		Domain test = Domain.getDomain();
		
	}
}
