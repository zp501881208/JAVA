package com.magict.magic.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * 
 * 工具生成不可修改
 * @author zp
 * @date 2018-05-10 20:53:23
 */
@Table(name = "`admin`")
public class Admin extends BaseEntity implements Serializable {
    @Id
    @Column(name = "admin_id")
    private Integer adminId;

    /**
     * 管理员名称
     */
    @Column(name = "admin_name")
    private String adminName;

    /**
     * 登录名
     */
    @Column(name = "login_name")
    private String loginName;

    /**
     * 登录密码
     */
    @Column(name = "login_password")
    private String loginPassword;

    /**
     * 状态:0不可用1可用......
     */
    @Column(name = "admin_status")
    private Integer adminStatus;

    /**
     * 分支(预留)
     */
    @Column(name = "admin_trunk")
    private Integer adminTrunk;

    private static final long serialVersionUID = 1L;

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName == null ? null : adminName.trim();
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName == null ? null : loginName.trim();
    }

    public String getLoginPassword() {
        return loginPassword;
    }

    public void setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword == null ? null : loginPassword.trim();
    }

    public Integer getAdminStatus() {
        return adminStatus;
    }

    public void setAdminStatus(Integer adminStatus) {
        this.adminStatus = adminStatus;
    }

    public Integer getAdminTrunk() {
        return adminTrunk;
    }

    public void setAdminTrunk(Integer adminTrunk) {
        this.adminTrunk = adminTrunk;
    }
}