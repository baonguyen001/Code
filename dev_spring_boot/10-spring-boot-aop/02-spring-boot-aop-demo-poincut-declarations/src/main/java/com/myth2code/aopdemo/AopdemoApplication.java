package com.myth2code.aopdemo;

import com.myth2code.aopdemo.dao.AccountDAO;
import com.myth2code.aopdemo.dao.MemberDAO;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AopdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AopdemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(AccountDAO theAccountDAO, MemberDAO theMemberDAO){

		return runner ->{

			demoTheBeforeAdvice(theAccountDAO, theMemberDAO);

		};
	}

	private void demoTheBeforeAdvice(AccountDAO theAccountDAO, MemberDAO theMemberDAO) {

		Account account = new Account();

		theAccountDAO.addAccount(account);

		theMemberDAO.addAccount();

	}

}
