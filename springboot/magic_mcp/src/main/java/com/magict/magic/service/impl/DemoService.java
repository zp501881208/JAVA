package com.magict.magic.service.impl;/**
 * @author ZP
 * @date 2018/5/1814:18
 * @description:
 */

import com.magict.magic.entity.Menu;
import com.magict.magic.service.MenuService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 *
 * @author ZP
 * @date 2018/5/1814:18
 * @description:
 */
@Component
public class DemoService {
    protected transient final Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    MenuService menuService;

    @Async
    public void testAsync(){
        for (int i=0;i<100;i++){
            logger.info("AAAAAAA:{},{}",i,Thread.currentThread().getName());
        }
    }

    @Async
    public void testAsync2(){
        for (int i=0;i<100;i++){
            logger.info("BBBBBBB:{},{}",i,Thread.currentThread().getName());
        }
    }
}
