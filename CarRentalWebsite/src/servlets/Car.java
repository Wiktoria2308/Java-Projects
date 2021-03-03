package servlets;

public class Car {

	
	private String brand;
	private String model;
	private String regNr;
	private String type;
	private int seats;
	private int doors;
	private String transmission;
	private int luggage;
	private boolean available;
	private double price;
	private String fullName;
	private String trFull;
	private String city;
	private String dateFrom;
	private String dateTo;
	
	

	

	

	public Car() {
		
	}
	
	public String getTrFull() {
		return trFull;
	}

	public void setTrFull(String trFull) {
		this.trFull = trFull;
	}
	
	public String getFullName() {
		return fullName;
	}
	
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getRegNr() {
		return regNr;
	}
	public void setRegNr(String regNr) {
		this.regNr = regNr;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getSeats() {
		return seats;
	}
	public void setSeats(int seats) {
		this.seats = seats;
	}
	public int getDoors() {
		return doors;
	}
	public void setDoors(int doors) {
		this.doors = doors;
	}
	public String getTransmission() {
		return transmission;
	}
	public void setTransmission(String transmission) {
		this.transmission = transmission;
	}
	public int getLuggage() {
		return luggage;
	}
	public void setLuggage(int luggage) {
		this.luggage = luggage;
	}
	public boolean getAvailable() {
		return available;
	}
	public void setAvailable(boolean available) {
		this.available = available;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Car [brand=" + brand + ", model=" + model + ", regNr=" + regNr + ", type=" + type + ", seats=" + seats
				+ ", doors=" + doors + ", transmission=" + transmission + ", luggage=" + luggage + ", available="
				+ available + ", price=" + price + ", fullName=" + fullName + ", trFull=" + trFull + "]";
	}
	
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	public String getDateFrom() {
		return dateFrom;
	}

	public void setDateFrom(String dateFrom) {
		this.dateFrom = dateFrom;
	}

	public String getDateTo() {
		return dateTo;
	}

	public void setDateTo(String dateTo) {
		this.dateTo = dateTo;
	}
	
	
	
}
