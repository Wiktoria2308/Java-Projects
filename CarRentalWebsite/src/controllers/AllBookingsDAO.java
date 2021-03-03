package controllers;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.stream.Collectors;

import connector.DBConnector;
import servlets.Booking;
import servlets.CarRegister;

public class AllBookingsDAO {
	
	static Connection con = null;
	static ResultSet rs = null;
	
	public static CarRegister getNotBooked(Booking bookingToFind) {
		CarRegister carReg = new CarRegister();
		ArrayList<Booking> bookings = new ArrayList<>();
		ArrayList<String> bookedCarsRegNr = new ArrayList<>();
		Statement stmt = null;
		
		String searchQuery = "SELECT * FROM Bookings";
		
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
				
				Booking booking = new Booking();
				
				booking.setCarRegNr(rs.getString("carRegNr"));
				booking.setCarType(rs.getString("carType"));
				booking.setCustomerEmail(rs.getString("customerEmail"));
				booking.setDateFrom(rs.getString("dateFrom"));
				booking.setDateTo(rs.getString("dateTo"));
				
				bookings.add(booking);
				
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
		
		bookedCarsRegNr = bookings.stream()
		        .filter(booking -> booking.getCarType().equals(bookingToFind.getCarType()))
		        .filter(booking -> (booking.getDateFrom().compareTo(bookingToFind.getDateTo()) <= 0) &&
		        					(booking.getDateTo().compareTo(bookingToFind.getDateFrom()) >= 0))
		        .map(booking -> booking.getCarRegNr())
		        .collect(Collectors.toCollection(ArrayList::new));
		ArrayList<String> finalBookedCarsRegNr = bookedCarsRegNr;
		
		carReg = AllCarsDAO.getAllCars(carReg);
		carReg.setCarReg(carReg.getCarReg().stream()
							.filter(car -> car.getType().equals(bookingToFind.getCarType()))
							.filter(car -> !finalBookedCarsRegNr.contains(car.getRegNr()))
							.collect(Collectors.toCollection(ArrayList::new)));
		return carReg;
	}
}
