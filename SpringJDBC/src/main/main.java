package main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Student;

import dao.DaoImpl;

public class main {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("Bean.xml");
		DaoImpl stud=(DaoImpl)ctx.getBean("sdao");
		/*System.out.println(stud.addStudent(new Student("101","b.tech","Suraj","938420")));*/
		/*List<Student> list=stud.getStudents();
		for(Student s:list){
			System.out.println(s.getSid()+"\t"+s.getName()+"\t"+s.getCourse()+"\t"+s.getPhone());
		}*/
		/*Student s=stud.getStudent("1002");
		System.out.println(s.getSid()+"\t"+s.getName()+"\t"+s.getCourse()+"\t"+s.getPhone());*/
		System.out.println(stud.deleteStudent("101"));
	}

}
