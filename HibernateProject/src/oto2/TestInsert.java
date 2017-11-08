package oto2;

import org.hibernate.Session;
import org.hibernate.Transaction;

import pojo.BookOne;
import pojo.CategoryOne;
import util.HibernateSessionFactory;

/**
 * 
 * @author 杜毅
 * @date 2017/11/3
 *
 */

public class TestInsert {

	public static void main(String[] args) {
		
		Session session = HibernateSessionFactory.getSession();
	    Transaction tran = session.beginTransaction();
	    
	    CategoryOne categoryone = new CategoryOne();
	    categoryone.setCname("计算机");
	    
	    BookOne bookone = new BookOne();
	    bookone.setBname("c#程序设计");
	    bookone.setPrice(45);
	    
	    BookOne bookone2 = new BookOne();
	    bookone2.setBname("Java程序设计");
	    bookone2.setPrice(60);
	    
	    categoryone.setBookone(bookone);
	    categoryone.setBookone(bookone2);
	    bookone.setCategoryone(categoryone);
	    bookone2.setCategoryone(categoryone);
	    
	    session.save(bookone);
	    session.save(bookone2);
	    
	    tran.commit();
	    HibernateSessionFactory.closeSession(); 

	}

}
