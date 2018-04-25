package com.magict.magic.service;

import com.magict.magic.entity.Message;

/**
* 接口
* @author zp
* @date 2018-04-17 15:12:22
*/
public interface MessageService extends BaseService {
    Message selectByPrimaryKey(Integer id);
}
