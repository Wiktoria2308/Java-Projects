package bars;

public class FiberBar {
	
	private String name;
	private double fiber;
	
	
	public FiberBar() {
		
	}

	public FiberBar(String name, double fiber) {
		this.name = name;
		this.fiber = fiber;
	}

	public String getName() {
		return name;
	}

	public double getFiber() {
		return fiber;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setFiber(double fiber) {
		this.fiber = fiber;
	}
	
	public String getDetails() {
		String details = "Name: " + name + " Fiber: " + fiber + "\t";
		return details;
	}
}

