package p1;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.interceptor.ServletRequestAware;

/**
 * Struts with Session
 *
 */
public class RegisterAction implements ServletRequestAware {
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

	@Override
	public void setServletRequest(HttpServletRequest x) {
		HttpSession session = x.getSession();
		int val1 = (int) session.getAttribute("value1");
		int val2 = (int) session.getAttribute("value2");
		System.out.println(val1 + " " + val2);

	}

	public String execute() {
		System.out.println(un + " " + pwd);
		return "s";
	}

}
