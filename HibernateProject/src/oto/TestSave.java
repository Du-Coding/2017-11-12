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
 * @main insert into...
 * 
 */

public class TestSave {

	public static void main(String[] args) {
		Session session = HibernateSessionFactory.getSession();
	    Transaction tran = session.beginTransaction();
	    System.out.println("添加Scool信息和Header信息");
	    School school = new School();
	    school.setId(103);
	    school.setSname("海洋大学");
	    Header header = new Header();
	    header.setHname("海校长");
	    //关联关系
	    school.setHeader(header);
	    header.setSchool(school);
	    //数据保存
	    session.save(school);
	    School school1 = (School)session.get(School.class,103 );
	    System.out.println("学校的编号："+school1.getId()+" "
	    					+"学校名称："+school1.getSname()+"  "
	    					+"校长的名字："+school1.getHeader().getHname());
	    tran.commit();
	    HibernateSessionFactory.closeSession();
	}

}
