package interceptor;

import action.MessageAction;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class MessageInterceptor extends AbstractInterceptor {
	public String intercept(ActionInvocation ai) throws Exception {
		//过滤字符
		//获得action实例
		MessageAction obj = (MessageAction)ai.getAction();
		String content = obj.getContent();
		if(content.contains("淘")){
			String c = content.replaceAll("淘","*");
			obj.setContent(c);
		}
		return ai.invoke();
	}
}
