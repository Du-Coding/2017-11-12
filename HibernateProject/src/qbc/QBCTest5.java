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
		//SQL�����ʽ
		//��ȡsession����
		Session session = HibernateSessionFactory.getSession();
		//�����������
		Transaction tran = session.beginTransaction();
		//��ȡ׼�����
		Criteria ca = session.createCriteria(Customer.class);
		//������ѯ���
		//Criterion con = Restrictions.sqlRestriction("{alias}.cname like ?", "��%", StringType.INSTANCE);
		Criterion con = Restrictions.sqlRestriction("{alias}.account < ?",444,IntegerType.INSTANCE);
		//������ѯ�������׼�������
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
