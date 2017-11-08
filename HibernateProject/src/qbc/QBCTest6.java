package qbc;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;

import pojo.Customer;
import util.HibernateSessionFactory;

public class QBCTest6 {

	public static void main(String[] args) {
		//查询单条记录
		//获取session对象
		Session session = HibernateSessionFactory.getSession();
		//创建事务对象
		Transaction tran = session.beginTransaction();
		//获取准则对象
		Criteria ca = session.createCriteria(Customer.class);
		//分页查询数据注意！！！
		ca.setFirstResult(3);
		ca.setMaxResults(1);
		//uniqueResult()只有对setMaxResult(1)时使用。
		Customer cus = (Customer)ca.uniqueResult();
		//遍历信息
	    System.out.println(cus.getAccount());
		System.out.println(cus.getCname());
		System.out.println(cus.getPassword());
		System.out.println(cus.getCbalance()); 
		//提交事务
		tran.commit();
		//关闭session
		HibernateSessionFactory.closeSession();

	}

}
