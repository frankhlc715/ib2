package com.ib2.afs.common.web.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.ib2.afs.common.util.ThreadContextUtil;

public class SecurityInterceptor implements HandlerInterceptor {
	private static final Logger LOG = LogManager.getLogger(SecurityInterceptor.class);

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object arg2, ModelAndView arg3)
			throws Exception {
		// TODO Auto-generated method stub
		LOG.debug("/*********************************SecurityInterceptor.postHandle start*******************************/");
		LOG.debug("/*********************************SecurityInterceptor.postHandle doing*******************************/");
		LOG.debug("/*********************************SecurityInterceptor.postHandle end*********************************/");
	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object arg2) throws Exception {
		// TODO Auto-generated method stub
		String userName = request.getHeader("userName");
		ThreadContextUtil.set("userName",StringUtils.isEmpty(userName)?"SYSTEM":userName);
		LOG.debug("/*********************************SecurityInterceptor.preHandle start*******************************/");
		LOG.debug("/*********************************SecurityInterceptor.preHandle doing*******************************/");
		LOG.debug("/*********************************SecurityInterceptor.preHandle end*********************************/");
		return true;
	}

}
