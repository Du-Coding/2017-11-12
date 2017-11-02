package test0313;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import pojo0313.Stu0313;
import util.HibernateSessionFactory;

public class TestHQL0313 {

	public static void main(String[] args) {
		Session session = HibernateSessionFactory.getSession();
		Transaction tran = session.beginTransaction();
		//1、
		Query query1 = session.createQuery(" from Stu0313 where id = ?");
		query1.setInteger(0, 1);
		List<Stu0313> list1 = query1.list();
		for(int i = 0 ; i < list1.size() ; i++){
			Stu0313 stu = list1.get(i);
			System.out.println(stu.getId()+" "+stu.getAge()+" "+stu.getName()+" "+stu.getSex()+" "+stu.getDept());
		}
		
		//2、
		Query query2 = session.createQuery(" from Stu0313 where name = ?");
		query2.setString(0, "张三");
		List<Stu0313> list2 = query2.list();
		for(int i = 0 ; i < list2.size() ; i++){
			Stu0313 stu = list2.get(i);
			System.out.println(stu.getId()+" "+stu.getAge()+" "+stu.getName()+" "+stu.getSex()+" "+stu.getDept());
		}
		
		//3、
		Query query3 = session.createQuery(" from Stu0313 where sex = ?");
		query3.setString(0, "女");
		List<Stu0313> list3 = query3.list();
		for(int i = 0 ; i < list3.size() ; i++){
			Stu0313 stu = list3.get(i);
			System.out.println(stu.getId()+" "+stu.getAge()+" "+stu.getName()+" "+stu.getSex()+" "+stu.getDept());
		}
		
		//4、
		Query query4 = session.createQuery(" from Stu0313 where age < ?");
		query4.setInteger(0, 23);
		List<Stu0313> list4 = query4.list();
		for(int i = 0 ; i < list4.size() ; i++){
			Stu0313 stu = list4.get(i);
			System.out.println(stu.getId()+" "+stu.getAge()+" "+stu.getName()+" "+stu.getSex()+" "+stu.getDept());
		}
		
		//5、
		Query query5 = session.createQuery(" from Stu0313 where sex = ? and id between ? and ?");
		query5.setString(0,"女");
		query5.setInteger(1, 1);
		query5.setInteger(2, 5);
		List<Stu0313> list5 = query5.list();
		for(int i = 0 ; i < list5.size() ; i++){
			Stu0313 stu = list5.get(i);
			System.out.println(stu.getId()+" "+stu.getAge()+" "+stu.getName()+" "+stu.getSex()+" "+stu.getDept());
		}
		
		//6、
		Query query6 = session.createQuery(" from Stu0313 where sex = ? and name like ?");
		query6.setString(0,"男");
		query6.setString(1, "张%");
		List<Stu0313> list6 = query6.list();
		for(int i = 0 ; i < list6.size() ; i++){
			Stu0313 stu = list6.get(i);
			System.out.println(stu.getId()+" "+stu.getAge()+" "+stu.getName()+" "+stu.getSex()+" "+stu.getDept());
		}
		
		//7、
		Query query7 = session.createQuery(" from Stu0313 order by age desc");
		List<Stu0313> list7 = query7.list();
		for(int i = 0 ; i < list7.size() ; i++){
			Stu0313 stu = list7.get(i);
			System.out.println(stu.getId()+" "+stu.getAge()+" "+stu.getName()+" "+stu.getSex()+" "+stu.getDept());
		}
		
		//8、
		Query query8 = session.createQuery(" from Stu0313 order by id asc");
		List<Stu0313> list8 = query8.list();
		for(int i = 0 ; i < list8.size() ; i++){
			Stu0313 stu = list8.get(i);
			System.out.println(stu.getId()+" "+stu.getAge()+" "+stu.getName()+" "+stu.getSex()+" "+stu.getDept());
		}
		
		//9、
		Query query9 = session.createQuery(" from Stu0313 order by id asc");
		query9.setFirstResult(1);
		query9.setMaxResults(4);
		List<Stu0313> list9 = query9.list();
		for(int i = 0 ; i < list9.size() ; i++){
			Stu0313 stu = list9.get(i);
			System.out.println(stu.getId()+" "+stu.getAge()+" "+stu.getName()+" "+stu.getSex()+" "+stu.getDept());
		}
		
		//10、
		Query query10 = session.createQuery(" select avg(age) from Stu0313");
		Double dou = (Double)query10.uniqueResult();
		System.out.println(dou);
		
		//11、
		
		tran.commit();
	    HibernateSessionFactory.closeSession();

	}

}
