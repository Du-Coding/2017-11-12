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
 * @author 杜毅
 * @date 2017/10/27
 * @main delete..
 * 
 */

public class TestDelete {

	public static void main(String[] args) {
		Session session = HibernateSessionFactory.getSession();
	    Transaction tran = session.beginTransaction();
	    System.out.println("删除School 103 信息和 Header 103信息");
	    /*School school = (School)session.get(School.class, 103);
	    session.delete(school);*/
	    //HQL
	    Query query = session.createQuery("delete School where id=102");
	    query.executeUpdate();
	    Query query1 = session.createQuery("from School");
	    List<School> list = query1.list();
	    for(int i=0;i<list.size();i++){
	    	School school1 = list.get(i);
	    	System.out.println("学校的编号："+school1.getId()+" "
					+"学校名称："+school1.getSname()+"  "
					+"校长的名字："+school1.getHeader().getHname());
	    }
	    tran.commit();
	    HibernateSessionFactory.closeSession();
	}

}
