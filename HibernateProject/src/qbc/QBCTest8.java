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
		//ͶӰ��ѯ������ѯaccount���ڵ���333��cname
		//��ȡsession����
		Session session = HibernateSessionFactory.getSession();
		//�����������
		Transaction tran = session.beginTransaction();
		//��ȡ׼�����
		Criteria ca = session.createCriteria(Customer.class);	
		ca.setProjection(Property.forName("cname"));
		ca.add(Restrictions.ge("account", 222));
		List<String> ls = ca.list();
		for(int i = 0 ; i < ls.size() ; i++){
			System.out.println(ls.get(i));
		}
		//�ύ����
		tran.commit();
		//�ر�session
		HibernateSessionFactory.closeSession();

	}

}
