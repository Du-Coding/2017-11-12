package hql;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import pojo.Customer;
import util.HibernateSessionFactory;

public class HQLQueryMany {

	public static void main(String[] args) {
		
		Session session = HibernateSessionFactory.getSession();
	    Transaction tran = session.beginTransaction();
	    //��ѯCustomer��cname��cbalance����Ϣ
	    //select + ������1 + ��+ ������2 + �� + from + ����
	    Query query = session.createQuery("select cus.cname , cus.cbalance from Customer as cus");
	    List<Object[]> list = query.list();
	    for(Object[] obj : list){
	    	 System.out.println(obj[0]+" "+obj[1]);
	    }
	    tran.commit();
	    HibernateSessionFactory.closeSession();

	}

}
