package com.myth2code.cruddemo;

import com.myth2code.cruddemo.dao.AppDAO;
import com.myth2code.cruddemo.entity.Course;
import com.myth2code.cruddemo.entity.Instructor;
import com.myth2code.cruddemo.entity.InstructorDetail;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.lang.reflect.Constructor;
import java.util.List;

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

			//deleteInstructorDetail(theAppDAO);

			//createInstructorWithCourse(theAppDAO);

			//findTheInstructorWithCourse(theAppDAO);

			//findCourseByInstructorById(theAppDAO);

			//findInstructorWithCourseJoinFetch(theAppDAO);

			//updateInstructor(theAppDAO);

			//updateTheCourse(theAppDAO);

			//removeInstructor(theAppDAO);

			removeCourse(theAppDAO);
		};
	}

	private void removeCourse(AppDAO theAppDAO) {
		// id
		int theId = 10;
		System.out.println("Finding Course By Id - " + theId);

		// remove
		System.out.println("Removing Course...");
		theAppDAO.removeCourse(theId);

		System.out.println("Done!");
	}

	private void removeInstructor(AppDAO theAppDAO){

		// id
		int theId = 1;
		System.out.println("Finding instructor By Id - " + theId);

		// remove
		System.out.println("Removing Instructor...");
		theAppDAO.removeInstructor(theId);

		System.out.println("Done!");
	}

	private void updateTheCourse(AppDAO theAppDAO) {

		//id
		int theId = 10;
		System.out.println("Finding Course By Id - " + theId);

		// get course
		Course course = theAppDAO.findCourseById(theId);
		System.out.println("Course - " + course);

		// update course
		System.out.println("Updating Course...");
		course.setTitle("TESTER Beginner");

		theAppDAO.updateCourse(course);

		System.out.println("Done!");

	}

	private void updateInstructor(AppDAO theAppDAO ){
		int theId = 1;
		System.out.println("Finding Instructor By Id - " + theId);

		Instructor instructor = theAppDAO.findInstructorById(theId);
		System.out.println("Welcome Instructor - " + instructor);

		System.out.println("Updating Instructor...");
		instructor.setLastName("TESTER");

		theAppDAO.updateInstructor(instructor);
		System.out.println("Done!");
	}

	private void findInstructorWithCourseJoinFetch(AppDAO theAppDAO) {

		int theId = 1;
		System.out.println("Finding Instructor By Id - " + theId);

		Instructor instructor = theAppDAO.findInstructorByIdJoinFetch(theId);
		System.out.println("Welcome Instructor - " + instructor);

		System.out.println("Course List - " + instructor.getCourses());
		System.out.println("Done!");


	}

	private void findCourseByInstructorById(AppDAO theAppDAO) {

		// Id
		int theId = 1;
		System.out.println("Finding Instructor By Id - " + theId);

		// Get Instructor
		Instructor instructor = theAppDAO.findInstructorById(theId);
		System.out.println("Instructor By Id - " + instructor);

		// Get Course
		System.out.println("Finding Course By Instructor By Id - " + theId);
		List<Course> courses = theAppDAO.findCourseInstructorById(theId);

		// Set Course For Instructor
		instructor.setCourses(courses);

		// Display
		System.out.println("List Course - " + instructor.getCourses());

		System.out.println("Done!s");
	}

	private void findTheInstructorWithCourse(AppDAO theAppDAO) {

		int theId = 1;

		Instructor theInstructor = theAppDAO.findInstructorById(theId);

		System.out.println("Welcome Instructor - " + theInstructor);
		System.out.println("The Course - " + theInstructor.getCourses());

		System.out.println("Done!");
	}

	private void createInstructorWithCourse(AppDAO theAppDAO) {

		//New Instructor
		Instructor theInstructor = new Instructor(
				"Shaly", "Couple", "shaly@myth2code.com"
		);

		//New Instructor_Detail
		InstructorDetail theInstructorDetail = new InstructorDetail(
				"http://youtobe.com", "Cheese"
		);

		theInstructor.setInstructorDetail(theInstructorDetail);

		//Create Course
		Course course1 = new Course("Spring Beginner");
		Course course2 = new Course("Spring Boot");
		Course course3 = new Course("Spring Hibernate");

		theInstructor.add(course1);
		theInstructor.add(course2);
		theInstructor.add(course3);

		//Save Instructor
		System.out.println("Saving Instructor - " + theInstructor);
		System.out.println("The Course - " + theInstructor.getCourses());
		theAppDAO.save(theInstructor);

		System.out.println("Done!");
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


























