package pojo;

/**
 * 
 * @author duke
 * @date 2017/11/3
 *
 */
public class CategoryOne {
	private int cid;
	private String cname;
	private BookOne bookone;
	
	public BookOne getBookone() {
		return bookone;
	}
	public void setBookone(BookOne bookone) {
		this.bookone = bookone;
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
