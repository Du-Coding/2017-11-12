package hql;

/**
 * @author ����
 * @date 2017/10/24
 */

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import pojo.Customer;
import util.HibernateSessionFactory;

public class HQLUpdate {

	public static void main(String[] args) {
		Session session = HibernateSessionFactory.getSession();
	    Transaction tran = session.beginTransaction();
	    //��ѯȫ��Customer����������
	    //from + ����	
	    //�޸�
	    //update ���� set �ֶ� = ������ where �ֶ�=������
	    //Query query = session.createQuery("update Customer set cbalance=2000 where account=333");
	    Query query = session.createQuery("update Customer set cbalance = ? where account = ?");
	    query.setInteger(0, 4000);
	    query.setInteger(1, 444);
	    int rowCount = query.executeUpdate();
	    query = session.createQuery("from Customer");
	    List<Customer> list = query.list();
	    for(Customer cus : list){
	    	 System.out.println(cus.getAccount()+" "+
	    			 			cus.getCname()+" "+
	    			 			cus.getPassword()+" "+
	    			 			cus.getCbalance());
	    }
	    System.out.println(rowCount);
	    
	    //�޸�
	    //update ���� set �ֶ� = ������ where �ֶ�=������
	    
	    tran.commit();
	    HibernateSessionFactory.closeSession();

	}

}
