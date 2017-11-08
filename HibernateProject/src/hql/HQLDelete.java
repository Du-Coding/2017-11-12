package hql;

/**
 * @author 杜毅
 * @date 2017/10/24
 */

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import pojo.Customer;
import util.HibernateSessionFactory;

public class HQLDelete {

	public static void main(String[] args) {
		Session session = HibernateSessionFactory.getSession();
	    Transaction tran = session.beginTransaction();
	    //查询全部Customer的所有数据
	    //from + 类名	
	    //删除
	    //delete 表名  where 字段=。。。
	    //Query query = session.createQuery("delete Customer  where account=333");
	    Query query = session.createQuery("delete Customer where account = ?");
	    query.setInteger(0, 444);
	    int rowCount = query.executeUpdate();
	    query = session.createQuery("from Customer");
	    List<Customer> list = query.list();
	    for(Customer cus : list){
	    	 System.out.println(cus.getAccount()+" "
	    			 			+cus.getCname()+" "
	    			 			+cus.getPassword()+" "
	    			 			+cus.getCbalance());
	    }
	    System.out.println(rowCount);
	    
	    tran.commit();
	    HibernateSessionFactory.closeSession();

	}

}
