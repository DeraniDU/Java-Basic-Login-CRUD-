package com.customer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CustomerDBUtil {
	
	public static List<Customer> validate(String userName, String password){
		ArrayList<Customer> cus = new ArrayList<>();
		
		//create database connection
		String url= "jdbc:mysql://localhost:3306/hotel";
		String user= "root";
		String pass="12345678";
		
		
		//validate
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con = DriverManager.getConnection(url, user,pass);
			Statement stmt = con.createStatement();
			String sql = "select * from new_table where Name ='"+userName+"' and Password='"+password+"'";
			ResultSet rs = stmt.executeQuery(sql);
			
			
			if(rs.next()) {
				int id = rs.getInt(1);
				String Name = rs.getNString(2);
				String Phone =rs.getNString(3);
				String Address =rs.getNString(4);
				String Email =rs.getNString(5);
				String PasswordU =rs.getNString(6);
				
				Customer c = new Customer(id,Name,Phone,Address,Email,PasswordU);
				
				cus.add(c);
				
				
			}
			
			
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		return cus;
		
	}
	
	
	

}
