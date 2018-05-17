package com.magict.magic.mapper;

import com.magict.magic.entity.Menu;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
* 菜单表
* @author zp
* @date 2018-05-17 10:05:46
*/
public interface MenuMapper extends Mapper<Menu> {
    List<Menu> selectAdminMenu(Integer adminId);
}
