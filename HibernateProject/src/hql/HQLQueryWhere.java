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
	    //查询Customer的cname为张姓的用户信息的信息
	    //select 对象名1 , 对象名2 from 类名 where 属性名 like '张%_'
	    //Query query = session.createQuery("from Customer where cname like '张%'");
	    //Query query = session.createQuery("from Customer where cname ='张三'");
	    //Query query = session.createQuery("from Customer where account between 222 and 444");
	    //Query query = session.createQuery("from Customer where account not between 222 and 444");
	    //Query query = session.createQuery("from Customer where cname != '张三'");
	    //Query query = session.createQuery("from Customer where cname in ('张三','李四')");
	    //Query query = session.createQuery("from Customer where cname not in ('张三','李四')");
	    //Query query = session.createQuery("from Customer where cname = '张三' and account < 444");
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
