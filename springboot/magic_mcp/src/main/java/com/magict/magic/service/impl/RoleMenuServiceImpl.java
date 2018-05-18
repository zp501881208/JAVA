package com.magict.magic.service.impl;

import com.magict.magic.entity.RoleMenu;
import com.magict.magic.mapper.RoleMenuMapper;
import com.magict.magic.service.RoleMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
* 角色权限表实现
* @author zp
* @date 2018-05-17 16:35:19
*/
@Service("roleMenuService")
public class RoleMenuServiceImpl extends BaseServiceImpl<RoleMenu> implements RoleMenuService {
    @Autowired
    private RoleMenuMapper roleMenuMapper;


}