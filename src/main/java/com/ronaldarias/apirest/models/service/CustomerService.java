package com.ronaldarias.apirest.models.service;

import java.util.List;

import com.ronaldarias.apirest.models.entity.Customer;

public interface CustomerService {
	
	public List<Customer> getCustomers();

	public void saveCustomer(Customer theCustomer);

	public Customer getCustomer(Integer theId);

	public void deleteCustomer(Integer theId);

}
