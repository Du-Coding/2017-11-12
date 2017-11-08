package otm;

/**
 * 
 * @author ����
 * @date 2017/10/31
 * @main һ�Զ� ��ѯ���ԣ��෽Ϊ����/һ��Ϊ�������� 
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
		//�෽Ϊ������
		//��ѯCategory��cid=1�ķ�����
		Session session = HibernateSessionFactory.getSession();
	    Transaction tran = session.beginTransaction();
	    Query query = session.createQuery("From Book where cid=1"); 
	    List<Book> ls = query.list();
	    System.out.println("--���һ��ѯ--");
	    for(Book book : ls){	
	    	System.out.println("�����Ϊ��"+book.getCategory().getCid()
	    						+"  ������ƣ�"+book.getCategory().getCname()
	    						+"  ͼ���ţ�"+book.getBid()
	    						+"  ͼ�����ƣ�"+book.getBname()
	    						+"  ͼ��۸�"+book.getPrice());
	    }
	    
	    //һ��Ϊ����������ѯcid=1������ѯ����Ӧ��Book��Ϣ
	    Category category = (Category)session.get(Category.class,1);
	    Set<Book> set = category.getBooks();
	    System.out.println("--һ�Զ��ѯ--");
	    for(Book book1 : set){
	    	System.out.println("�����Ϊ��"+book1.getCategory().getCid()
	    						+"  ������ƣ�"+book1.getCategory().getCname()
	    						+"  ͼ���ţ�"+book1.getBid()
	    						+"  ͼ�����ƣ�"+book1.getBname()
	    						+"  ͼ��۸�"+book1.getPrice());
	    }
	    tran.commit();
	    HibernateSessionFactory.closeSession();

	}

}
