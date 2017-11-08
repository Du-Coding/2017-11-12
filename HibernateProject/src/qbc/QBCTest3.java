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
		//��ȡsession����
		Session session = HibernateSessionFactory.getSession();
	    Transaction tran = session.beginTransaction();
		//��ȡ׼�����
		Criteria ca = session.createCriteria(Customer.class);
		
		//����account��������
		//��ȡorder����
		Order order = Order.desc("account");
		//order�������׼�������
		ca.addOrder(order);
		//��ҳ��ѯ��0~9
		ca.setFirstResult(1);
		//��ʾ����
		ca.setMaxResults(2);
		//������Ϣ
		List<Customer> list = ca.list();
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
