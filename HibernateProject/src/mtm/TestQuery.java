package mtm;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import pojo.Teacher;
import util.HibernateSessionFactory;

/**
 * 
 * @author ����
 * @date 2017/11/7
 * @main ��Զ࣬��ѯ����
 *
 */

public class TestQuery {

	public static void main(String[] args) {
		Session session = HibernateSessionFactory.getSession();
	    Transaction tran = session.beginTransaction();
	    
	    Query query = session.createQuery("");
	    List<Teacher> list = query.list();
	    for(Teacher teacher : list){
	    	System.out.println("��ʦ��ţ�"+teacher.getTid()+"��ʦ���ƣ�"+teacher.getTname());
	    }
	    
	    tran.commit();
	    HibernateSessionFactory.closeSession(); 
	}
	
}
