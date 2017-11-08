package qbc;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

import pojo.Customer;
import util.HibernateSessionFactory;

public class QBCTest2 {

	public static void main(String[] args) {
		//条件查询：查询cbalance大于等于3000的所有人的信息
		//获取session对象
		Session session = HibernateSessionFactory.getSession();
	    Transaction tran = session.beginTransaction();
	    //获取准则对象
	    Criteria ca = session.createCriteria(Customer.class);
	    //根据工具类得到查询条件
	    /*Criterion con = Restrictions.eq("cbalance", 2000.0);
	    Criterion con1 = Restrictions.like("cname", "张%");
	    Criterion con2 = Restrictions.between("account", 111, 333);*/
	    //查询条件加入到准则条件中
	    /*ca.add(con);
	    ca.add(con1);
	    ca.add(con2);*/
	    //方法链编程风格
	    List<Customer> list = session.createCriteria(Customer.class)
	    						.add(Restrictions.eq("cbalance", 2000.0))
	    						.add(Restrictions.like("cname", "张%"))
	    						.add(Restrictions.between("account", 111, 333))
	    						.list();
	    //遍历信息
	    /*List<Customer> list = ca.list();*/
	    Iterator itea = list.iterator();
        while(itea.hasNext()){
        	Customer cus= (Customer)itea.next();
        	System.out.println(cus.getAccount());
    	    System.out.println(cus.getCname());
    	    System.out.println(cus.getPassword());
    	    System.out.println(cus.getCbalance()); 
        }
	    //提交事务
	    tran.commit();
	    //关闭session
	    HibernateSessionFactory.closeSession();

	}

}
