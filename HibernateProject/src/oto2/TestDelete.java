package oto2;

/**
 * 
 * @author ¶ÅÒã
 * @date 2017/11/3
 *
 */

import org.hibernate.Session;
import org.hibernate.Transaction;

import pojo.CategoryOne;
import util.HibernateSessionFactory;

public class TestDelete {
	
	public static void main(String[] args) {
		Session session = HibernateSessionFactory.getSession();
	    Transaction tran = session.beginTransaction();
	    
	    CategoryOne categoryone = (CategoryOne)session.get(CategoryOne.class, 1007);
	    session.delete(categoryone);
	    
	    tran.commit();
	    HibernateSessionFactory.closeSession(); 
	}

}
