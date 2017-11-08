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
		//��ѯ������¼
		//��ȡsession����
		Session session = HibernateSessionFactory.getSession();
		//�����������
		Transaction tran = session.beginTransaction();
		//��ȡ׼�����
		Criteria ca = session.createCriteria(Customer.class);
		//��ҳ��ѯ����ע�⣡����
		ca.setFirstResult(3);
		ca.setMaxResults(1);
		//uniqueResult()ֻ�ж�setMaxResult(1)ʱʹ�á�
		Customer cus = (Customer)ca.uniqueResult();
		//������Ϣ
	    System.out.println(cus.getAccount());
		System.out.println(cus.getCname());
		System.out.println(cus.getPassword());
		System.out.println(cus.getCbalance()); 
		//�ύ����
		tran.commit();
		//�ر�session
		HibernateSessionFactory.closeSession();

	}

}
