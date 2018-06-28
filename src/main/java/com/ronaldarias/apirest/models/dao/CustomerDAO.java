package com.ronaldarias.apirest.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.ronaldarias.apirest.models.entity.Customer;

public interface CustomerDAO extends CrudRepository<Customer, Integer> {

}
