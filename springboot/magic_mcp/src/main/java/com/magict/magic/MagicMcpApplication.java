package com.magict.magic;

import com.magict.magic.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.magict.magic.mapper")
public class MagicMcpApplication {

	public static void main(String[] args) {
		SpringApplication.run(MagicMcpApplication.class, args);
	}
}
