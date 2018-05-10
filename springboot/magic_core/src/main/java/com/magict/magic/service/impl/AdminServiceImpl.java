package com.magict.magic.service.impl;

import com.magict.magic.entity.Admin;
import com.magict.magic.mapper.AdminMapper;
import com.magict.magic.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
* 实现
* @author zp
* @date 2018-05-10 20:53:24
*/
@Service("adminService")
public class AdminServiceImpl extends BaseServiceImpl<Admin> implements AdminService {
    @Autowired
    private AdminMapper adminMapper;

    @Override
    public Admin findByLoginName(String loginName) {
        Admin admin = new Admin();
        admin.setLoginName(loginName);
        return adminMapper.selectOne(admin);
    }
}
