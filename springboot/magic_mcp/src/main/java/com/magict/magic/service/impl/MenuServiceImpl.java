package com.magict.magic.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.magict.magic.entity.Menu;
import com.magict.magic.entity.dto.Page;
import com.magict.magic.entity.dto.MenuDto;
import com.magict.magic.enums.BooleanEnum;
import com.magict.magic.mapper.MenuMapper;
import com.magict.magic.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* 菜单表实现
* @author zp
* @date 2018-05-17 10:05:46
*/
@Service("menuService")
public class MenuServiceImpl extends BaseServiceImpl<Menu> implements MenuService {
    @Autowired
    private MenuMapper menuMapper;

    @Override
    public List<Menu> findAdminMenu(Integer adminId) {
        return menuMapper.selectAdminMenu(adminId,null);
    }

    @Override
    public List<Menu> findAdminMenuActive(Integer adminId) {
        return menuMapper.selectAdminMenu(adminId,BooleanEnum.YES.getKey());
    }

    @Override
    public List<Menu> findAdminNoMenu(Integer adminId) {
        return menuMapper.selectAdminNoMenu(adminId,null);
    }

    @Override
    public PageInfo<Menu> findList(MenuDto condition, Page page) {
        if(page==null){
            page = new Page();
        }
        PageHelper.startPage(page.getCurrentPage(),page.getPageSize());
        List<Menu> menuList = menuMapper.selectAll();
        return new PageInfo<Menu>(menuList);
    }
}
