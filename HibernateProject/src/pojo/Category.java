package pojo;

/**
 * 
 * @author ����
 * @date 2017/10/27
 * @main һ��n����
 * 
 */

import java.util.HashSet;
import java.util.Set;

public class Category {
	private int cid;
	private String cname;
	//һ������Set���󣬴�Ŷ෽��Ϣ
	private Set<Book> books = new HashSet<Book>();
	public Set<Book> getBooks() {
		return books;
	}
	public void setBooks(Set<Book> books) {
		this.books = books;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}

}
