package com.example.hr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

// @SpringBootApplication
// @SpringBootApplication(exclude = {DataSourceAutoConfiguration.classclass})
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class HrApplication {

	public static void main(String[] args) {
		SpringApplication.run(HrApplication.class, args);
	}

}
