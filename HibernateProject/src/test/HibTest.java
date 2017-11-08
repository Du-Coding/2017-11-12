package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import pojo.Customer;
import util.HibernateSessionFactory;

public class HibTest {

	public static void main(String[] args) {
		/*//读取配置文件hibernate.cfg.xml（加载映射文件），启动Hibernate
		Configuration conf = new Configuration().configure();
		//生成SessionFactory
		SessionFactory sf = conf.buildSessionFactory();
		//打开Session,执行CRUD操作
		Session session = sf.openSession();//一级缓存*/
		Session session = HibernateSessionFactory.getSession();
	    //创建事务对象
	    Transaction tran = session.beginTransaction();
	    //添加数据
	    Customer cus = new Customer();
	    cus.setAccount(555);
	    cus.setCname("关羽");
	    cus.setPassword("qwerdf");
	    cus.setCbalance(3000);
	    session.saveOrUpdate(cus);
	    //构造方法添加数据
	    //修改,get()、load()、查找id
	    /*cus = (Customer)session.get(Customer.class,222);
	    cus.setCbalance(cus.getCbalance()+1000);
	    session.update(cus);*/
	    //删除
	    /*cus = (Customer)session.get(Customer.class,222);
	    session.delete(cus);*/
	    //查询一条数据,get(),只能查where id = ***；
        /*cus = (Customer)session.get(Customer.class,111);
	    System.out.println(cus.getAccount());
	    System.out.println(cus.getCname());
	    System.out.println(cus.getPassword());
	    System.out.println(cus.getCbalance());*/
	    //提交事务
	    tran.commit();
		//关闭Seesion
		//session.close();
	    HibernateSessionFactory.closeSession();
	}

}
