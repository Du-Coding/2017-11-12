package qbc;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Property;
import org.hibernate.criterion.Restrictions;

import pojo.Customer;
import util.HibernateSessionFactory;

public class QBCTest8 {

	public static void main(String[] args) {
		//投影查询——查询account大于等于333的cname
		//获取session对象
		Session session = HibernateSessionFactory.getSession();
		//创建事务对象
		Transaction tran = session.beginTransaction();
		//获取准则对象
		Criteria ca = session.createCriteria(Customer.class);	
		ca.setProjection(Property.forName("cname"));
		ca.add(Restrictions.ge("account", 222));
		List<String> ls = ca.list();
		for(int i = 0 ; i < ls.size() ; i++){
			System.out.println(ls.get(i));
		}
		//提交事务
		tran.commit();
		//关闭session
		HibernateSessionFactory.closeSession();

	}

}
