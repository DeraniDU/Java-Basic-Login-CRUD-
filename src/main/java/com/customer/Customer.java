package com.customer;

public class Customer {
	
	
	private int id;
	private String Name;
	private String Phone;
	private String Address;
	private String Email;
	private String Password;
	
	
	public Customer(int id, String name, String phone, String address, String email, String password) {
		
		this.id = id;
		Name = name;
		Phone = phone;
		Address = address;
		Email = email;
		Password = password;
	}


	public int getId() {
		return id;
	}


	


	public String getName() {
		return Name;
	}


	


	public String getPhone() {
		return Phone;
	}


	


	public String getAddress() {
		return Address;
	}


	
	public String getEmail() {
		return Email;
	}


	


	public String getPassword() {
		return Password;
	}


	
	
	
	
	
	
	

}
