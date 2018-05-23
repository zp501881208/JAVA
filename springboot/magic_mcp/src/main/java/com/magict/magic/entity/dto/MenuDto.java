package com.magict.magic.entity.dto;
/**
 * @author ZP
 * @date 2018/5/22 12:01
 * @description:菜单查询参数
 */
public class MenuDto {
    private String menuId;

    private String functionName;

    public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId;
    }

    public String getFunctionName() {
        return functionName;
    }

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }
}
