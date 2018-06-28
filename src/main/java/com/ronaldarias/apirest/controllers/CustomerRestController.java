package com.ronaldarias.apirest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ronaldarias.apirest.models.entity.Customer;
import com.ronaldarias.apirest.models.service.CustomerService;

@RestController
@RequestMapping("/api")
public class CustomerRestController {

	// injection dependency
	@Autowired
	private CustomerService customerService;

	@GetMapping("/customers")
	public List<Customer> getCustomers() {
		return customerService.getCustomers();
	}

	@GetMapping("/customers/{customerId}")
	public Customer getCustomer(@PathVariable int customerId) {

		Customer customer = customerService.getCustomer(customerId);

		return customer;
	}

	// add mapping for POST /customers - add new customer

	@PostMapping("/customers")
	public Customer addCustomer(@RequestBody Customer customer) {

		// also just in case the pass an id in JSON ... set id to 0
		// this is force a save of new item ... instead of update

		customer.setId(null);

		customerService.saveCustomer(customer);

		return customer;

	}

}
