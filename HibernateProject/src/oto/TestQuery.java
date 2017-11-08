package oto;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import pojo.School;
import util.HibernateSessionFactory;

/**
 * 
 * @author 杜毅
 * @date 2017/10/24
 * @main 一对一查询
 * 
 */

public class TestQuery {

	public static void main(String[] args) {
		Session session = HibernateSessionFactory.getSession();
	    Transaction tran = session.beginTransaction();
	    System.out.println("查询Scool信息得到Header信息");
	    School school = (School)session.get(School.class,101 );
	    System.out.println("学校的编号："+school.getId()+" "
	    					+"学校名称："+school.getSname()+"  "
	    					+"校长的名字："+school.getHeader().getHname());
	    //HQL语句?
	    Query query = session.createQuery("from School where id=102 ");
	    List<School> list = query.list();
	    for(int i=0;i<list.size();i++){
	    	School school1 = list.get(i);
	    	System.out.println("学校的编号："+school1.getId()+" "
					+"学校名称："+school1.getSname()+"  "
					+"校长的名字："+school1.getHeader().getHname());
	    }
	    //根据header的信息得到学校的信息
	    System.out.println("");
	    tran.commit();
	    HibernateSessionFactory.closeSession();
	}

}
