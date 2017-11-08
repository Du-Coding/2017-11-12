package pojo;

/**
 * 
 * @author 杜毅
 * @date 2017/10/27
 * @main 一对n关联
 * 
 */

import java.util.HashSet;
import java.util.Set;

public class Category {
	private int cid;
	private String cname;
	//一方创建Set对象，存放多方信息
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
