package com.example.exam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

//**useService is a service to perform CRUD of a single user at a time**//

@EnableEurekaClient
@SpringBootApplication
public class SingleUserRegistrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(SingleUserRegistrationApplication.class, args);
	}

}
