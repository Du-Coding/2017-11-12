package otm;


import org.hibernate.Session;
import org.hibernate.Transaction;

import pojo.Book;
import pojo.Category;
import util.HibernateSessionFactory;

/**
 * 
 * @author 杜毅
 * @date 2017/10/31
 * @main 一对多 增加测试
 *
 */

public class TestInsertCB {

	public static void main(String[] args) {
		//一方为主动方，添加一个category
		//且包含两种Book
		Session session = HibernateSessionFactory.getSession();
	    Transaction tran = session.beginTransaction();
	    System.out.println("--添加Category--");
	    Category category = new Category();
	    category.setCname("都市");
	    System.out.println("--添加Book--");
	    Book book = new Book();
	    book.setBname("不知道");
	    book.setPrice(48);
	    Book book2 = new Book();
	    book2.setBname("不知道");
	    book2.setPrice(28);
	    //相互设置
	    book.setCategory(category);
	    book2.setCategory(category);
	    category.getBooks().add(book);
	    category.getBooks().add(book2);
	    //保存一方
	    //session.save(category);
	    //多方为主动方
	    session.save(book);
	    session.save(book2);
	    
	    tran.commit();
	    HibernateSessionFactory.closeSession();

	}

}
