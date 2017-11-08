package oto;

import org.hibernate.Session;
import org.hibernate.Transaction;

import pojo.Header;
import pojo.School;
import util.HibernateSessionFactory;

/**
 * 
 * @author 杜毅
 * @date 2017/10/27
 * @main update...
 * 
 */

public class TestUpdate {

	public static void main(String[] args) {
		Session session = HibernateSessionFactory.getSession();
	    Transaction tran = session.beginTransaction();
	    System.out.println("根据Scool102信息修改Header hname信息");
	    School school = (School)session.get(School.class,102);
	    school.getHeader().setHname("敷衍");
	    //数据保存
	    session.update(school);
	    School school1 = (School)session.get(School.class,102 );
	    System.out.println("学校的编号："+school1.getId()+" "
	    					+"学校名称："+school1.getSname()+"  "
	    					+"校长的名字："+school1.getHeader().getHname());
	    
	    //hql
	    tran.commit();
	    HibernateSessionFactory.closeSession();
	}

}
