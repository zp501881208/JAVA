package com.magict.magic.enums;

/**
 * @author ZP
 * @date 2018/5/1021:45
 * @description:
 */
public enum BooleanEnum implements BaseEnum{
    NO(0,"否"),
    YES(1,"是");

    private Integer key;
    private String desc;

    BooleanEnum(Integer key,String desc){
        this.key = key;
        this.desc = desc;
    }

    public static String getDesc(String key) {
        for (BooleanEnum c : BooleanEnum.values()) {
            if (c.getKey().equals(key)) {
                return c.desc;
            }
        }
        return null;
    }

    @Override
    public Integer getKey() {
        return null;
    }
    @Override
    public String getDesc() {
        return null;
    }
}
