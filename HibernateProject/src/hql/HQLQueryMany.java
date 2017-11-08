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
	    //查询Customer的cname、cbalance的信息
	    //select + 对象名1 + ，+ 对象名2 + ， + from + 类名
	    Query query = session.createQuery("select cus.cname , cus.cbalance from Customer as cus");
	    List<Object[]> list = query.list();
	    for(Object[] obj : list){
	    	 System.out.println(obj[0]+" "+obj[1]);
	    }
	    tran.commit();
	    HibernateSessionFactory.closeSession();

	}

}
