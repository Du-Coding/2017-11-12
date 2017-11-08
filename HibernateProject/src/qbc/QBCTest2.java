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
		//������ѯ����ѯcbalance���ڵ���3000�������˵���Ϣ
		//��ȡsession����
		Session session = HibernateSessionFactory.getSession();
	    Transaction tran = session.beginTransaction();
	    //��ȡ׼�����
	    Criteria ca = session.createCriteria(Customer.class);
	    //���ݹ�����õ���ѯ����
	    /*Criterion con = Restrictions.eq("cbalance", 2000.0);
	    Criterion con1 = Restrictions.like("cname", "��%");
	    Criterion con2 = Restrictions.between("account", 111, 333);*/
	    //��ѯ�������뵽׼��������
	    /*ca.add(con);
	    ca.add(con1);
	    ca.add(con2);*/
	    //��������̷��
	    List<Customer> list = session.createCriteria(Customer.class)
	    						.add(Restrictions.eq("cbalance", 2000.0))
	    						.add(Restrictions.like("cname", "��%"))
	    						.add(Restrictions.between("account", 111, 333))
	    						.list();
	    //������Ϣ
	    /*List<Customer> list = ca.list();*/
	    Iterator itea = list.iterator();
        while(itea.hasNext()){
        	Customer cus= (Customer)itea.next();
        	System.out.println(cus.getAccount());
    	    System.out.println(cus.getCname());
    	    System.out.println(cus.getPassword());
    	    System.out.println(cus.getCbalance()); 
        }
	    //�ύ����
	    tran.commit();
	    //�ر�session
	    HibernateSessionFactory.closeSession();

	}

}
