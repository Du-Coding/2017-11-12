package interceptor;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import action.LoginAction;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class LoginInterceptor extends AbstractInterceptor {

	
	public String intercept(ActionInvocation ai) throws Exception {
		
		LoginAction login = (LoginAction)ai.getAction();
	    if(!login.getUname().equals("qq") && !login.getUpwd().equals("123")){
	    	HttpServletRequest request = ServletActionContext.getRequest();
        	request.setAttribute("error","´íÎóµÄÐÕÃûºÍÃÜÂë£¡");
        	return Action.INPUT;
	    }
		return ai.invoke();
		
	}
	

}
