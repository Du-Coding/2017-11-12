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
 * @main insert into...
 * 
 */

public class TestSave {

	public static void main(String[] args) {
		Session session = HibernateSessionFactory.getSession();
	    Transaction tran = session.beginTransaction();
	    System.out.println("���Scool��Ϣ��Header��Ϣ");
	    School school = new School();
	    school.setId(103);
	    school.setSname("�����ѧ");
	    Header header = new Header();
	    header.setHname("��У��");
	    //������ϵ
	    school.setHeader(header);
	    header.setSchool(school);
	    //���ݱ���
	    session.save(school);
	    School school1 = (School)session.get(School.class,103 );
	    System.out.println("ѧУ�ı�ţ�"+school1.getId()+" "
	    					+"ѧУ���ƣ�"+school1.getSname()+"  "
	    					+"У�������֣�"+school1.getHeader().getHname());
	    tran.commit();
	    HibernateSessionFactory.closeSession();
	}

}
