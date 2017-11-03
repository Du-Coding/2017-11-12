package session;

import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class SessionCount extends ActionSupport {

	@Override
	public String execute() throws Exception {
		//Struts2·ÃÎÊServletAPI _ServletActionContext
		HttpServletRequest request = ServletActionContext.getRequest();
		HttpServletResponse response = ServletActionContext.getResponse();
		HttpSession session = request.getSession();//ä¯ÀÀÆ÷¶Ë
		ServletContext application = ServletActionContext.getServletContext();//·þÎñÆ÷¶Ë
		Integer c = (Integer) session.getAttribute("c");//¸³Öµ
		if(c == null){
			c = 1;
		}else{
			c = c+1;
		}
		session.setAttribute("c",c);
		
		//ActionContext·ÃÎÊServletAPI
		ActionContext ac = ActionContext.getContext();
		Map<String,Object>session1=ac.getSession();
		Integer cc = (Integer)session1.get("cc");
		if(cc == null){
			cc = 1;
		}else{
			cc = cc+1;
		}
		
		session1.put("cc", cc);
		
		return SUCCESS;
	}
}