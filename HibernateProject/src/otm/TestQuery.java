package otm;

/**
 * 
 * @author 杜毅
 * @date 2017/10/31
 * @main 一对多 查询测试（多方为主动/一方为主动方） 
 */

import java.util.List;
import java.util.Set;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import pojo.Book;
import pojo.Category;
import util.HibernateSessionFactory;

public class TestQuery {

	public static void main(String[] args) {
		//多方为主动方
		//查询Category中cid=1的分类名
		Session session = HibernateSessionFactory.getSession();
	    Transaction tran = session.beginTransaction();
	    Query query = session.createQuery("From Book where cid=1"); 
	    List<Book> ls = query.list();
	    System.out.println("--多对一查询--");
	    for(Book book : ls){	
	    	System.out.println("类别编号为："+book.getCategory().getCid()
	    						+"  类别名称："+book.getCategory().getCname()
	    						+"  图书编号："+book.getBid()
	    						+"  图书名称："+book.getBname()
	    						+"  图书价格："+book.getPrice());
	    }
	    
	    //一方为主动方，查询cid=1，并查询出对应的Book信息
	    Category category = (Category)session.get(Category.class,1);
	    Set<Book> set = category.getBooks();
	    System.out.println("--一对多查询--");
	    for(Book book1 : set){
	    	System.out.println("类别编号为："+book1.getCategory().getCid()
	    						+"  类别名称："+book1.getCategory().getCname()
	    						+"  图书编号："+book1.getBid()
	    						+"  图书名称："+book1.getBname()
	    						+"  图书价格："+book1.getPrice());
	    }
	    tran.commit();
	    HibernateSessionFactory.closeSession();

	}

}
