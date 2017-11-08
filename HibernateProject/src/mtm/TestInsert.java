package mtm;

import org.hibernate.Session;
import org.hibernate.Transaction;

import pojo.Course;
import pojo.Teacher;
import util.HibernateSessionFactory;

/**
 * 
 * @author 杜毅
 * @date 2017/11/7
 * @main 多对多，添加测试
 *
 */

public class TestInsert {
	public static void main(String[] args) {
		Session session = HibernateSessionFactory.getSession();
	    Transaction tran = session.beginTransaction();
	    
	    Course course = new Course();
	    course.setCid(2);
	    course.setCname("OOAD");
	    
	    /*Teacher teacher = new Teacher();
	    teacher.setTid(3);
	    teacher.setTname("777");
	    Teacher teacher2 = new Teacher();
	    teacher2.setTid(4);
	    teacher2.setTname("888");
	    
	    course.getTeacher().add(teacher);
	    course.getTeacher().add(teacher2);
	    
	    session.save(teacher);
	    session.save(teacher2);*/
	    session.save(course);
	    
	    tran.commit();
	    HibernateSessionFactory.closeSession(); 
	}

}
