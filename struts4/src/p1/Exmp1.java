package p1;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.StrutsStatics;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class Exmp1 implements Interceptor,StrutsStatics {

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
		HttpServletResponse y = (HttpServletResponse)ac.get(HTTP_RESPONSE);
		Object o = ai.getAction();
		String un=((RegisterAction)(o)).getUn();
		String pwd=((RegisterAction)(o)).getPwd();
		
		String temp=null;
		if(un.length()==0 || pwd.length()==0) {
			y.sendRedirect("/struts4/error.jsp");
		}
		else {
			temp=ai.invoke();
		}
		return temp;
	}

}
