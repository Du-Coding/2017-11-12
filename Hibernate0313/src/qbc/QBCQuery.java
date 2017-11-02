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
		//��ȡsession����
		Session session = HibernateSessionFactory.getSession();
		//�����������
		Transaction tran = session.beginTransaction();
		//1����ѯȫ��ѧ����Ϣ
		Criteria crit = session.createCriteria(Student.class);
		List<Student> list = crit.list();
	    for(int i = 0 ; i < list.size() ; i++){
	    	Student student = list.get(i);
	    	System.out.println(student.getNumber()+" "+student.getName()+" "+student.getGender()+" "+student.getBlighty());
	    }
	    //2��������������ѯ����ѯѧ��numberΪ2����ˮ��ѧ������Ϣ��
		List<Student> list1 = session.createCriteria(Student.class)
				.add(Restrictions.eq("number", 2))
				.add(Restrictions.like("name", "ˮ%"))
				.list();
	    for(int i = 0 ; i < list1.size() ; i++){
	    	Student student = list1.get(i);
	    	System.out.println(student.getNumber()+" "+student.getName()+" "+student.getGender()+" "+student.getBlighty());
	    }
	    //3����ҳ��ѯ������number�����ѯ���ӵ�һλ��ʼ�飬������λ
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
	    //4�����ѯ����ѯѧ��numberΪ1�����������ѧ������Ϣ��
	    Criteria crit2 = session.createCriteria(Student.class);
	    Criterion con = Restrictions.or(Restrictions.like("name", "��%"), Restrictions.eq("number", 1));
	    crit2.add(con);
	    List<Student> list3 = crit2.list();
	    for(int i = 0 ; i < list3.size() ; i++){
	    	Student student = list3.get(i);
	    	System.out.println(student.getNumber()+" "+student.getName()+" "+student.getGender()+" "+student.getBlighty());
	    }
	    //5��SQL�����ʽ��ѯ����ѯ����ѧ���Ļ�����Ϣ��
	    Criteria crit3 = session.createCriteria(Student.class);
	    Criterion con1 = Restrictions.sqlRestriction("{alias}.name like ?", "��%", StringType.INSTANCE);
	    crit3.add(con1);
	    List<Student> list4 = crit3.list();
	    for(int i = 0 ; i < list4.size() ; i++){
	    	Student student = list4.get(i);
	    	System.out.println(student.getNumber()+" "+student.getName()+" "+student.getGender()+" "+student.getBlighty());
	    }
	    //6����ѯ�������ݣ���ѯ���ݿ��е�3�����ݡ�
	    Criteria crit4 = session.createCriteria(Student.class);
	    crit4.setFirstResult(3);
	    crit4.setMaxResults(1);
	    Student student = (Student)crit4.uniqueResult();
	    System.out.println(student.getNumber()+" "+student.getName()+" "+student.getGender()+" "+student.getBlighty());
		
	    //7��ͳ�ƺ�����ѯ����ѯѧ��������ţ���С��ţ����м������ݡ�
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
	    //8��ͶӰ��ѯ:number����2��Blighty
	    Criteria crit6 = session.createCriteria(Student.class);
	    crit6.setProjection(Property.forName("blighty"));
	    crit6.add(Restrictions.eq("number", 2));
	    List<Student> list5 = crit6.list();
	    for(int i = 0 ; i < list5.size() ; i++){
	    	System.out.println(list5.get(i));
	    }
	    //�ύ����
		tran.commit();
		//�ر�session
		HibernateSessionFactory.closeSession();		
	}
}
