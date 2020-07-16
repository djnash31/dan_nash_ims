package com.qa.ims.persistence.dao;

import java.sql.Connection;
//import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;

import com.qa.ims.persistence.domain.Order;
import com.qa.ims.utils.Utils;

public class orderDao implements Dao<Order> {

		public static final Logger LOGGER = Logger.getLogger(CustomerDaoMysql.class);

		private String jdbcConnectionUrl;
		private String username;
		private String password;

		public orderDao(String username, String password) {
			this.jdbcConnectionUrl = "jdbc:mysql://" + Utils.MYSQL_URL + "/ims";
			this.username = "root";
			this.password = "Derpin12";
		}

		public orderDao(String jdbcConnectionUrl, String username, String password) {
			this.jdbcConnectionUrl = jdbcConnectionUrl;
			this.username = "root";
			this.password = "Derpin12";
		}

		Order orderFromResultSet(ResultSet resultSet) throws SQLException {
			Long id = resultSet.getLong("id");
			int Itemid =  resultSet.getInt("item_id");
			int customer_id = resultSet.getInt("customer_id");
			int ordersNumItems = resultSet.getInt("orderNumItems") ;
			int ordersCost = resultSet.getInt("ordersCost");
			Date ordersDate = resultSet.getDate("ordersDate");
			
			return new Order( id,  ordersNumItems,  ordersCost,  ordersDate,  Itemid,  customer_id);
		}

		/**
		 * Reads all order from the database
		 *
		 * @return A list of order
		 */
		public List<Order> readAll() {
			try (Connection connection = DriverManager.getConnection(jdbcConnectionUrl, username, password);
					Statement statement = connection.createStatement();
					ResultSet resultSet = statement.executeQuery("select * from orders");) {
				ArrayList<Order> orders = new ArrayList<>();
				while (resultSet.next()) {
					orders.add(orderFromResultSet(resultSet));
				}
				return orders;
			} catch (SQLException e) {
				LOGGER.debug(e.getStackTrace());
				LOGGER.error(e.getMessage());
			}
			return new ArrayList<>();
		}

		public Order readLatest() {
			try (Connection connection = DriverManager.getConnection(jdbcConnectionUrl, username, password);
					Statement statement = connection.createStatement();
					ResultSet resultSet = statement.executeQuery("SELECT * FROM orders ORDER BY id DESC LIMIT 1");) {
				resultSet.next();
				return orderFromResultSet(resultSet);
			} catch (Exception e) {
				LOGGER.debug(e.getStackTrace());
				LOGGER.error(e.getMessage());
			}
			return null;
		}

		/**
		 * Creates a customer in the database
		 *
		 * @param customer - takes in a customer object. id will be ignored
		 */
		public Order create(Order order) {
			try (Connection connection = DriverManager.getConnection(jdbcConnectionUrl, username, password);
					Statement statement = connection.createStatement();) {
				statement.executeUpdate("insert into orders ( item_id, customer_id, ordersDate, ordersNumItems, ordersCost) values(" + order.getOrdersCost()
						+ "," + order.getItem_id()+"," + order.getCustomer_id() +","+ order.getOrdersDate()+"," +order.getOrdersCost() +")");
				return readLatest();
			} catch (Exception e) {
				LOGGER.debug(e.getStackTrace());
				LOGGER.error(e.getMessage());
			}
			return null;
		}

		public Order readOrder(Long id) {
			try (Connection connection = DriverManager.getConnection(jdbcConnectionUrl, username, password);
					Statement statement = connection.createStatement();
					ResultSet resultSet = statement.executeQuery("SELECT FROM orders where id = " + id);) {
				resultSet.next();
				return orderFromResultSet(resultSet);
			} catch (Exception e) {
				LOGGER.debug(e.getStackTrace());
				LOGGER.error(e.getMessage());
			}
			return null;
		}

		/**
		 * Updates a orders in the database
		 *
		 * @param orders - takes in a customer object, the id field will be used to
		 *                 update that customer in the database
		 * @return
		 */
		public Order update(Order order) {
			try (Connection connection = DriverManager.getConnection(jdbcConnectionUrl, username, password);
					Statement statement = connection.createStatement();) {
				statement.executeUpdate("update orders set id ='" + order.getId() + "', item_id ='"
						+ order.getItem_id() + "' where id =" + order.getId());
				return readOrder(order.getId());
			} catch (Exception e) {
				LOGGER.debug(e.getStackTrace());
				LOGGER.error(e.getMessage());
			}
			return null;
		}

		/**
		 * Deletes a customer in the database
		 *
		 * @param id - id of the customer
		 */
		public void delete(long id) {
			try (Connection connection = DriverManager.getConnection(jdbcConnectionUrl, username, password);
					Statement statement = connection.createStatement();) {
				statement.executeUpdate("delete from orders where id = " + id);
			} catch (Exception e) {
				LOGGER.debug(e.getStackTrace());
				LOGGER.error(e.getMessage());
			}
		}

		@Override
		public Order create() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Order update() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public void delete() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void delete(Long id) {
			// TODO Auto-generated method stub
			
		}

	}

