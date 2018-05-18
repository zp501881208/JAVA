package com.magict.magic;/**
 * @author ZP
 * @date 2018/5/1022:38
 * @description:
 */

import com.magict.magic.entity.Admin;
import com.magict.magic.entity.Menu;
import com.magict.magic.service.AdminService;
import com.magict.magic.service.MenuService;
import com.magict.magic.service.WxUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
    public transient final Logger logger = LoggerFactory.getLogger(getClass());

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

        Admin admin = adminService.selectByPrimaryKey(1);
        logger.info("admin:{}",admin.getAdminName());
        List<Menu> menuList = menuService.findAdminMenu(1);
        menuList.forEach(menu -> {
            logger.info("menuId:"+menu.getMenuId()+"menuName"+menu.getFunctionName()+"Thread:"+Thread.currentThread().getName());
        });
    }

}
