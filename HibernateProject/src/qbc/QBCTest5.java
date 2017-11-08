package qbc;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.hibernate.type.IntegerType;
import org.hibernate.type.StringType;

import pojo.Customer;
import util.HibernateSessionFactory;

public class QBCTest5 {

	public static void main(String[] args) {
		//SQL语句表达式
		//获取session对象
		Session session = HibernateSessionFactory.getSession();
		//创建事务对象
		Transaction tran = session.beginTransaction();
		//获取准则对象
		Criteria ca = session.createCriteria(Customer.class);
		//条件查询语句
		//Criterion con = Restrictions.sqlRestriction("{alias}.cname like ?", "李%", StringType.INSTANCE);
		Criterion con = Restrictions.sqlRestriction("{alias}.account < ?",444,IntegerType.INSTANCE);
		//条件查询对象加入准则对象中
	    ca.add(con);
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
