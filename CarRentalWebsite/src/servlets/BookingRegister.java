package servlets;

import java.util.*;

public class BookingRegister {

	private ArrayList<Booking> bookingReg;
	private boolean isEmpty;

	public BookingRegister() {
		setBookingReg(new ArrayList<Booking>());
	}

	public ArrayList<Booking> getBookingReg() {
		return bookingReg;
	}

	public boolean isEmpty() {
		return isEmpty;
	}

	public void setBookingReg(ArrayList<Booking> bookingReg) {
		this.bookingReg = bookingReg;
	}

	public void setEmpty(boolean isEmpty) {
		this.isEmpty = isEmpty;
	}

	public void addBooking(Booking booking) {
		getBookingReg().add(booking);
	}

	public ArrayList<Booking> listBookingsForCustomer(String customerEmail) {
		ArrayList<Booking> tmpBooking = new ArrayList<>();
		for (Booking booking : bookingReg)
			if (booking.getCustomerEmail().equals(customerEmail))
				tmpBooking.add(booking);
		return tmpBooking;
	}

	public ArrayList<Booking> listBookingsForCar(String regNr) {
		ArrayList<Booking> tmpBooking = new ArrayList<>();
		for (Booking booking : bookingReg)
			if (booking.getCarRegNr().equals(regNr))
				tmpBooking.add(booking);
		return tmpBooking;
	}

}
