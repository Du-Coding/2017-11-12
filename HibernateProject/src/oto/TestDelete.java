package oto;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import pojo.Header;
import pojo.School;
import util.HibernateSessionFactory;

/**
 * 
 * @author ����
 * @date 2017/10/27
 * @main delete..
 * 
 */

public class TestDelete {

	public static void main(String[] args) {
		Session session = HibernateSessionFactory.getSession();
	    Transaction tran = session.beginTransaction();
	    System.out.println("ɾ��School 103 ��Ϣ�� Header 103��Ϣ");
	    /*School school = (School)session.get(School.class, 103);
	    session.delete(school);*/
	    //HQL
	    Query query = session.createQuery("delete School where id=102");
	    query.executeUpdate();
	    Query query1 = session.createQuery("from School");
	    List<School> list = query1.list();
	    for(int i=0;i<list.size();i++){
	    	School school1 = list.get(i);
	    	System.out.println("ѧУ�ı�ţ�"+school1.getId()+" "
					+"ѧУ���ƣ�"+school1.getSname()+"  "
					+"У�������֣�"+school1.getHeader().getHname());
	    }
	    tran.commit();
	    HibernateSessionFactory.closeSession();
	}

}
