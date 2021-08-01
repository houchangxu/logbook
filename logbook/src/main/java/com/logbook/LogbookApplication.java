package com.logbook;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.logbook.business.*.mapper")
@ComponentScan(basePackages = {"com.logbook.config","com.logbook.business"})
public class LogbookApplication {

	public static void main(String[] args) {
		SpringApplication.run(LogbookApplication.class, args);
	}

}
