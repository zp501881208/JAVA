package com.magict.magic.service.impl;

import com.magict.magic.entity.Role;
import com.magict.magic.entity.RoleMenu;
import com.magict.magic.entity.vo.ResultCode;
import com.magict.magic.enums.StatusCode;
import com.magict.magic.mapper.RoleMapper;
import com.magict.magic.service.RoleMenuService;
import com.magict.magic.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* 角色表实现
* @author zp
* @date 2018-05-17 17:01:16
*/
@Service("roleService")
public class RoleServiceImpl extends BaseServiceImpl<Role> implements RoleService {
    @Autowired
    private RoleMapper roleMapper;
    @Autowired
    RoleMenuService roleMenuService;


    @Transactional
    @Override
    public ResultCode doAssign(Integer roleId, String[] menuIds) {
        if(null!=menuIds && menuIds.length>0){
            //先清除
            roleMenuService.deleteByRoleId(roleId);
            //再逐个新增
            for (String menuId : menuIds) {
                RoleMenu roleMenu = new RoleMenu();
                roleMenu.setRoleId(roleId);
                roleMenu.setMenuId(menuId);
                roleMenuService.insertSelective(roleMenu);
            }
            return new ResultCode(StatusCode.SUCCESS);
        }else{
            return new ResultCode(StatusCode.ROLEMENU_NOMENU);
        }
    }
}
