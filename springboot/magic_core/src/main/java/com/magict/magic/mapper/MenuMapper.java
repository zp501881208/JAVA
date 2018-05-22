package com.magict.magic.mapper;

import com.magict.magic.entity.Menu;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
* 菜单表
* @author zp
* @date 2018-05-22 10:03:05
*/
public interface MenuMapper extends Mapper<Menu> {
    /**
     * 查询用户有权访问的(所有/可用)菜单
     * @param adminId
     * @return
     */
    List<Menu> selectAdminMenu(@Param("adminId") Integer adminId, @Param("isEnable") Integer isEnable);

    /**
     * 查询用户无权访问的(所有/可用)菜单
     * @param adminId
     * @return
     */
    List<Menu> selectAdminNoMenu(@Param("adminId") Integer adminId, @Param("isEnable") Integer isEnable);

}
