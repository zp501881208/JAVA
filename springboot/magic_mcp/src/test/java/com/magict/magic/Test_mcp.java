package com.magict.magic;/**
 * @author ZP
 * @date 2018/5/1022:38
 * @description:
 */

import com.magict.magic.entity.Admin;
import com.magict.magic.entity.Menu;
import com.magict.magic.entity.WxUser;
import com.magict.magic.service.AdminService;
import com.magict.magic.service.MenuService;
import com.magict.magic.service.WxUserService;
import com.magict.magic.util.DateUtil;
import org.apache.commons.lang3.time.DateUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 *
 * @author ZP
 * @date 2018/5/1022:38
 * @description:
 */
@SpringBootTest(classes = MagicMcpApplication.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class Test_mcp {
    @Autowired
    WxUserService wxUserService;
    @Autowired
    AdminService adminService;
    @Autowired
    MenuService menuService;

    @Test
    public void testA(){
//        WxUser wxUser = wxUserService.selectByPrimaryKey(1);
//        System.out.println(wxUser.getNickname()+","+wxUser.getRealName());
//
//        Admin admin = adminService.selectByPrimaryKey(1);
//        System.out.println("LoginNAme:"+admin.getLoginName());

        List<Menu> menuList = menuService.findAdminMenu(1);
        menuList.forEach(menu -> {
            System.out.println("menuId:"+menu.getMenuId()+"menuName"+menu.getFunctionName());
        });
    }




}
