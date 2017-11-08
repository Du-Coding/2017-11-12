package otm;

import org.hibernate.Session;
import org.hibernate.Transaction;

import pojo.Category;
import util.HibernateSessionFactory;

/**
 * 
 * @author ∂≈“„
 * @date 2017/11/3
 * @main “ª∂‘∂‡ …æ≥˝≤‚ ‘
 *
 */
public class TestDelete {

	public static void main(String[] args) {
		Session session = HibernateSessionFactory.getSession();
	    Transaction tran = session.beginTransaction();
	    Category category = (Category)session.get(Category.class, 3);
	    session.delete(category);
	    tran.commit();
	    HibernateSessionFactory.closeSession(); 
		

	}

}
