package com.qa.ims.persistence.dao;

import java.util.List;


public interface Dao<T> {

//    List<T> readAll();
//     
//    T create(T t);
//     
//    T update(T t);
//     
//    void delete(long id);

	/**
	 * Creates a customer by taking in user input
	 */
	T create();
	
	List<T> readAll(); 

	/**
	 * Updates an existing customer by taking in user input
	 */
	T update();

	/**
	 * Deletes an existing customer by the id of the customer
	 */
	void delete();

	T create(T object);

	T update(T object);

	void delete(Long id);
	
}
	