package com.magict.magic.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.magict.magic.entity.Message;
import com.magict.magic.entity.WxUser;
import com.magict.magic.mapper.MessageMapper;
import com.magict.magic.service.WxUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.weekend.WeekendSqls;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author ZP
 * @date 2018/4/1618:43
 * @description:
 */
@Controller
@RequestMapping("/pagetest")
public class DemoController {
	@Autowired
    WxUserService wxUserService;
    @Autowired
    MessageMapper messageMapper;


    @RequestMapping("/index")
    public String testPage(HttpServletRequest request , Model model){

        WxUser wxUser = wxUserService.findByOpenid("fwefwefwfe");
        System.out.println(wxUser.getNickname()+"=======");
        model.addAttribute("wxUser",wxUser);
        return "pagetest";
    }



}
