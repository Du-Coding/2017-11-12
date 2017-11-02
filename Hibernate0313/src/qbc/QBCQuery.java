package qbc;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Property;
import org.hibernate.criterion.Restrictions;
import org.hibernate.type.StringType;

import pojo.Student;
import util.HibernateSessionFactory;

public class QBCQuery {
	public static void main(String[] args) {
		//获取session对象
		Session session = HibernateSessionFactory.getSession();
		//创建事务对象
		Transaction tran = session.beginTransaction();
		//1、查询全部学生信息
		Criteria crit = session.createCriteria(Student.class);
		List<Student> list = crit.list();
	    for(int i = 0 ; i < list.size() ; i++){
	    	Student student = list.get(i);
	    	System.out.println(student.getNumber()+" "+student.getName()+" "+student.getGender()+" "+student.getBlighty());
	    }
	    //2、方法链条件查询：查询学生number为2，姓水的学生的信息。
		List<Student> list1 = session.createCriteria(Student.class)
				.add(Restrictions.eq("number", 2))
				.add(Restrictions.like("name", "水%"))
				.list();
	    for(int i = 0 ; i < list1.size() ; i++){
	    	Student student = list1.get(i);
	    	System.out.println(student.getNumber()+" "+student.getName()+" "+student.getGender()+" "+student.getBlighty());
	    }
	    //3、分页查询：根据number降序查询，从第一位开始查，最多查两位
	    Criteria crit1 = session.createCriteria(Student.class);
	    Order order = Order.desc("number");
	    crit1.addOrder(order);
	    crit1.setFirstResult(0);
	    crit1.setMaxResults(3);
	    List<Student> list2 = crit1.list();
	    for(int i = 0 ; i < list2.size() ; i++){
	    	Student student = list2.get(i);
	    	System.out.println(student.getNumber()+" "+student.getName()+" "+student.getGender()+" "+student.getBlighty());
	    }
	    //4、或查询：查询学生number为1，或者姓李的学生的信息。
	    Criteria crit2 = session.createCriteria(Student.class);
	    Criterion con = Restrictions.or(Restrictions.like("name", "李%"), Restrictions.eq("number", 1));
	    crit2.add(con);
	    List<Student> list3 = crit2.list();
	    for(int i = 0 ; i < list3.size() ; i++){
	    	Student student = list3.get(i);
	    	System.out.println(student.getNumber()+" "+student.getName()+" "+student.getGender()+" "+student.getBlighty());
	    }
	    //5、SQL语句表达式查询：查询姓张学生的基本信息。
	    Criteria crit3 = session.createCriteria(Student.class);
	    Criterion con1 = Restrictions.sqlRestriction("{alias}.name like ?", "张%", StringType.INSTANCE);
	    crit3.add(con1);
	    List<Student> list4 = crit3.list();
	    for(int i = 0 ; i < list4.size() ; i++){
	    	Student student = list4.get(i);
	    	System.out.println(student.getNumber()+" "+student.getName()+" "+student.getGender()+" "+student.getBlighty());
	    }
	    //6、查询单条数据：查询数据库中第3条数据。
	    Criteria crit4 = session.createCriteria(Student.class);
	    crit4.setFirstResult(3);
	    crit4.setMaxResults(1);
	    Student student = (Student)crit4.uniqueResult();
	    System.out.println(student.getNumber()+" "+student.getName()+" "+student.getGender()+" "+student.getBlighty());
		
	    //7、统计函数查询：查询学生的最大编号，最小编号，共有几条数据。
	    Criteria crit5 = session.createCriteria(Student.class);
	    ProjectionList pl = Projections.projectionList();
	    pl.add(Projections.max("number"));
	    pl.add(Projections.min("number"));
	    pl.add(Projections.count("number"));
	    crit5.setProjection(pl);
	    Object[] obj = (Object[])crit5.uniqueResult();
	    for(Object ob : obj){
	    	System.out.println(ob);
	    }
	    //8、投影查询:number等于2的Blighty
	    Criteria crit6 = session.createCriteria(Student.class);
	    crit6.setProjection(Property.forName("blighty"));
	    crit6.add(Restrictions.eq("number", 2));
	    List<Student> list5 = crit6.list();
	    for(int i = 0 ; i < list5.size() ; i++){
	    	System.out.println(list5.get(i));
	    }
	    //提交事务
		tran.commit();
		//关闭session
		HibernateSessionFactory.closeSession();		
	}
}
