package com.magict.magic.service.impl;

import com.magict.magic.entity.Role;
import com.magict.magic.mapper.RoleMapper;
import com.magict.magic.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
* 角色表实现
* @author zp
* @date 2018-05-17 17:01:16
*/
@Service("roleService")
public class RoleServiceImpl extends BaseServiceImpl<Role> implements RoleService {
    @Autowired
    private RoleMapper roleMapper;


}
