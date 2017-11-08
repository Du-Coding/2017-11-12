package oto2;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import pojo.BookOne;
import util.HibernateSessionFactory;

/**
 * 
 * @author 杜毅
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
	    	System.out.println("类别编号为："+bookone.getCategoryone().getCid()
					+"  类别名称："+bookone.getCategoryone().getCname()
					+"  图书编号："+bookone.getBid()
					+"  图书名称："+bookone.getBname()
					+"  图书价格："+bookone.getPrice());
	    }
	    
	    tran.commit();
	    HibernateSessionFactory.closeSession(); 
	
    }
}
