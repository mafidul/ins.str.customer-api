package com.tcs.ins.cust.service.model;

public class CustomerModel {
	
	private Long id;
	private String name;
	private String address;
	private String email;
	private Long mob;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getMob() {
		return mob;
	}

	public void setMob(Long mob) {
		this.mob = mob;
	}

	@Override
	public String toString() {
		return "CustomerModel [id=" + id + ", name=" + name + ", address=" + address + ", email=" + email + ", mob="
				+ mob + "]";
	}
}
