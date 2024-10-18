package JDBC;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLDataException;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import JDBCModel.Employee;

public class EmployeeDao2 extends GeneralDao<Employee>{
	private ConnectionDao connectionDao;

	@Override
	public Employee convertToObject(ResultSet rs) {
		  try {
	           return new Employee(
	                    rs.getInt("id"),
	                    rs.getString("name"),
	                    rs.getString("phone"),
	                    rs.getString("address"));
	        } catch (SQLException e) {
	            throw new RuntimeException(e);
	     }
	}
	
	public boolean createEmployeTable(){
		String createEmployeeTableSql = "CREATE TABLE Employee (" +
                "id INT PRIMARY KEY, " +
                "name VARCHAR(100), " +
                "phone VARCHAR(15), " +
                "address VARCHAR(255))";
		return execute(createEmployeeTableSql);
		
	}
		  
	public boolean saveEmployee(Employee employee) {
		String insertTableSQL = "INSERT INTO employee (name, phone, address) VALUES" + "(?,?,?)";
		return execute(insertTableSQL, employee.getName(), employee.getPhone(),employee.getAddress());
	}
	
	public boolean updateEmployee(Employee employee) {
        String updateTableSQL = "UPDATE employee SET name=?, phone = ?, address =? WHERE id=?";
        return execute(updateTableSQL, employee.getName(), employee.getPhone(), employee.getAddress());
    
	}
	
	public boolean deleteEmployee(int id) {
		String deleteTableSQL = "DELETE FROM employee WHERE id=?";
		return execute(deleteTableSQL,id);
    
	}
	
	public List<Employee> getEmployees(){
		String selectTableSQL = "SELECT * FROM employee";
		return executeQuery(selectTableSQL);
	}
	
}
	



	
	

