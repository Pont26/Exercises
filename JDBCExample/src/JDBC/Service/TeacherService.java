package JDBC.Service;

import java.util.List;

import JDBC.TeacherDao;
import JDBCModel.Teacher;



public class TeacherService {
	private TeacherDao teacherDao;
	public TeacherService() {
		this.teacherDao = new TeacherDao();
	}
	 public String  addTeacher(Teacher teacher) {
	        String message="";
	        if(teacherDao.save(teacher)) {
	            message = "Teacher added successfully";
	        } else {
	            message = "Teacher not added";
	        }
	        return message;
	    }
	    public List<Teacher> getTeacher() {
	        return teacherDao.getAll();
	    }
	    
	 
	


}
