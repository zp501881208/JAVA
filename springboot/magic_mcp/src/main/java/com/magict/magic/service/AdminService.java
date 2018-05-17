package com.magict.magic.service;

import com.magict.magic.entity.Admin;

/**
* 接口
* @author zp
* @date 2018-05-10 20:53:24
*/
public interface AdminService extends BaseService<Admin> {
    /**
     * 登录
     * @param loginName
     * @return
     */
    Admin findByLoginName(String loginName);
}
