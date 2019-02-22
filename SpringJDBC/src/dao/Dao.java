package dao;

import java.util.List;

import com.Student;

public interface Dao {
	public String addStudent(Student s);
	public List<Student> getStudents();
	public Student getStudent(String sid);
	public String updateStudent(String sid,String name);
	public String deleteStudent(String sid);
}
