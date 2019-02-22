package dao;

import java.sql.Types;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import com.Student;

public class DaoImpl implements Dao{
	private DataSource dataSource;
	private JdbcTemplate jtemplate;
	
	public void setDataSource(DataSource dataSource){
		this.dataSource=dataSource;
		jtemplate=new JdbcTemplate(this.dataSource);
	}

	@Override
	public String addStudent(Student s) {
		
		String sql="insert into Student values(?,?,?,?)";
		int val=jtemplate.update(sql,s.getSid(),s.getCourse(),s.getName(),s.getPhone());
		if(val>0)
			return "Student Created!!!";
		else
			return "Student not created!!!";
	}

	@Override
	public List<Student> getStudents() {
		List<Student> list=jtemplate.query("select * from student", new StudentMapper());
		return list;
	}

	@Override
	public Student getStudent(String sid) {
		Student s=jtemplate.queryForObject("select * from student where sid=?", new Object[]{sid},new StudentMapper());
		return s;
	}

	@Override
	public String updateStudent(String sid, String name) {
		int rows=jtemplate.update("update student set name=? where sid=?", new Object[]{name,sid},new int[]{Types.VARCHAR,Types.VARCHAR});
		if(rows>0)
			return "Student Updated!!!";
		else
			return "Enter correct sid!!!";
	}

	@Override
	public String deleteStudent(String sid) {
		int rows=jtemplate.update("delete from student where sid=?",new Object[]{sid});
		if(rows>0)
			return "Student Deleted!!!";
		else
			return "Enter Correct sid!!!";
	}

}
