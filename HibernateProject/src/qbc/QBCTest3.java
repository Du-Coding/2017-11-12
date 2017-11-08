package qbc;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;

import pojo.Customer;
import util.HibernateSessionFactory;

public class QBCTest3 {

	public static void main(String[] args) {
		//获取session对象
		Session session = HibernateSessionFactory.getSession();
	    Transaction tran = session.beginTransaction();
		//获取准则对象
		Criteria ca = session.createCriteria(Customer.class);
		
		//排序：account降序排序
		//获取order对象
		Order order = Order.desc("account");
		//order对象加入准则对象中
		ca.addOrder(order);
		//分页查询，0~9
		ca.setFirstResult(1);
		//显示对象
		ca.setMaxResults(2);
		//遍历信息
		List<Customer> list = ca.list();
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
