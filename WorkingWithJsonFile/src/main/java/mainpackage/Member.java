package mainpackage;

public class Member {
	
	private String name;
	private String ID;
	
	public Member() {
		
	}

	public Member(String name, String id) {
		this.name = name;
		this.ID = id;
	}

	public String getName() {
		return name;
	}

	public String getID() {
		return ID;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setID(String iD) {
		ID = iD;
	}
	
	public String toString() {
	    return "Name: " + name + " ID: " + ID;
	}
}
