package com.tcs.ins.cust.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.ins.cust.service.CustomerSertvice;

@RestController("/api/v1/customer")
public class CustomerApi {

	private final CustomerSertvice customerSertvice;

	public CustomerApi(CustomerSertvice customerSertvice) {
		this.customerSertvice = customerSertvice;
	}

	@GetMapping(path = "/{id}")
	ResponseEntity<?> getCuatomerById(@RequestParam Long id) {
		return ResponseEntity.ok(customerSertvice.getCuatomerById(id));
	}
}
