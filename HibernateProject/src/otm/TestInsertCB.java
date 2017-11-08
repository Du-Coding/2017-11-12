package otm;


import org.hibernate.Session;
import org.hibernate.Transaction;

import pojo.Book;
import pojo.Category;
import util.HibernateSessionFactory;

/**
 * 
 * @author ����
 * @date 2017/10/31
 * @main һ�Զ� ���Ӳ���
 *
 */

public class TestInsertCB {

	public static void main(String[] args) {
		//һ��Ϊ�����������һ��category
		//�Ұ�������Book
		Session session = HibernateSessionFactory.getSession();
	    Transaction tran = session.beginTransaction();
	    System.out.println("--���Category--");
	    Category category = new Category();
	    category.setCname("����");
	    System.out.println("--���Book--");
	    Book book = new Book();
	    book.setBname("��֪��");
	    book.setPrice(48);
	    Book book2 = new Book();
	    book2.setBname("��֪��");
	    book2.setPrice(28);
	    //�໥����
	    book.setCategory(category);
	    book2.setCategory(category);
	    category.getBooks().add(book);
	    category.getBooks().add(book2);
	    //����һ��
	    //session.save(category);
	    //�෽Ϊ������
	    session.save(book);
	    session.save(book2);
	    
	    tran.commit();
	    HibernateSessionFactory.closeSession();

	}

}
