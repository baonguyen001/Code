package com.myth2code.com.myth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MythApplication {

	public static void main(String[] args) {
		SpringApplication.run(MythApplication.class, args);
	}

//	@Bean
//	public CommandLineRunner commandLineRunner(userDAO theDAO){
//
//		return runner ->{
//			adddUser(theDAO);
//		};
//	}
//
//	public void adddUser(userDAO theDAO) {
//		User user = new User();
//		user.setUsername("bao");
//		user.setPassword("root");
//		user.registerRole("ROLE_ADMIN");
//		theDAO.addUser(user);
//
//	}


}
