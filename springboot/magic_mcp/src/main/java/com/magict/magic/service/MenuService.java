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
     * 获取admin有权访问的【所有】菜单
     * @param adminId
     * @return
     */
    List<Menu> findAdminMenu(Integer adminId);

    /**
     * 获取admin有权访问的【可用】菜单
     * @param adminId
     * @return
     */
    List<Menu> findAdminMenuActive(Integer adminId);


    /**
     * 获取admin无权访问的所有菜单
     * @param adminId
     * @return
     */
    List<Menu> findAdminNoMenu(Integer adminId);

}
