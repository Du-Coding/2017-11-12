package action;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import pojo.Register0313;

/**
 * 
 * @author ¶ÅÒã
 * @date 2017/10/24
 */
public class RegisterAction0313 extends ActionSupport{

	private Register0313 reg;

	public Register0313 getReg() {
		return reg;
	}

	public void setReg(Register0313 reg) {
		this.reg = reg;
	}
	@Override
	public String execute() throws Exception {
		
		return SUCCESS;
	}
	
}
