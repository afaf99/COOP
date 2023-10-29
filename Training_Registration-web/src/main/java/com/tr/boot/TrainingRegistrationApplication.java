package com.tr.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableAsync;

//@SpringBootApplication
@EnableJpaRepositories("com.tr.repository")
@SpringBootApplication(scanBasePackages = "com.tr.boot")
@EntityScan("com.tr.model")
@EnableAsync
@EnableCaching
@ComponentScan(basePackages = "com.tr")
public class TrainingRegistrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrainingRegistrationApplication.class, args);
	}


}
