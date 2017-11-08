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
	    //查询Customer的cname的信息
	    //select + 对象名 + from + 类名
	    Query query = session.createQuery("select distinct cname from Customer");
	    List<String> list = query.list();
	    for(String str : list){
	    	 System.out.println(str);
	    }
	    tran.commit();
	    HibernateSessionFactory.closeSession();

	}

}
