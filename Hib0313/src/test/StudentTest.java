package test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import pojo.Student;
import util.HibernateSessionFactory;

public class StudentTest {

	public static void main(String[] args) {
		Session session = HibernateSessionFactory.getSession();
	    //�����������
	    Transaction tran = session.beginTransaction();
	    Student student = new Student();
	    
	    //�������
	    student.setName("����");
	    student.setGender("Ů");
	    student.setBlighty("������");
	    /*student.setName("�Ŷ�Դ");
	    student.setGender("��");
	    student.setBlighty("ͨ����");*/
	    session.save(student);
	    
	    
	    //�޸�����
	    student = (Student)session.get(Student.class,1);
	    /*student.setGender("Ů");
	    session.update(student);*/
	    
	    //��ѯ����
	    /*System.out.println(student.getNumber());
	    System.out.println(student.getName());
	    System.out.println(student.getGender());
	    System.out.println(student.getBlighty());*/
	    
	    //ɾ������
	    /*session.delete(student);*/
	    
	    //�ύ����
	    tran.commit();
	    //�ر�Session
	    HibernateSessionFactory.closeSession();
	}
}
