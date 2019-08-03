package com.webspringbootexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.webspringbootexample")
@EntityScan("com.webspringbootexample")
public class MyWebSpringBoot2Application {

	public static void main(String[] args) {
		SpringApplication.run(MyWebSpringBoot2Application.class, args);
	}

}
