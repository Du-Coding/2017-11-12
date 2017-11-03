package action;

/**
 * @author 杜毅
 * @date 2017/10/..
 * @date 2017/10/27
 */

import com.opensymphony.xwork2.ActionSupport;

public class TagFormAction extends ActionSupport {

	//封装数据
	private String uname;
	private String upwd;
	private String content;
	private String gender1;
	private String gender2;
	private String star1;
	private String star2;
	private String star3;
	private String NB;
	private String city1;
	private String city2;
	
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUpwd() {
		return upwd;
	}
	public void setUpwd(String upwd) {
		this.upwd = upwd;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getGender1() {
		return gender1;
	}
	public void setGender1(String gender1) {
		this.gender1 = gender1;
	}
	public String getGender2() {
		return gender2;
	}
	public void setGender2(String gender2) {
		this.gender2 = gender2;
	}
	public String getStar1() {
		return star1;
	}
	public void setStar1(String star1) {
		this.star1 = star1;
	}
	public String getStar2() {
		return star2;
	}
	public void setStar2(String star2) {
		this.star2 = star2;
	}
	public String getStar3() {
		return star3;
	}
	public void setStar3(String star3) {
		this.star3 = star3;
	}
	public String getNB() {
		return NB;
	}
	public void setNB(String nB) {
		NB = nB;
	}
	public String getCity1() {
		return city1;
	}
	public void setCity1(String city1) {
		this.city1 = city1;
	}
	public String getCity2() {
		return city2;
	}
	public void setCity2(String city2) {
		this.city2 = city2;
	}
	
	//执行execute()方法
	public String execute() throws Exception {
		
		return SUCCESS;
	}
	@Override
	public void validate() {
		if(!(uname.equals("QQ123") && upwd.equals("123456"))){
			this.addFieldError("uname", "用户名错误");
			this.addFieldError("upwd", "密码错误");
		}
	}
	
	

}
