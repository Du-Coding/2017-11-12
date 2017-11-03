package interceptor;

import action.MessageAction;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class MessageInterceptor extends AbstractInterceptor {
	public String intercept(ActionInvocation ai) throws Exception {
		//�����ַ�
		//���actionʵ��
		MessageAction obj = (MessageAction)ai.getAction();
		String content = obj.getContent();
		if(content.contains("��")){
			String c = content.replaceAll("��","*");
			obj.setContent(c);
		}
		return ai.invoke();
	}
}
