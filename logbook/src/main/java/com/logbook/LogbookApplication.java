package com.logbook;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.logbook.*.mapper")
@ComponentScan(basePackages = {"com.logbook.config","com.logbook.business","com.logbook.user"})
public class LogbookApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(LogbookApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(LogbookApplication.class);
	}
}
