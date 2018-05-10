package com.magict.magic.service.impl;

import com.magict.magic.entity.BaseEntity;
import com.magict.magic.service.BaseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.common.Mapper;

import java.io.Serializable;

/**
 * Mapper使用范例
 * 参考资料http://www.mybatis.tk/
 *  List<Country> selectByWeekendSql = mapper.selectByExample(new Example.Builder(Country.class)
 .where(WeekendSqls.<Country>custom().andLike(Country::getCountryname, "%a%")
 .andGreaterThan(Country::getCountrycode, "123"))
 .build());
 *         List<WxUser> wxUserList = wxUserMapper.selectByExample(new Example.Builder(WxUser.class)
 .andWhere(WeekendSqls.<WxUser>custom().andEqualTo(WxUser::getOpenid,openid))
 .build());
 WeekendSqls<WxUser> wxUserWeekendSqls = WeekendSqls.<WxUser>custom().andLike(WxUser::getNickname, "%test%");
 Example example = Example.builder(WxUser.class).andWhere(wxUserWeekendSqls).build();
 List<WxUser> wxUserList = wxUserMapper.selectByExample(example);
 * @param <T>
 */
public class BaseServiceImpl<T extends Serializable> implements BaseService<T> {
    protected transient final Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    protected Mapper<T> mapper;

    @Override
    public boolean insertSelective(T entity) {
        return 1==mapper.insertSelective(entity);
    }

    @Override
    public T selectByPrimaryKey(Serializable id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public boolean updateByPrimaryKeySelective(T entity) {
        return false;
    }

}
