package controllers;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import connector.DBConnector;
import servlets.Customer;
import servlets.CustomerReg;

public class AllCustomersDAO {
	
	static Connection con = null;
	static ResultSet rs = null;
	
	public static CustomerReg getAllCustomers(CustomerReg custReg) {
		
		Statement stmt = null;
		
		
		
		String searchQuery = "SELECT * FROM Customer";
		
		try {
			con = DBConnector.getConnection();
			stmt = con.createStatement();
			rs = stmt.executeQuery(searchQuery);
			boolean more = rs.next();
			
			if(!more) {
				System.out.println("No scores in a data set!");
				custReg.setEmpty(true);
				
			}
			
				
				while(rs.next()) {
				
				Customer cust = new Customer();
				
				String firstName = rs.getString("firstName");
				String lastName = rs.getString("lastName");			
				String custEmail = rs.getString("email");		
				String address1 = rs.getString("address_1");		
				String address2 = rs.getString("address_2");				
				String city = rs.getString("city");			
				String country = rs.getString("country");			
				String phone = rs.getString("phone");			
				String password = rs.getString("password");
				
				
				
				cust.setFirstName(firstName);
				cust.setLastName(lastName);
				cust.setEmail(custEmail);
				cust.setAddress1(address1);
				cust.setAddress2(address2);
				cust.setCity(city);
				cust.setCountry(country);
				cust.setPhone(phone);
				cust.setPassword(password);
				
			
				
				custReg.addCust(cust);
				System.out.println(custReg.getCustReg().size());
				custReg.setEmpty(false);
				
			}
			
		}catch(Exception e) {
			e.getMessage();
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
			if(con!=null) {
				try {
					con.close();
				}catch(Exception e) {}
				con = null;
			}
		}
	
		return custReg;
		
	}

}
