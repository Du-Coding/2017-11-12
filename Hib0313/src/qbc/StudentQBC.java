package qbc;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;

import pojo.Student;
import util.HibernateSessionFactory;

public class StudentQBC {

	public static void main(String[] args) {
		Session session = HibernateSessionFactory.getSession();
		Transaction tran = session.beginTransaction();
		Criteria crit = session.createCriteria(Student.class);
	    List<Student> list = crit.list();
	    //for循环查询
	    for(int i = 0 ; i < list.size() ; i++){
	    	Student student = list.get(i);
	    	System.out.println(student.getNumber());
		    System.out.println(student.getName());
		    System.out.println(student.getGender());
		    System.out.println(student.getBlighty());
	    }
	    
	    //for(:){}查询
	    for(Student student : list){
	    	System.out.println(student.getNumber());
		    System.out.println(student.getName());
		    System.out.println(student.getGender());
		    System.out.println(student.getBlighty());
	    }
	    
	    //while查询
	    Iterator itea = list.iterator();
	    while(itea.hasNext()){
	    	Student student = (Student)itea.next();
	    	System.out.println(student.getNumber());
		    System.out.println(student.getName());
		    System.out.println(student.getGender());
		    System.out.println(student.getBlighty());
	    }

	}

}
