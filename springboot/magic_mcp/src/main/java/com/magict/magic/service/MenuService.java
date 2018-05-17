package com.magict.magic.service;

import com.magict.magic.entity.Menu;

import java.util.List;

/**
* 菜单表接口
* @author zp
* @date 2018-05-17 10:05:46
*/
public interface MenuService extends BaseService<Menu> {
    /**
     * 管理员登录获取有权访问的菜单
     * @param adminId
     * @return
     */
    List<Menu> findAdminMenu(Integer adminId);
}
