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

public class QBCTest4 {

	public static void main(String[] args) {
		//��ѯ����cname��%��account333-555
		//��ȡsession����
		Session session = HibernateSessionFactory.getSession();
		//�����������
		Transaction tran = session.beginTransaction();
		//��ȡ׼�����
	    Criteria ca = session.createCriteria(Customer.class);
	    //��ѯ������
	    Criterion con = Restrictions.or(Restrictions.like("cname", "��%"), Restrictions.between("account", 333, 555)); 
	    //��ѯ����������׼�������
	    ca.add(con);
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
