package JDBCModel;

public class Teacher extends Person{
	public Teacher() {
		
	}
	 private String department;
	    private String position;
	 
	    public Teacher(String name, String phone, String address, String department,String position) {
	        super(name, phone, address);
	        this.department = department;
	        this.position = position;
	    }
	    public Teacher(int id, String name, String phone, String address,String department, String position) {
	        super(id, name, phone, address);
	        this.department = department;
	        this.position = position;
	    }

	    public String getDepartment() {
	        return department;
	    }

	    public void setDepartment(String department) {
	        this.department = department;
	    }

	    public String getPosition() {
	        return position;
	    }

	    public void setPosition(String position) {
	        this.position = position;
	    }
	    @Override
	    public String toString() {
	        return "Teacher{" +
	                super.toString() +
	                ", department='" + department + '\'' +
	                ", position='" + position + '\'' +
	                '}';
	    }
	}
