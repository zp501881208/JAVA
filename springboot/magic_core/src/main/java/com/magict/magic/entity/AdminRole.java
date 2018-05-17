package com.magict.magic.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * 管理员角色表
 * 工具生成不可修改
 * @author zp
 * @date 2018-05-17 16:23:18
 */
@Table(name = "`admin_role`")
public class AdminRole extends BaseEntity implements Serializable {
    @Id
    private Integer id;

    @Column(name = "admin_id")
    private Integer adminId;

    @Column(name = "role_id")
    private Integer roleId;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }
}