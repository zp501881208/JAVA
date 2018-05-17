package com.magict.magic.service.impl;

import com.magict.magic.entity.AdminRole;
import com.magict.magic.mapper.AdminRoleMapper;
import com.magict.magic.service.AdminRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* 管理员角色表实现
* @author zp
* @date 2018-05-17 16:23:18
*/
@Service("adminRoleService")
public class AdminRoleServiceImpl extends BaseServiceImpl<AdminRole> implements AdminRoleService {
    @Autowired
    private AdminRoleMapper adminRoleMapper;


    @Override
    public List<AdminRole> findByAdminId(Integer adminId) {
        AdminRole adminRole = new AdminRole();
        adminRole.setAdminId(adminId);
        return adminRoleMapper.select(adminRole);
    }
}
