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
       //��ѯcustomerȫ������
       //��ȡ׼�����
       Criteria crit = session.createCriteria(Customer.class);
       List<Customer> list = crit.list();
       //forѭ��
       /*for(int i=0;i < list.size();i++){
    	 Customer cus = (Customer)list.get(i);
    	 System.out.println(cus.getAccount());
 	     System.out.println(cus.getCname());
 	     System.out.println(cus.getPassword());
 	     System.out.println(cus.getCbalance());
       }*/
       
       //for(���� ������:����/����){}
       /*for(Customer cus:list){
    	   System.out.println(cus.getAccount());
   	       System.out.println(cus.getCname());
   	       System.out.println(cus.getPassword());
   	       System.out.println(cus.getCbalance()); 
       }*/
       
       //������Iterator
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
