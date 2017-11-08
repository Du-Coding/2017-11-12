package hql;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import pojo.Customer;
import util.HibernateSessionFactory;

public class HQLQueryWhere {

	public static void main(String[] args) {
		
		Session session = HibernateSessionFactory.getSession();
	    Transaction tran = session.beginTransaction();
	    //��ѯCustomer��cnameΪ���յ��û���Ϣ����Ϣ
	    //select ������1 , ������2 from ���� where ������ like '��%_'
	    //Query query = session.createQuery("from Customer where cname like '��%'");
	    //Query query = session.createQuery("from Customer where cname ='����'");
	    //Query query = session.createQuery("from Customer where account between 222 and 444");
	    //Query query = session.createQuery("from Customer where account not between 222 and 444");
	    //Query query = session.createQuery("from Customer where cname != '����'");
	    //Query query = session.createQuery("from Customer where cname in ('����','����')");
	    //Query query = session.createQuery("from Customer where cname not in ('����','����')");
	    //Query query = session.createQuery("from Customer where cname = '����' and account < 444");
	    Query query = session.createQuery("from Customer where cname is not null");
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
