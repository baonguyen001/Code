package com.myth2code.cruddemo;

import com.myth2code.cruddemo.dao.AppDAO;
import com.myth2code.cruddemo.entity.Instructor;
import com.myth2code.cruddemo.entity.InstructorDetail;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(AppDAO theAppDAO){

		return runner -> {
			//createInstructor(theAppDAO);

			//findTheInstructor(theAppDAO);

			//deleteInstructor(theAppDAO);

			//findTheInstructorDetail(theAppDAO);

				deleteInstructorDetail(theAppDAO);
		};
	}

	private void deleteInstructorDetail(AppDAO theAppDAO) {

		// Id
		int theId = 3;
		System.out.println("Deleting Instructor Detail By Id - " + theId);

		// delete
		theAppDAO.deleteInstructorDetailById(theId);
		System.out.println("Done!");

	}

	private void findTheInstructorDetail(AppDAO theAppDAO) {

		int theId = 2;

		InstructorDetail theInstructorDetail = theAppDAO.findInstructorDetailById(theId);

		System.out.println("YooHo! Hello - " + theInstructorDetail);
		System.out.println("And Welcome to - " + theInstructorDetail.getInstructor());

	}

	private void deleteInstructor(AppDAO theAppDAO) {

		// Id Instructor
		int theId = 1;

		// Display
		System.out.println("Deleting Instructor...");

		// Delete Instructor
		theAppDAO.deleteInstructorById(theId);

		//
		System.out.println("Deleted Instructor By Id - " + theId );



	}

	private void findTheInstructor(AppDAO theAppDAO) {

		// The id to find
		int theId = 2;

		// Get Instructor in db
		Instructor theInstructor = theAppDAO.findInstructorById(theId);

		// Display Instructor
		System.out.println("Hello Nice To See You Again - " + theInstructor);

		// Display Instructor_Detail
		System.out.println("And Instructor Detail - " + theInstructor.getInstructorDetail());

	}

	private void createInstructor(AppDAO theAppDAO) {


		//New Instructor
		Instructor theInstructor = new Instructor(
				"Tom", "Shaly", "banana@myth2code.com"
		);

		//New Instructor_Detail
		InstructorDetail theInstructorDetail = new InstructorDetail(
				"Banana.Youtube.Channel", "Eat Banana"
		);

		/*
		//New Instructor
		Instructor theInstructor = new Instructor(
				"Marry", "Bert", "marry@myth2code.com"
		);

		//New Instructor_Detail
		InstructorDetail theInstructorDetail = new InstructorDetail(
				"Marry.Youtube.Channel", "Violon"
		);
		*/

		//Set Instructor_Detail
		theInstructor.setInstructorDetail(theInstructorDetail);

		//Display
		System.out.println("Hello Welcome My Big Family - \n" + "Saving Instructor - " + theInstructor);

		//Save Instructor
		theAppDAO.save(theInstructor);

	}
}


























