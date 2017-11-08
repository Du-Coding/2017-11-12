package pojo;

/**
 * 
 * @author ¶ÅÒã
 * @date 2017/10/24
 */

public class Header {
    private int id;
    private String hname;
    private School school;
    
    
    public School getSchool() {
		return school;
	}
	public void setSchool(School school) {
		this.school = school;
	}
	
    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getHname() {
		return hname;
	}
	public void setHname(String hname) {
		this.hname = hname;
	}
	
}
