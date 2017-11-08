package hql;


import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import pojo.Customer;
import util.HibernateSessionFactory;

public class HQLQueryCount {

	public static void main(String[] args) {
		Session session = HibernateSessionFactory.getSession();
	    Transaction tran = session.beginTransaction();
	    //统计函数
	    //from + 类名	
	    Query query = session.createQuery("select max(account) from Customer");
	    Query query2 = session.createQuery("select max(account),min(account),avg(cbalance),count(*),sum(cbalance) from Customer");
	    Object[] obj = (Object[])query2.uniqueResult();
	    Integer max = (Integer)query.uniqueResult();
	    System.out.println("account最大值："+max);
	    System.out.print("account最大值："+obj[0]+" 最小值："+obj[1]+" 工资平均值："+obj[2]+" 总数："+obj[3]+" 工资总和： "+obj[4]);
	    tran.commit();
	    HibernateSessionFactory.closeSession();

	}

}
