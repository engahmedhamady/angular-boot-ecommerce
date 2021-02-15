package com.spring.Boot.ECommerceBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages ={"com.store"})
//@EntityScan(basePackages = {"com.store.entities"})
public class ECommerceBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(ECommerceBootApplication.class, args);
	}

}
