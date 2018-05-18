package com.magict.magic.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;

/**
 *
 * @author ZP
 * @date 2018-5-18 14:13:02
 * @description:异步线程配置
 */
@Configuration
@EnableAsync
public class ExecutorConfig {
    public transient final Logger logger = LoggerFactory.getLogger(getClass());
    /** Set the ThreadPoolExecutor's core pool size.核心线程池 */
    private int corePoolSize = 10;
    /** Set the ThreadPoolExecutor's maximum pool size. */
    private int maxPoolSize = 200;
    /** Set the capacity for the ThreadPoolExecutor's BlockingQueue. */
    private int queueCapacity = 10;

   @Bean
    public Executor magicAsync(){
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(corePoolSize);
        executor.setMaxPoolSize(maxPoolSize);
        executor.setQueueCapacity(queueCapacity);
        executor.setThreadNamePrefix("MagicExecutor-");
        executor.initialize();
        return executor;
    }


}
