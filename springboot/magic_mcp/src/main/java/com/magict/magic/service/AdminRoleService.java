package com.magict.magic.service;

import com.magict.magic.entity.AdminRole;

import java.util.List;

/**
* 管理员角色表接口
* @author zp
* @date 2018-05-17 16:23:18
*/
public interface AdminRoleService extends BaseService<AdminRole> {
    /**
     * 查询管理员角色
     * @param adminId
     * @return
     */
    List<AdminRole> findByAdminId(Integer adminId);
}
