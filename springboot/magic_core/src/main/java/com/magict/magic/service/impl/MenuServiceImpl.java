package com.magict.magic.service.impl;

import com.magict.magic.entity.Menu;
import com.magict.magic.mapper.MenuMapper;
import com.magict.magic.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
* 菜单表实现
* @author zp
* @date 2018-05-17 10:05:46
*/
@Service("menuService")
public class MenuServiceImpl extends BaseServiceImpl<Menu> implements MenuService {
    @Autowired
    private MenuMapper menuMapper;


}
