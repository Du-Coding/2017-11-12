package mtm;

import org.hibernate.Session;
import org.hibernate.Transaction;

import pojo.Course;
import util.HibernateSessionFactory;

/**
 * 
 * @author ����
 * @date 2017/11/8
 * @main ��Զ� �޸Ĳ���
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
