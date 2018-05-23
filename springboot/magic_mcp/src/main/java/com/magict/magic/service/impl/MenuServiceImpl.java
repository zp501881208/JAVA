package com.magict.magic.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.magict.magic.entity.Menu;
import com.magict.magic.entity.dto.MenuDto;
import com.magict.magic.entity.dto.Page;
import com.magict.magic.enums.BooleanEnum;
import com.magict.magic.mapper.MenuMapper;
import com.magict.magic.service.MenuService;
import com.magict.magic.util.SqlUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.weekend.WeekendSqls;

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
        PageHelper.startPage(page.getpageNum(),page.getPageSize());
        WeekendSqls<Menu> menuWeekendSqls = WeekendSqls.<Menu>custom();
        if(null!=condition){
            if (!StringUtils.isEmpty(condition.getMenuId())){
                menuWeekendSqls.andLike(Menu::getMenuId, SqlUtil.getLikeColumn(condition.getMenuId()));
            }
            if (!StringUtils.isEmpty(condition.getFunctionName())){
                menuWeekendSqls.andLike(Menu::getFunctionName, SqlUtil.getLikeColumn(condition.getFunctionName()));
            }
        }
        Example example = Example.builder(Menu.class).andWhere(menuWeekendSqls).orderByAsc("orderNum").build();
        List<Menu> menuList = menuMapper.selectByExample(example);
        return new PageInfo<Menu>(menuList);
    }
}
