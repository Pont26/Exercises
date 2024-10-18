package JDBC.Service;

import java.util.List;



import JDBC.EmployeeDao2;
import JDBCModel.Employee;

public class EmployeeService{
	private EmployeeDao2 employeeDao;
	public EmployeeService() {
		this.employeeDao = new EmployeeDao2();
	}
	 public String  addEmployee(Employee employee) {
	        String message="";
	        if(employeeDao.saveEmployee(employee)) {
	            message = "Employee added successfully";
	        } else {
	            message = "Employee not added";
	        }
	        return message;
	    }

	    public List<Employee> getEmployees() {
	        return employeeDao.getEmployees();
	    }
	    
	 
	

}
