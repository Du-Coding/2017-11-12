package pojo;

/**
 * 
 * @author 杜毅
 * @date 2017/10/27
 * @main 一对多
 *
 */

public class Book {
	private int bid;
	private String bname;
	private double price;
	private int cid;
	
	//创建一个一方对象
	private Category category;
	
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
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
