package com.magict.magic.service;

import com.magict.magic.entity.BaseEntity;

import java.io.Serializable;
import java.util.List;

public interface BaseService<T extends Serializable> {
    /**
     * 添加
     * @param entity 添加对象
     * @return
     */
    boolean insertSelective(T entity);

    /**
     * 根据id查询
     * @param id
     * @return
     */
    T selectByPrimaryKey(Serializable id);

    /**
     * 根据id更新
     * @param entity 更新对象
     * @return
     */
    boolean updateByPrimaryKeySelective(T entity);

    /**
     * 查询所有，数据量大的表禁用
     * @return
     */
    List<T> selectAll();
}
