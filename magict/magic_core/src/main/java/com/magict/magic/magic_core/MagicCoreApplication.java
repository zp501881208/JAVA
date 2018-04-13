package com.magict.magic.magic_core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@EnableCaching
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class MagicCoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(MagicCoreApplication.class, args);
	}
}
