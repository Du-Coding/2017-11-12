package test0313;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import pojo0313.Stu0313;
import util.HibernateSessionFactory;

public class TestCriteria0313 {

	public static void main(String[] args) {
		Session session = HibernateSessionFactory.getSession();
		Transaction tran = session.beginTransaction();
		//1、
		List<Stu0313> list1 = (List<Stu0313>) session.createCriteria(Stu0313.class).add(Restrictions.eq("id", 1)).list();
		for(int i = 0 ; i < list1.size() ; i++){
			Stu0313 stu = list1.get(i);
			System.out.println(stu.getId()+" "+stu.getAge()+" "+stu.getName()+" "+stu.getSex()+" "+stu.getDept());
		}
		
		//2、
		List<Stu0313> list2 = (List<Stu0313>) session.createCriteria(Stu0313.class).add(Restrictions.eq("name", "张三")).list();
		for(int i = 0 ; i < list2.size() ; i++){
			Stu0313 stu = list2.get(i);
			System.out.println(stu.getId()+" "+stu.getAge()+" "+stu.getName()+" "+stu.getSex()+" "+stu.getDept());
		}
		
		//3、
		List<Stu0313> list3 = (List<Stu0313>) session.createCriteria(Stu0313.class).add(Restrictions.eq("sex", "女")).list();
		for(int i = 0 ; i < list3.size() ; i++){
			Stu0313 stu = list3.get(i);
			System.out.println(stu.getId()+" "+stu.getAge()+" "+stu.getName()+" "+stu.getSex()+" "+stu.getDept());
		}
		
		//4、
		List<Stu0313> list4 = (List<Stu0313>) session.createCriteria(Stu0313.class).add(Restrictions.lt("age", 23)).list();
		for(int i = 0 ; i < list4.size() ; i++){
			Stu0313 stu = list4.get(i);
			System.out.println(stu.getId()+" "+stu.getAge()+" "+stu.getName()+" "+stu.getSex()+" "+stu.getDept());
		}
		
		//5、
		List<Stu0313> list5 = (List<Stu0313>) session.createCriteria(Stu0313.class).add(Restrictions.between("id", 1, 5)).add(Restrictions.eq("sex", "女")).list();
		for(int i = 0 ; i < list5.size() ; i++){
			Stu0313 stu = list5.get(i);
			System.out.println(stu.getId()+" "+stu.getAge()+" "+stu.getName()+" "+stu.getSex()+" "+stu.getDept());
		}
		
		//6、
		List<Stu0313> list6 = (List<Stu0313>) session.createCriteria(Stu0313.class).add(Restrictions.like("name", "张%")).add(Restrictions.eq("sex", "男")).list();
		for(int i = 0 ; i < list6.size() ; i++){
			Stu0313 stu = list6.get(i);
			System.out.println(stu.getId()+" "+stu.getAge()+" "+stu.getName()+" "+stu.getSex()+" "+stu.getDept());
		}
		
		//7、
		Criteria crit1 = session.createCriteria(Stu0313.class);
		Order order1 = Order.desc("age");
		crit1.addOrder(order1);
		List<Stu0313> list7 = (List<Stu0313>)crit1.list();
		for(int i = 0 ; i < list7.size() ; i++){
			Stu0313 stu = list7.get(i);
			System.out.println(stu.getId()+" "+stu.getAge()+" "+stu.getName()+" "+stu.getSex()+" "+stu.getDept());
		}
		
		//8、
		Criteria crit2 = session.createCriteria(Stu0313.class);
		Order order2 = Order.asc("id");
		crit1.addOrder(order2);
		List<Stu0313> list8 = (List<Stu0313>)crit2.list();
		for(int i = 0 ; i < list8.size() ; i++){
			Stu0313 stu = list8.get(i);
			System.out.println(stu.getId()+" "+stu.getAge()+" "+stu.getName()+" "+stu.getSex()+" "+stu.getDept());
		}
		
		//9、
		Criteria crit3 = session.createCriteria(Stu0313.class);
		crit3.setFirstResult(1);
		crit3.setMaxResults(4);
		List<Stu0313> list9 = (List<Stu0313>)crit3.list();
		for(int i = 0 ; i < list9.size() ; i++){
			Stu0313 stu = list9.get(i);
			System.out.println(stu.getId()+" "+stu.getAge()+" "+stu.getName()+" "+stu.getSex()+" "+stu.getDept());
		}
		
		
		//10、
		Criteria crit4 = session.createCriteria(Stu0313.class);
		Projection pl = Projections.avg("age");
		crit4.setProjection(pl);
		Double dou = (Double)crit4.uniqueResult();
	    System.out.println(dou);
			
	    tran.commit();
	    HibernateSessionFactory.closeSession();

	}

}
