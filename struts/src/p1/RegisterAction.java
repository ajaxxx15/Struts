package p1;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Struts with Single Action Class
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

	public void validate() {
		if (un.length() == 0) {
			addFieldError("un", "username cannot be empty");
		}
		if (pwd.length() == 0) {
			addFieldError("pwd", "password cannot be empty");

		}
	}

	public String execute() {
		System.out.println(un + " " + pwd);
		return "s";
	}
}
