package qbc;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;

import pojo.Customer;
import util.HibernateSessionFactory;

public class QBCTest7 {

	public static void main(String[] args) {
		//ͳ��cbalanceƽ��ֵ
		//��ȡsession����
		Session session = HibernateSessionFactory.getSession();
		//�����������
		Transaction tran = session.beginTransaction();
		//��ȡ׼�����
		Criteria ca = session.createCriteria(Customer.class);
		//��ѯ����
		Projection po = Projections.avg("cbalance");
		Projection po1 = Projections.max("cbalance");
		//����������׼�������
		ca.setProjection(po);
		ca.setProjection(po1);
		//���
		Double avgnum =(Double)ca.uniqueResult();
		System.out.println("account��ƽ��ֵ" + avgnum);
		Double maxnum = (Double)ca.uniqueResult();
		System.out.println("account�����ֵ" + maxnum);
		//���ͳ�ƺ���
		ProjectionList pl = Projections.projectionList();
		pl.add(Projections.max("cbalance"));
		pl.add(Projections.min("account"));
		pl.add(Projections.count("account"));
		pl.add(Projections.countDistinct("account"));
		pl.add(Projections.rowCount());
		ca.setProjection(pl);
		Object[] obj = (Object[])ca.uniqueResult();
		for(Object ob : obj){
			System.out.println(ob);
		}
		//�ύ����
		tran.commit();
		//�ر�session
		HibernateSessionFactory.closeSession();

	}

}
