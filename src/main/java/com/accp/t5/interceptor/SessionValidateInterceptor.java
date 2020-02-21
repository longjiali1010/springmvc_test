package com.accp.t5.interceptor;

import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.accp.t5.vo.Users;
import com.alibaba.fastjson.JSON;

public class SessionValidateInterceptor implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		Users temp=(Users)request.getSession().getAttribute("USERS");
		if(temp==null) {
			if(request.getRequestURI().indexOf("/api")!=-1) {
				Map<String, Object> message=new HashMap<String, Object>();
				message.put("code", "500");
				message.put("msg", "login_error");
				response.setContentType("text/html;charset=UTF-8");
				PrintWriter out=response.getWriter();
				out.write(JSON.toJSONString(message));
				out.flush();
			}else {
				response.sendRedirect(request.getContextPath()+"/sessionerror.jsp");
			}
			return false;
		}
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub

	}

}
