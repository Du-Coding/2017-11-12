package action;

/**
 * @author 杜毅
 * @date 2017/11/3
 * @main 国际化，表单验证
 * 
 */

import com.opensymphony.xwork2.ActionSupport;

public class LoginI18nAction extends ActionSupport {
	private String uname;
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	private String pwd;
	
	public String execute() throws Exception {
		if(uname.equals("Tom") && pwd.equals("123")){
			return SUCCESS;
		}else{
			this.addFieldError(uname, this.getText("action.login.error"));
			return INPUT;
		}
	}
}
