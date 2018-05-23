package com.magict.magic.controller;
import com.github.pagehelper.PageInfo;
import com.magict.magic.entity.Menu;
import com.magict.magic.entity.dto.Page;
import com.magict.magic.entity.dto.MenuDto;
import com.magict.magic.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.mvc.method.RequestMappingInfo;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 *
 * @author ZP
 * @date 2018/5/21 10:11
 * @description: 菜单管理
 */

@Controller
@RequestMapping("/menu")
public class MenuController extends BaseController{
    @Autowired
    MenuService menuService;

    /**
     * 已录入的菜单
     * @param request
     * @param model
     * @return
     */
    @RequestMapping("/list")
    public String list(HttpServletRequest request, Model model, MenuDto condition, Page page){
        PageInfo<Menu> menuList = menuService.findList(condition,page);
        model.addAttribute("menuList",menuList);
        return "menu_list";
    }

    /**
     * spring读取项目所有访问路径排除掉已设置的菜单，剩余未配置的在这里操作
     * @param request
     * @param model
     * @return
     */
    @RequestMapping("/unlist")
    public String unlist(HttpServletRequest request, Model model){
        WebApplicationContext wc = WebApplicationContextUtils.getRequiredWebApplicationContext(request.getSession().getServletContext());
        RequestMappingHandlerMapping rmhp = wc.getBean(RequestMappingHandlerMapping.class);
        Map<RequestMappingInfo, HandlerMethod> map = rmhp.getHandlerMethods();
        for(RequestMappingInfo info : map.keySet()){
            logger.info("============="+info.getPatternsCondition().toString()
                    + ","
                    +map.get(info).getBean().toString());
        }

        return "menu_unlist";
    }




}
