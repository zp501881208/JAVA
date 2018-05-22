package com.magict.magic.compoment;

import com.magict.magic.constants.Constants;
import com.magict.magic.entity.Admin;
import com.magict.magic.entity.Menu;
import com.magict.magic.enums.BaseEnum;
import com.magict.magic.enums.BooleanEnum;
import com.magict.magic.service.AdminService;
import com.magict.magic.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.*;


/**
 * @author ZP
 * @date 2018-5-10 21:06:52
 * @description: 登录成功后业务
 */
@Component
public class CustomAuthenticationSuccessHandler extends SimpleUrlAuthenticationSuccessHandler {
    @Autowired
    AdminService adminService;
    @Autowired
    MenuService menuService;
    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
        //获取认证用户信息
        User securityUser = (User) authentication.getPrincipal();
        //查询用户信息
        Admin admin = adminService.findByLoginName(securityUser.getUsername());
        //将用户信息存到session
        request.getSession().setAttribute(Constants.SESSION_ADMIN,admin);
        getMenu(request,admin);
        //重定向到首页
        String contextPath = request.getContextPath();
        response.sendRedirect(contextPath+"/home/index");
    }

    /**
     * 设置可访问的menuTree
     * @param request
     * @param admin
     */
    public void getMenu(HttpServletRequest request,Admin admin){
        List<Menu> menuList = menuService.findAdminMenuActive(admin.getAdminId());
        List<Menu> topMenu = new ArrayList<Menu>();
        TreeMap<String, List<Menu>> treeMap = new TreeMap<String, List<Menu>>();
        menuList.forEach(menu -> {
            //一级菜单
            if(1==menu.getMenuDeep() && BooleanEnum.YES.getKey().equals(menu.getIsEnable())){
                topMenu.add(menu);
                List<Menu> childrenMenu = new ArrayList<Menu>();
                menuList.forEach(menu1 -> {
                    //获取二级菜单
                    if (menu1.getMenuDeep()==2 && menu.getMenuId().equals(menu1.getParentId()) && BooleanEnum.YES.getKey().equals(menu1.getIsEnable())){
                        childrenMenu.add(menu1);
                    }
                });
                treeMap.put(menu.getOrderNum(),childrenMenu);

            }
        });
        request.getSession().setAttribute(Constants.SESSION_MENU_TOP,topMenu);
        request.getSession().setAttribute(Constants.SESSION_MENU_TREE,treeMap);

    }

}
