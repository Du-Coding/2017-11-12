package qbc;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;

import pojo.Customer;
import util.HibernateSessionFactory;

public class QBCTest {

	public static void main(String[] args) {
       Session session = HibernateSessionFactory.getSession();
       Transaction tran = session.beginTransaction();
       //查询customer全部数据
       //获取准则对象
       Criteria crit = session.createCriteria(Customer.class);
       List<Customer> list = crit.list();
       //for循环
       /*for(int i=0;i < list.size();i++){
    	 Customer cus = (Customer)list.get(i);
    	 System.out.println(cus.getAccount());
 	     System.out.println(cus.getCname());
 	     System.out.println(cus.getPassword());
 	     System.out.println(cus.getCbalance());
       }*/
       
       //for(类型 变量名:数组/集合){}
       /*for(Customer cus:list){
    	   System.out.println(cus.getAccount());
   	       System.out.println(cus.getCname());
   	       System.out.println(cus.getPassword());
   	       System.out.println(cus.getCbalance()); 
       }*/
       
       //迭代器Iterator
       /*Iterator itea = list.iterator();
        while(itea.hasNext()){
        	Customer cus= (Customer)itea.next();
        	System.out.println(cus.getAccount());
    	    System.out.println(cus.getCname());
    	    System.out.println(cus.getPassword());
    	    System.out.println(cus.getCbalance()); 
        }*/
       
      
       tran.commit();
       HibernateSessionFactory.closeSession();
	}
}
