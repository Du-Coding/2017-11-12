package action;

/**
 * @author ����
 * 
 * @date 2017/10/31
 * @main ������Դ����
 * 
 * @date 2017/11/03
 * @main Action��ȡ��Դ�ļ�
 */

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

public class MessageI18nAction extends ActionSupport {
	private String sname;
	public String getSname() {
		return "Tiger";
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	@Override
	public String execute() throws Exception {
		//Action��ȡ��Դ�ļ�
		System.out.println(this.getText("hello"));
		System.out.println(this.getText("page.welcome"));
		//��������ȡ��Դ�ļ�
		String s[] = {"2","Tom"};
		System.out.println(this.getText("info.input",s));
		List ls = new ArrayList();
		ls.add(6654);
		ls.add("Tom");
		System.out.println(this.getText("info.input",ls));
		return SUCCESS;
	}

}
