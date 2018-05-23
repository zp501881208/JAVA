package com.magict.magic.util;

import org.apache.commons.lang3.StringUtils;

/**
 * @author ZP
 * @date 2018/5/23 16:52
 * @description: sql工具类
 */
public class SqlUtil {
    /**
     * like查询两头加百分号
     * @param column
     * @return
     */
    public static String getLikeColumn(String column){
        if(StringUtils.isEmpty(column)){
            return null;
        }else{
            return "%"+column+"%";
        }
    }
}
