package com.tcs.ins.cust.service;

import org.springframework.stereotype.Service;

import com.tcs.ins.cust.service.model.CustomerModel;

@Service
public class DefaultCustomerServices implements CustomerSertvice {

	@Override 
	public CustomerModel getCuatomerById(Long id) {
		CustomerModel customerModel = new CustomerModel();
		customerModel.setId(id);
		customerModel.setName("Mafidul");
		customerModel.setAddress("Kolkata");
		customerModel.setEmail("abc@gmail.com");
		customerModel.setMob(7896321452L);
		return customerModel;
	}
}
