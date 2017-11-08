package mtm;

import org.hibernate.Session;
import org.hibernate.Transaction;

import pojo.Course;
import util.HibernateSessionFactory;

/**
 * 
 * @author 杜毅
 * @date 2017/11/8
 * @main 多对多 修改测试
 *
 */

public class TestUpdate {
	
	public static void main(String[] args) {
		Session session = HibernateSessionFactory.getSession();
	    Transaction tran = session.beginTransaction();
	    
	    Course course = (Course)session.get(Course.class, 2);
	    
	    tran.commit();
	    HibernateSessionFactory.closeSession();
	}
	
}
