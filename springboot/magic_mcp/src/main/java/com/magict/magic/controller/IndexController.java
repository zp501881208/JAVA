package com.magict.magic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @author ZP
 * @date 2018/5/213:53
 * @description:
 */
@Controller
@RequestMapping("/home")
public class IndexController extends BaseController {

    @RequestMapping("/index")
    public String index(HttpServletRequest request, Model model){
        return "index";
    }

    @RequestMapping("/homepage")
    public String pub(HttpServletRequest request, Model model){
        return "homepage";
    }


}
