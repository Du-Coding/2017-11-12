package hql;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import pojo.Customer;
import util.HibernateSessionFactory;

public class HQLQueryOne {

	public static void main(String[] args) {
		
		Session session = HibernateSessionFactory.getSession();
	    Transaction tran = session.beginTransaction();
	    //��ѯCustomer��cname����Ϣ
	    //select + ������ + from + ����
	    Query query = session.createQuery("select distinct cname from Customer");
	    List<String> list = query.list();
	    for(String str : list){
	    	 System.out.println(str);
	    }
	    tran.commit();
	    HibernateSessionFactory.closeSession();

	}

}
