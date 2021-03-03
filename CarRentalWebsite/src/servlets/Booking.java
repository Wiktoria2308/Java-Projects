package servlets;

public class Booking {

	private String carRegNr;
	private String carType;
	private String customerEmail;
	private String dateFrom;
	private String dateTo;

	public Booking() {
	}

	public Booking(String carType, String dateFrom, String dateTo) {
		this.setCarType(carType);
		this.setDateFrom(dateFrom);
		this.setDateTo(dateTo);
	}

	public Booking(String carRegNr, String carType, String customerEmail, String dateFrom, String dateTo) {
		this.setCarRegNr(carRegNr);
		this.setCarType(carType);
		this.setCustomerEmail(customerEmail);
		this.setDateFrom(dateFrom);
		this.setDateTo(dateTo);
	}

	public String getCarRegNr() {
		return carRegNr;
	}

	public String getCarType() {
		return carType;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public String getDateFrom() {
		return dateFrom;
	}

	public String getDateTo() {
		return dateTo;
	}

	public void setCarRegNr(String carRegNr) {
		this.carRegNr = carRegNr;
	}

	public void setCarType(String carType) {
		this.carType = carType;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public void setDateFrom(String dateFrom) {
		this.dateFrom = dateFrom;
	}

	public void setDateTo(String dateTo) {
		this.dateTo = dateTo;
	}
}
