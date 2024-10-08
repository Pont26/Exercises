package Exercise;

public class Register {
	private String name;
	private String email;
	private String ph;
	
	public Register(String name, String email, String ph) {
		this.setName(name);
		this.setEmail(email);
		this.setPh(ph);
	}

	public String getPh() {
		return ph;
	}

	public void setPh(String ph) {
		this.ph = ph;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "Name: "+ this.name + "| Email: "+ this.email + "| Phone Number: "+ this.ph;
		
	}

}
