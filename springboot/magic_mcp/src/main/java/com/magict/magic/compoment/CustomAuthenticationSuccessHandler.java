package com.magict.magic.compoment;

import com.magict.magic.constants.Constants;
import com.magict.magic.entity.Admin;
import com.magict.magic.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


/**
 * @author ZP
 * @date 2018-5-10 21:06:52
 * @description: 登录成功后业务
 */
@Component
public class CustomAuthenticationSuccessHandler extends SimpleUrlAuthenticationSuccessHandler {
    @Autowired
    AdminService adminService;

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
        //获取认证用户信息
        User securityUser = (User) authentication.getPrincipal();
        //查询用户信息
        Admin admin = adminService.findByLoginName(securityUser.getUsername());
        //将用户信息存到session
        request.getSession().setAttribute(Constants.SESSION_ADMIN,admin);
        //重定向到首页
        response.sendRedirect("/index");
    }
}
