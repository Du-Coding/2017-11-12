package action;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport{

	//��װ����Ӧ��Ϣ������ͬ���е�name��ͬ��
	private String uname;
	private String upwd;
	
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

	
	
	public String execute() throws Exception {
		if(uname.equals("qq") && upwd.equals("123")){
            return SUCCESS;
		}
		else{
			return INPUT;
		}
	}
	
	public String Hello(){
		return "����";
	}
    
}
