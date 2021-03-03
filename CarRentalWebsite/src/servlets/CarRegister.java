package servlets;

import java.util.*;

public class CarRegister {

	private ArrayList<Car> carReg;
	private boolean isEmpty;
	
	public boolean isEmpty() {
		return isEmpty;
	}

	public void setEmpty(boolean isEmpty) {
		this.isEmpty = isEmpty;
	}

	public CarRegister() {
		setCarReg(new ArrayList<Car>());
	}

	public ArrayList<Car> getCarReg() {
		return carReg;
	}

	public void setCarReg(ArrayList<Car> carReg) {
		this.carReg = carReg;
	}
	
	public void addCar(Car car) {
		getCarReg().add(car);
	}
	
	public Car findCar(String id) {
		Car tmpCar = null;
		for(Car c : carReg) {
			if(c.getRegNr().equals(id)) {
				tmpCar = c;
			}
		}
		return tmpCar;
	}
	
	public void deleteCar(String id) {
		Car toRemove = this.findCar(id);
		carReg.remove(toRemove);
	}
	
	
	
	
	
}
