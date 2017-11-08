package mtm;

import org.hibernate.Session;
import org.hibernate.Transaction;

import pojo.Course;
import util.HibernateSessionFactory;

/**
 * 
 * @author duke
 * @date 2017/11/8
 * @main ¶à¶Ô¶à  É¾³ý²âÊÔ
 *
 */

public class TestDelete {

	public static void main(String[] args) {
		Session session = HibernateSessionFactory.getSession();
	    Transaction tran = session.beginTransaction();
	    
	    Course course = (Course) session.get(Course.class, 2);
	    session.delete(course);
	    
	    tran.commit();
	    HibernateSessionFactory.closeSession();
	}
	
}
