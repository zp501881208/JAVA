package com.magict.magic.controller;
import com.magict.magic.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

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
    public String list(HttpServletRequest request, Model model){

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

        return "menu_unlist";
    }




}
