package controllers;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import connector.DBConnector;
import servlets.Car;
import servlets.CarRegister;

public class carsByTypeDAO {
	
	static Connection con = null;
	static ResultSet rs = null;
	
	public static CarRegister getCarsByType(String city) {
		
		CarRegister carReg = new CarRegister();
		
		Statement stmt = null;
		
		String searchQuery = "SELECT * FROM Cars where city='" + city + "'";
		System.out.println(searchQuery);
		try {
			con = DBConnector.getConnection();
			stmt = con.createStatement();
			rs = stmt.executeQuery(searchQuery);
			boolean more = rs.next();
			
			if(!more) {
				System.out.println("No scores in a data set");
				carReg.setEmpty(true);
			}
			while(rs.next()) {
				Car car = new Car();
				
				String brand = rs.getString("brand");
				String regNr = rs.getString("regNr");
				String type = rs.getString("type");
				int seats = rs.getInt("seats");
				int doors = rs.getInt("doors");
				String transmission = rs.getString("transmission");
				int luggage = rs.getInt("luggage");
				String available = rs.getString("available");
				double price = rs.getDouble("price");
				String fullName = rs.getString("fullName");
				String trFull = rs.getString("trFull");
				
				car.setBrand(brand);
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
				carReg.addCar(car);
				
			
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
		return carReg;
		
	}

}
