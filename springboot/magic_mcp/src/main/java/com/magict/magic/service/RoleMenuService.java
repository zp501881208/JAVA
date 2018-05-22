package com.magict.magic.service;

import com.magict.magic.entity.RoleMenu;

import java.util.List;

/**
* 角色权限表接口
* @author zp
* @date 2018-05-17 16:35:19
*/
public interface RoleMenuService extends BaseService<RoleMenu> {

    /**
     * 查找该角色已分配的菜单
     * @param roleId
     * @return
     */
    List<RoleMenu> findByRoleId(Integer roleId);
}
