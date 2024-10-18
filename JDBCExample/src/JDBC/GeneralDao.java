package JDBC;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public abstract class GeneralDao<T> {
	private ConnectionDao connectionDao;
	
	public abstract T convertToObject(ResultSet rs);
	
	public GeneralDao() {
		this.connectionDao = new ConnectionDao();
    }
	
	//execute
	public boolean execute(String sql, Object ...value) {
		boolean result = false;
		try {
			Connection c = this.connectionDao.connectionWithSqlDb();
			PreparedStatement preparedStatement = c.prepareStatement(sql);
			int index = 1;
			if(value!=null && value.length >=1) {
				for(Object v: value) {
					preparedStatement.setObject(index++,v);
				}
			}
			preparedStatement.execute();
			preparedStatement.close();
			result = true;
			
		} catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
      return result;
    }
	
	//executeQuery
	public List<T> executeQuery(String query){
		List<T> objects = null;
		try {
			Connection c= this.connectionDao.connectionWithSqlDb();
			Statement statment = c.createStatement();
			ResultSet rs=statment.executeQuery(query);
			objects = new ArrayList<T>();
			while(rs.next()) {
				objects.add(convertToObject(rs));
			}

			
		} catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return objects;
	}

	}
	
	


