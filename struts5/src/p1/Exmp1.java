package p1;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.StrutsStatics;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class Exmp1 implements Interceptor, StrutsStatics {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public void init() {
		// TODO Auto-generated method stub

	}

	@Override
	public String intercept(ActionInvocation ai) throws Exception {
		ActionContext ac = ai.getInvocationContext();
		HttpServletRequest x = (HttpServletRequest) ac.get(HTTP_REQUEST);
		HttpSession session = x.getSession();
		int a = 100;
		session.setAttribute("value1", a);
		String temp = ai.invoke();
		return temp;

	}

}
