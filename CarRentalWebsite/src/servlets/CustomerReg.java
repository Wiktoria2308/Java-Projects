package servlets;

import java.util.*;

public class CustomerReg {
	
	private ArrayList<Customer> custReg;
	private boolean isEmpty;
	
	public boolean isEmpty() {
		return isEmpty;
	}

	public void setEmpty(boolean isEmpty) {
		this.isEmpty = isEmpty;
	}

	public CustomerReg() {
		
		setCustReg(new ArrayList<Customer>());
	}

	public ArrayList<Customer> getCustReg() {
		return custReg;
	}

	public void setCustReg(ArrayList<Customer> custReg) {
		this.custReg = custReg;
	}
	
	public void addCust(Customer cust) {
		getCustReg().add(cust);
	}
	
	public Customer findCustomer(String id) {
		
		Customer tmpCust = null;
		
		for(Customer c : custReg) {
			if(c.getEmail().equals(id)) {
				tmpCust = c;
			}
			
		}
		return tmpCust;
	}
	
	public void removeCustomer(String id) {
		Customer toRemove = this.findCustomer(id);
		getCustReg().remove(toRemove);
	}
	
	public String printAllCustomers() {
		String outcome = "";
		for(Customer c : custReg) {
			outcome += c.getFirstName() + c.getLastName() + c.getAddress1() + c.getAddress2() + "\n";
		}
		
		return outcome;
	}

	
	
	

}
