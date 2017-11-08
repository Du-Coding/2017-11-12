package oto2;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import pojo.BookOne;
import util.HibernateSessionFactory;

/**
 * 
 * @author ����
 * @date 2017/11/3
 *
 */

public class TestQuery {
    public static void main(String[] args) {
    	Session session = HibernateSessionFactory.getSession();
	    Transaction tran = session.beginTransaction();
	    
	    Query query = session.createQuery("from BookOne where cid = 1");
	    List<BookOne> ls = query.list();
	    for(BookOne bookone : ls){
	    	System.out.println("�����Ϊ��"+bookone.getCategoryone().getCid()
					+"  ������ƣ�"+bookone.getCategoryone().getCname()
					+"  ͼ���ţ�"+bookone.getBid()
					+"  ͼ�����ƣ�"+bookone.getBname()
					+"  ͼ��۸�"+bookone.getPrice());
	    }
	    
	    tran.commit();
	    HibernateSessionFactory.closeSession(); 
	
    }
}
