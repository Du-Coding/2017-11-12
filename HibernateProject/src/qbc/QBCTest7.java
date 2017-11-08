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
		//统计cbalance平均值
		//获取session对象
		Session session = HibernateSessionFactory.getSession();
		//创建事务对象
		Transaction tran = session.beginTransaction();
		//获取准则对象
		Criteria ca = session.createCriteria(Customer.class);
		//查询条件
		Projection po = Projections.avg("cbalance");
		Projection po1 = Projections.max("cbalance");
		//把条件加入准则对象中
		ca.setProjection(po);
		ca.setProjection(po1);
		//输出
		Double avgnum =(Double)ca.uniqueResult();
		System.out.println("account的平均值" + avgnum);
		Double maxnum = (Double)ca.uniqueResult();
		System.out.println("account的最大值" + maxnum);
		//多个统计函数
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
		//提交事务
		tran.commit();
		//关闭session
		HibernateSessionFactory.closeSession();

	}

}
