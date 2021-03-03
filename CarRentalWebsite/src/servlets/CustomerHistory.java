package servlets;

import java.util.HashMap;

public class CustomerHistory {

	private HashMap<Customer, Car> custHist;
	
	public CustomerHistory() {
		setCustomerHistory(new HashMap<Customer, Car>());
	}

	public HashMap<Customer, Car> getCustomerHistory() {
		return custHist;
	}

	public void setCustomerHistory(HashMap<Customer, Car> custHist) {
		this.custHist = custHist;
	}
	
	//public void addEntry()
	
	
	
}
