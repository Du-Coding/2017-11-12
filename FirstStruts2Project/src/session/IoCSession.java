package session;

import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class IoCSession extends ActionSupport implements ServletRequestAware,SessionAware{

    private HttpServletRequest request;
    private HttpSession session;
    private Map<String,Object> sesmap;
    private ServletContext context;
    
	public void setServletRequest(HttpServletRequest request) {
        this.request = request;
        session = request.getSession();
        
	    context = ServletActionContext.getServletContext();
	}

	public void setSession(Map<String, Object> sesmap) {
        this.sesmap = sesmap;
	}

	@Override
	public String execute() throws Exception {
		session.setAttribute("uname","张三");
		sesmap.put("sname","张三");
		return SUCCESS;
	}
     
	
}
