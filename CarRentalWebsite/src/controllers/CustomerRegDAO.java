package controllers;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import connector.DBConnector;
import servlets.Customer;

public class CustomerRegDAO {
	
	static Connection currentCon = null;
	static ResultSet rs = null;
	
	public static Customer login(Customer cust) {
		
		Statement stmt = null;
		
		String email = cust.getEmail();
		String password = cust.getPassword();
		
		String searchQuery = "SELECT * FROM Customer WHERE email ='" + email + "' AND password = '" + password + "'";
		
		try {
			currentCon = DBConnector.getConnection();
			stmt = currentCon.createStatement();
			rs = stmt.executeQuery(searchQuery);
			boolean more = rs.next();
			
			if(!more) {
				System.out.println("User not present in a database");
				cust.setValid(false);
			}
			
			else {
				
				String firstName = rs.getString("firstName");
				System.out.println(firstName);
				String lastName = rs.getString("lastName");
				System.out.println(lastName);
				String custEmail = rs.getString("email");
				System.out.println(email);
				String address1 = rs.getString("address_1");
				System.out.println(address1);
				String address2 = rs.getString("address_2");
				System.out.println(address2);
				String city = rs.getString("city");
				System.out.println(city);
				String country = rs.getString("country");
				System.out.println(country);
				String phone = rs.getString("phone");
				System.out.println(phone);
				
				
				
				cust.setFirstName(firstName);
				cust.setLastName(lastName);
				cust.setEmail(custEmail);
				cust.setAddress1(address1);
				cust.setAddress2(address2);
				cust.setCity(city);
				cust.setCountry(country);
				cust.setPhone(phone);
				
				cust.setValid(true);
				
				
			}
		}catch(Exception ex) {
			ex.getMessage();
		}finally {
			if(rs!=null) {
				try {
					rs.close();
				}catch(Exception e) {}
				rs = null;
			}
			if(stmt!=null) {
				try {
					stmt.close();
				}catch(Exception e) {}
				stmt = null;
			}
			if(currentCon!=null) {
				try {
					currentCon.close();
				}catch(Exception e) {}
				currentCon = null;
			}
		}
		
		return cust;
		
	}

}
