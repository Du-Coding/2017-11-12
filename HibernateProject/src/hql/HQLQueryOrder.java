package hql;


import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import pojo.Customer;
import util.HibernateSessionFactory;

public class HQLQueryOrder {

	public static void main(String[] args) {
		Session session = HibernateSessionFactory.getSession();
	    Transaction tran = session.beginTransaction();
	    //≈≈–Ú
	    //from + ¿‡√˚	
	    //Query query = session.createQuery("from Customer order by account desc");
	    Query query = session.createQuery("from Customer where cname like '’≈%' order by account desc");
	    List<Customer> list = query.list();
	    for(Customer cus : list){
	    	 System.out.println(cus.getAccount());
	 	     System.out.println(cus.getCname());
	 	     System.out.println(cus.getPassword());
	 	     System.out.println(cus.getCbalance());
	    }
	    tran.commit();
	    HibernateSessionFactory.closeSession();

	}

}
