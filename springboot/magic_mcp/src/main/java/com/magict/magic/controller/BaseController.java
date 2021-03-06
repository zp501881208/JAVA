package com.magict.magic.controller;

import com.magict.magic.constants.Constants;
import com.magict.magic.entity.Admin;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;

/**
 * 基础控制层
 * @author ZP
 * @// TODO: 2018/4/13  
 */
public class BaseController {
	protected transient final Logger logger = LoggerFactory.getLogger(getClass());

	/**
	 * 获取跟路径
	 * @param request
	 * @return
	 */
	public String getRootPath(HttpServletRequest request){
		return String.format("http://%s%s",request.getServerName(),request.getContextPath());
	}

	/**
	 * 获取session中admin用户
	 * @param request
	 * @return
	 */
	public Admin getAdminSession(HttpServletRequest request){
		return (Admin) request.getSession().getAttribute(Constants.SESSION_ADMIN);
	}

}
