package oto;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import pojo.School;
import util.HibernateSessionFactory;

/**
 * 
 * @author ����
 * @date 2017/10/24
 * @main һ��һ��ѯ
 * 
 */

public class TestQuery {

	public static void main(String[] args) {
		Session session = HibernateSessionFactory.getSession();
	    Transaction tran = session.beginTransaction();
	    System.out.println("��ѯScool��Ϣ�õ�Header��Ϣ");
	    School school = (School)session.get(School.class,101 );
	    System.out.println("ѧУ�ı�ţ�"+school.getId()+" "
	    					+"ѧУ���ƣ�"+school.getSname()+"  "
	    					+"У�������֣�"+school.getHeader().getHname());
	    //HQL���?
	    Query query = session.createQuery("from School where id=102 ");
	    List<School> list = query.list();
	    for(int i=0;i<list.size();i++){
	    	School school1 = list.get(i);
	    	System.out.println("ѧУ�ı�ţ�"+school1.getId()+" "
					+"ѧУ���ƣ�"+school1.getSname()+"  "
					+"У�������֣�"+school1.getHeader().getHname());
	    }
	    //����header����Ϣ�õ�ѧУ����Ϣ
	    System.out.println("");
	    tran.commit();
	    HibernateSessionFactory.closeSession();
	}

}
