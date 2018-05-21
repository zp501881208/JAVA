package com.magict.magic.controller;

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
 * @author ZP
 * @date 2018/5/213:53
 * @description:
 */
@Controller
@RequestMapping("/home")
public class IndexController extends BaseController {
    @Autowired
    MenuService menuService;

    @RequestMapping("/index")
    public String index(HttpServletRequest request, Model model){
        return "index";
    }

    @RequestMapping("/homepage")
    public String pub(HttpServletRequest request, Model model){
        WebApplicationContext wc = WebApplicationContextUtils.getRequiredWebApplicationContext(request.getSession().getServletContext());
        RequestMappingHandlerMapping rmhp = wc.getBean(RequestMappingHandlerMapping.class);
        Map<RequestMappingInfo, HandlerMethod> map = rmhp.getHandlerMethods();
        for(RequestMappingInfo info : map.keySet()){
          logger.info("============="+info.getPatternsCondition().toString()
                    + ","
                    +map.get(info).getBean().toString());
        }

        return "homepage";
    }


}
