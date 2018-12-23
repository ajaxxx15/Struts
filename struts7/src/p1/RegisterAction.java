package p1;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Struts with Resource Bundle
 *
 */
public class RegisterAction extends ActionSupport {
	private String un;
	private String pwd;

	public String getUn() {
		return un;
	}

	public void setUn(String un) {
		this.un = un;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String execute() {
		System.out.println(getText("abc"));
		System.out.println(getText("abc"));
		System.out.println(getText("abc"));
		System.out.println(getText("abc"));
		System.out.println(getText("abc"));
		System.out.println(getText("abc"));
		System.out.println(getText("abc"));
		return "s";

	}

}
