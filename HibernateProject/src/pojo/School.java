package pojo;

/**
 * 
 * @author ¶ÅÒã
 * @date 2017/10/24
 */

public class School {
    private int id;
    private String sname;
    private Header header;
    
    public Header getHeader() {
		return header;
	}
	public void setHeader(Header header) {
		this.header = header;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	
}
