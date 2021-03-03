package bars;

public class ProteinBar {
	
	private String name;
	private double protein;
	
	
    public ProteinBar() {
		
	}

	public ProteinBar(String name, double protein) {
		this.name = name;
		this.protein = protein;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getProtein() {
		return protein;
	}

	public void setProtein(double protein) {
		this.protein = protein;
	}
	
	public String getDetails() {
		String details = "Name: " + name + " Protein: " + protein + "\t";
		return details;
	}
	
	

	
	
	
	
}
