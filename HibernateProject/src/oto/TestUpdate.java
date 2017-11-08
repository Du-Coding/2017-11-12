package oto;

import org.hibernate.Session;
import org.hibernate.Transaction;

import pojo.Header;
import pojo.School;
import util.HibernateSessionFactory;

/**
 * 
 * @author ����
 * @date 2017/10/27
 * @main update...
 * 
 */

public class TestUpdate {

	public static void main(String[] args) {
		Session session = HibernateSessionFactory.getSession();
	    Transaction tran = session.beginTransaction();
	    System.out.println("����Scool102��Ϣ�޸�Header hname��Ϣ");
	    School school = (School)session.get(School.class,102);
	    school.getHeader().setHname("����");
	    //���ݱ���
	    session.update(school);
	    School school1 = (School)session.get(School.class,102 );
	    System.out.println("ѧУ�ı�ţ�"+school1.getId()+" "
	    					+"ѧУ���ƣ�"+school1.getSname()+"  "
	    					+"У�������֣�"+school1.getHeader().getHname());
	    
	    //hql
	    tran.commit();
	    HibernateSessionFactory.closeSession();
	}

}
