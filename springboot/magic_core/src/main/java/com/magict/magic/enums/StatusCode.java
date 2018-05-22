package com.magict.magic.enums;

/**
 * API统一返回状态码
 *
 * @author guojun
 */
public enum StatusCode {
	
	SUCCESS(1, "成功"),
	FAIL(0,"失败"),

    ROLEMENU_NOMENU(10,"请至少选择一个菜单")

    ;

    private int code;
    private String msg;

    StatusCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
