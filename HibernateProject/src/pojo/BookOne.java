package pojo;


/**
 * 
 * @author duke
 * @date 2017/11/3
 *
 */

public class BookOne {
	private int bid;
	private String bname;
	private double price;
	private int cid;
	private CategoryOne categoryone;
	
	public CategoryOne getCategoryone() {
		return categoryone;
	}
	public void setCategoryone(CategoryOne categoryone) {
		this.categoryone = categoryone;
	}
	
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
}
