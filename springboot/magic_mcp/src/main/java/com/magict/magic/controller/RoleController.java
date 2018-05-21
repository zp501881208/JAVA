package com.magict.magic.controller;

import com.magict.magic.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * 
 * @author ZP
 * @date 2018/5/21 10:24
 * @description:
 */
@Controller
@RequestMapping("/role")
public class RoleController extends BaseController{
    @Autowired
    RoleService roleService;

    /**
     * 角色列表
     * @param request
     * @param model
     * @return
     */
    @RequestMapping("/list")
    public String list(HttpServletRequest request, Model model){

        return "role_list";
    }

    /**
     * 分配权限页面
     * @param request
     * @param model
     * @param roleId 角色ID
     * @return
     */
    @RequestMapping("/assignpage")
    public String assignPage(HttpServletRequest request, Model model,Integer roleId){

        return "role_assign";
    }

    /**
     * 分配权限
     * @param request
     * @param model
     * @param roleId 角色ID
     * @param menuIds 菜单ID数组
     * @return
     */
    @RequestMapping("/assign")
    public String assign(HttpServletRequest request, Model model,Integer roleId,String[] menuIds){

        return "role_assign";
    }

}
