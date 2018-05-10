package com.magict.magic.compoment;

import com.magict.magic.entity.Admin;
import com.magict.magic.enums.BooleanEnum;
import com.magict.magic.service.AdminService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author: ZP
 * @date: 2018-5-10 21:16:41
 * @description: 加载用户信息
 */
@Component
public class SecurityCmpt implements UserDetailsService {
    @Autowired
    AdminService adminService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        if(StringUtils.isBlank(username)){
            throw new UsernameNotFoundException("用户名为空!");
        }
        //根据账号查询用户信息
        Admin admin = adminService.findByLoginName(username);
        if(admin==null){
            new UsernameNotFoundException("账号不存在");
        }
        if(BooleanEnum.NO.getKey().equals(admin.getAdminStatus())){
            new UsernameNotFoundException("账号已冻结");
        }
        //根据admin角色查询权限




        List<GrantedAuthority> authorities = AuthorityUtils.createAuthorityList();
        return new User(username,admin.getLoginPassword(),true,true,true,true,authorities);
    }
}
