package action;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import pojo.LoginBeen;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginPojoAction extends ActionSupport {
    //��װLoginBeen,�ٴη�װ������get��set����
	private LoginBeen lg;
	public LoginBeen getLg() {
		return lg;
	}

	public void setLg(LoginBeen lg) {
		this.lg = lg;
	}
	public String execute() throws Exception {
		//��ȡMap���͵�session����
		ActionContext ac = ActionContext.getContext();
		Map<String,Object> session = ac.getSession();
		Map<String,Object> application = ac.getApplication();
		if(lg.getUname().equals("QQ")&&lg.getUpwd().equals("123")){
			session.put("uname",lg.getUname());
			session.put("upwd",lg.getUpwd());
			application.put("color", "red");
        	return SUCCESS;
        }else{
        	//��̬���� �ض��򣨲����ã� ����ת��
        	HttpServletRequest request = ServletActionContext.getRequest();
        	request.setAttribute("error","��������������룡");
        	return INPUT;
        }
	}
}
