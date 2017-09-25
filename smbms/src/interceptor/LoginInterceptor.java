package interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class LoginInterceptor implements HandlerInterceptor {

	@Override
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1,
			Object arg2, ModelAndView arg3) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
			Object object) throws Exception {
		// TODO Auto-generated method stub
		//请求路径
		String url = request.getRequestURL().toString();
		
		int index = url.lastIndexOf("/");
		//现请求名
		String action = url.substring(index+1, url.length());
		
		String name = (String)request.getSession().getAttribute("isLogin");
		
		if(action.equals("loadLogin") || name != null){
			return true;
		}
		response.sendRedirect("../loadLogin");
		return false;
	}
	
}
