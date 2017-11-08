package mtm;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import pojo.Teacher;
import util.HibernateSessionFactory;

/**
 * 
 * @author 杜毅
 * @date 2017/11/7
 * @main 多对多，查询测试
 *
 */

public class TestQuery {

	public static void main(String[] args) {
		Session session = HibernateSessionFactory.getSession();
	    Transaction tran = session.beginTransaction();
	    
	    Query query = session.createQuery("");
	    List<Teacher> list = query.list();
	    for(Teacher teacher : list){
	    	System.out.println("教师编号："+teacher.getTid()+"教师名称："+teacher.getTname());
	    }
	    
	    tran.commit();
	    HibernateSessionFactory.closeSession(); 
	}
	
}
