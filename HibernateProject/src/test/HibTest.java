package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import pojo.Customer;
import util.HibernateSessionFactory;

public class HibTest {

	public static void main(String[] args) {
		/*//��ȡ�����ļ�hibernate.cfg.xml������ӳ���ļ���������Hibernate
		Configuration conf = new Configuration().configure();
		//����SessionFactory
		SessionFactory sf = conf.buildSessionFactory();
		//��Session,ִ��CRUD����
		Session session = sf.openSession();//һ������*/
		Session session = HibernateSessionFactory.getSession();
	    //�����������
	    Transaction tran = session.beginTransaction();
	    //�������
	    Customer cus = new Customer();
	    cus.setAccount(555);
	    cus.setCname("����");
	    cus.setPassword("qwerdf");
	    cus.setCbalance(3000);
	    session.saveOrUpdate(cus);
	    //���췽���������
	    //�޸�,get()��load()������id
	    /*cus = (Customer)session.get(Customer.class,222);
	    cus.setCbalance(cus.getCbalance()+1000);
	    session.update(cus);*/
	    //ɾ��
	    /*cus = (Customer)session.get(Customer.class,222);
	    session.delete(cus);*/
	    //��ѯһ������,get(),ֻ�ܲ�where id = ***��
        /*cus = (Customer)session.get(Customer.class,111);
	    System.out.println(cus.getAccount());
	    System.out.println(cus.getCname());
	    System.out.println(cus.getPassword());
	    System.out.println(cus.getCbalance());*/
	    //�ύ����
	    tran.commit();
		//�ر�Seesion
		//session.close();
	    HibernateSessionFactory.closeSession();
	}

}
