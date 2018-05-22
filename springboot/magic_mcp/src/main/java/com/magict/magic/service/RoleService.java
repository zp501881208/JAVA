package com.magict.magic.service;

import com.magict.magic.entity.Role;
import com.magict.magic.entity.vo.ResultCode;

/**
* 角色表接口
* @author zp
* @date 2018-05-17 17:01:16
*/
public interface RoleService extends BaseService<Role> {
    /**
     * 分配权限
     * @param roleId
     * @param menuIds
     */
    ResultCode doAssign(Integer roleId, String[] menuIds);
}
