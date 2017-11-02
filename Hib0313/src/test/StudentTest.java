package test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import pojo.Student;
import util.HibernateSessionFactory;

public class StudentTest {

	public static void main(String[] args) {
		Session session = HibernateSessionFactory.getSession();
	    //创建事务对象
	    Transaction tran = session.beginTransaction();
	    Student student = new Student();
	    
	    //添加数据
	    student.setName("王二");
	    student.setGender("女");
	    student.setBlighty("大连市");
	    /*student.setName("张东源");
	    student.setGender("男");
	    student.setBlighty("通辽市");*/
	    session.save(student);
	    
	    
	    //修改数据
	    student = (Student)session.get(Student.class,1);
	    /*student.setGender("女");
	    session.update(student);*/
	    
	    //查询数据
	    /*System.out.println(student.getNumber());
	    System.out.println(student.getName());
	    System.out.println(student.getGender());
	    System.out.println(student.getBlighty());*/
	    
	    //删除数据
	    /*session.delete(student);*/
	    
	    //提交事务
	    tran.commit();
	    //关闭Session
	    HibernateSessionFactory.closeSession();
	}
}
