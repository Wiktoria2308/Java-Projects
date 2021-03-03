package bars;

public class FatBar {
	
	private String name;
	private double fat;
	
	public FatBar() {
		
	}
	
	public FatBar(String name, double fat) {
		this.name = name;
		this.fat = fat;
	}

	public String getName() {
		return name;
	}

	public double getFat() {
		return fat;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setFat(double fat) {
		this.fat = fat;
	}
	
	public String getDetails() {
		String details = "Name: " + name + " Fat: " + fat + "\t";
		return details;
	}

}
