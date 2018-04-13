package com.magict.magic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:application-stare.properties")
public class MagicStareApplication {

	public static void main(String[] args) {
		SpringApplication.run(MagicStareApplication.class, args);
	}

}
