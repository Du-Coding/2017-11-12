package otm;



import org.hibernate.Session;
import org.hibernate.Transaction;

import pojo.Book;
import pojo.Category;
import util.HibernateSessionFactory;

/**
 * 
 * @author duke
 * @date 2017/11/3
 * @main һ�Զ� �޸Ĳ���
 *
 */
public class TestUpdate {
	//bidΪ3
	//Category cid 2 �ĵ� cid 1
	public static void main(String[] args) {
		
		Session session = HibernateSessionFactory.getSession();
	    Transaction tran = session.beginTransaction();
	    Book book=(Book)session.get(Book.class, 3);
	    Category category = (Category)session.get(Category.class, 1);
	    Category category2 = (Category)session.get(Category.class, 2);
	    //�Ƴ�2
	    category2.getBooks().remove(book);
	    //category.getBooks().add(b);
	    book.setCategory(category);
	    session.update(book);
	    tran.commit();
	    HibernateSessionFactory.closeSession();
		
	}

}
