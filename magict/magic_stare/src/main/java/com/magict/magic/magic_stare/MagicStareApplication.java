package com.magict.magic.magic_stare;

import com.magict.magic.magic_core.MagicCoreApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
@Configuration
@SpringBootApplication(scanBasePackages="com.magict")
@PropertySource("classpath:application-stare.properties")
@Import(MagicCoreApplication.class)
@ServletComponentScan
public class MagicStareApplication {

	public static void main(String[] args) {
		SpringApplication.run(MagicStareApplication.class, args);
	}
}
