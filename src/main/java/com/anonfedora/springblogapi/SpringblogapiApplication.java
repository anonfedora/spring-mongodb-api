package com.anonfedora.springblogapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class SpringblogapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringblogapiApplication.class, args);
	}

}
