package action;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import pojo.LoginBeen;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginPojoAction extends ActionSupport {
    //封装LoginBeen,再次封装，设置get，set方法
	private LoginBeen lg;
	public LoginBeen getLg() {
		return lg;
	}

	public void setLg(LoginBeen lg) {
		this.lg = lg;
	}
	public String execute() throws Exception {
		//获取Map类型的session对象
		ActionContext ac = ActionContext.getContext();
		Map<String,Object> session = ac.getSession();
		Map<String,Object> application = ac.getApplication();
		if(lg.getUname().equals("QQ")&&lg.getUpwd().equals("123")){
			session.put("uname",lg.getUname());
			session.put("upwd",lg.getUpwd());
			application.put("color", "red");
        	return SUCCESS;
        }else{
        	//暂态数据 重定向（不能用） 请求转发
        	HttpServletRequest request = ServletActionContext.getRequest();
        	request.setAttribute("error","错误的姓名和密码！");
        	return INPUT;
        }
	}
}
