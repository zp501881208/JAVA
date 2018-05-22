package com.magict.magic.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * 菜单表
 * 工具生成不可修改
 * @author zp
 * @date 2018-05-22 10:03:05
 */
@Table(name = "`menu`")
public class Menu extends BaseEntity implements Serializable {
    /**
     * 菜单ID/权限
     */
    @Id
    @Column(name = "menu_id")
    private String menuId;

    /**
     * 菜单深度，一级菜单非功能菜单，二级菜单为某功能菜单，三级菜单为具体功能的操作
     */
    @Column(name = "menu_deep")
    private Integer menuDeep;

    /**
     * 菜单图标
     */
    @Column(name = "function_icon")
    private String functionIcon;

    /**
     * 菜单名称
     */
    @Column(name = "function_name")
    private String functionName;

    /**
     * 菜单访问路径
     */
    @Column(name = "function_url")
    private String functionUrl;

    /**
     * 父类ID
     */
    @Column(name = "parent_id")
    private String parentId;

    /**
     * 排序号,倒序排列
     */
    @Column(name = "order_num")
    private String orderNum;

    /**
     * 是否为可执行菜单
     */
    @Column(name = "is_run_menu")
    private Integer isRunMenu;

    /**
     * 是否可使用1-正常 0-关闭
     */
    @Column(name = "is_enable")
    private Integer isEnable;

    /**
     * 说明
     */
    @Column(name = "menu_desc")
    private String menuDesc;

    private static final long serialVersionUID = 1L;

    public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId == null ? null : menuId.trim();
    }

    public Integer getMenuDeep() {
        return menuDeep;
    }

    public void setMenuDeep(Integer menuDeep) {
        this.menuDeep = menuDeep;
    }

    public String getFunctionIcon() {
        return functionIcon;
    }

    public void setFunctionIcon(String functionIcon) {
        this.functionIcon = functionIcon == null ? null : functionIcon.trim();
    }

    public String getFunctionName() {
        return functionName;
    }

    public void setFunctionName(String functionName) {
        this.functionName = functionName == null ? null : functionName.trim();
    }

    public String getFunctionUrl() {
        return functionUrl;
    }

    public void setFunctionUrl(String functionUrl) {
        this.functionUrl = functionUrl == null ? null : functionUrl.trim();
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId == null ? null : parentId.trim();
    }

    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum == null ? null : orderNum.trim();
    }

    public Integer getIsRunMenu() {
        return isRunMenu;
    }

    public void setIsRunMenu(Integer isRunMenu) {
        this.isRunMenu = isRunMenu;
    }

    public Integer getIsEnable() {
        return isEnable;
    }

    public void setIsEnable(Integer isEnable) {
        this.isEnable = isEnable;
    }

    public String getMenuDesc() {
        return menuDesc;
    }

    public void setMenuDesc(String menuDesc) {
        this.menuDesc = menuDesc == null ? null : menuDesc.trim();
    }
}