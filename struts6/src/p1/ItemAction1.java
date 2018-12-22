package p1;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

public class ItemAction1 implements SessionAware {
	private String choc;
	Map m;

	public String getChoc() {
		return choc;
	}

	public void setChoc(String choc) {
		this.choc = choc;
	}

	@Override
	public void setSession(Map m) {

		this.m = m;
	}

	public String execute() {
		m.put("choc", choc);
		return "item";
	}

}
