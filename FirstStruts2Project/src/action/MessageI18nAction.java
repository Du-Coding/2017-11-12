package action;

/**
 * @author 杜毅
 * 
 * @date 2017/10/31
 * @main 语言资源设置
 * 
 * @date 2017/11/03
 * @main Action获取资源文件
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
		//Action获取资源文件
		System.out.println(this.getText("hello"));
		System.out.println(this.getText("page.welcome"));
		//含参数获取资源文件
		String s[] = {"2","Tom"};
		System.out.println(this.getText("info.input",s));
		List ls = new ArrayList();
		ls.add(6654);
		ls.add("Tom");
		System.out.println(this.getText("info.input",ls));
		return SUCCESS;
	}

}
