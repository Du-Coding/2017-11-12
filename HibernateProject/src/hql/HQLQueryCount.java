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
	    //ͳ�ƺ���
	    //from + ����	
	    Query query = session.createQuery("select max(account) from Customer");
	    Query query2 = session.createQuery("select max(account),min(account),avg(cbalance),count(*),sum(cbalance) from Customer");
	    Object[] obj = (Object[])query2.uniqueResult();
	    Integer max = (Integer)query.uniqueResult();
	    System.out.println("account���ֵ��"+max);
	    System.out.print("account���ֵ��"+obj[0]+" ��Сֵ��"+obj[1]+" ����ƽ��ֵ��"+obj[2]+" ������"+obj[3]+" �����ܺͣ� "+obj[4]);
	    tran.commit();
	    HibernateSessionFactory.closeSession();

	}

}
