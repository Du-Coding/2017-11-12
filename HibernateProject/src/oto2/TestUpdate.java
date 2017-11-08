package oto2;

import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * 
 * @author ¶ÅÒã
 * @date 2017/11/3
 *
 */


import pojo.BookOne;
import pojo.CategoryOne;
import util.HibernateSessionFactory;

public class TestUpdate {
	public static void main(String[] args) {
		Session session = HibernateSessionFactory.getSession();
	    Transaction tran = session.beginTransaction();
	    
	    BookOne bookone = (BookOne)session.get(BookOne.class, 1010);
	    CategoryOne categoryone = (CategoryOne) session.get(CategoryOne.class, 3);
	    bookone.setCategoryone(categoryone);
	    session.update(bookone);
	    
	    tran.commit();
	    HibernateSessionFactory.closeSession(); 
	}
}
