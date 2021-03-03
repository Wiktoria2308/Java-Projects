package controllers;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import connector.DBConnector;
import servlets.Car;

public class orderCarDAO {
	
	static Connection con = null;
	static ResultSet rs = null;
	
	public static Car getCar(Car car) {
		
		Statement stmt = null;
		
		String regNr = car.getRegNr();
		
		String sqlQuery = "SELECT * FROM Cars WHERE regNr='" + regNr + "'";
		System.out.println(sqlQuery);
		
		try {
			con = DBConnector.getConnection();
			stmt = con.createStatement();
			rs = stmt.executeQuery(sqlQuery);
			
			boolean more = rs.next();
			
			
			if(!more) {
				System.out.println("No data in dataset");
			}
			else {
				
				String brand = rs.getString("brand");
				
				String model = rs.getString("model");
				
				String type = rs.getString("type");
				
				int seats = rs.getInt("seats");
				
				int doors = rs.getInt("doors");
				
				String transmission = rs.getString("transmission");
			
				int luggage = rs.getInt("luggage");
				
				String available = rs.getString("available");
				double price = rs.getDouble("price");
				String fullName = rs.getString("fullName");
				
				String trFull = rs.getString("trFull");
				String city = rs.getString("city");
				System.out.println(trFull);
				
				car.setBrand(brand);
				car.setModel(model);
				car.setRegNr(regNr);
				car.setType(type);
				car.setSeats(seats);
				car.setDoors(doors);
				car.setTransmission(transmission);
				if(available.equals("true")) {
					car.setAvailable(true);
				}
				else {
					car.setAvailable(false);
				}
				car.setLuggage(luggage);
				car.setPrice(price);
				car.setFullName(fullName);
				car.setTrFull(trFull);
				car.setCity(city);
				
				
				
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
			if(con!=null) {
				try {
					con.close();
				}catch(Exception e) {}
				con = null;
			}
		}
		return car;
		
	}

}
