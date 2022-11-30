package com.yemeksepeti.controller;

import com.yemeksepeti.model.Customer;
import com.yemeksepeti.service.CustomerService;

import java.util.List;

public class CustomerController {

    CustomerService customerService = new CustomerService();

    public List<Customer> findAllCustomers(){
        List<Customer> customers = customerService.findAll();
        return customers;
    }

}
