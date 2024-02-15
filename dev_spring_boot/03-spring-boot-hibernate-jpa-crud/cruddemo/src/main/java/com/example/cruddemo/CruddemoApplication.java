package com.example.cruddemo;

import com.example.cruddemo.dao.StudentDAO;
import com.example.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO){
		return runner -> {
//			createStudent(studentDAO);

			createMutiStudent(studentDAO);

//			readStudent(studentDAO);

//			queryForStudent(studentDAO);

//			queryForStudentByLastName(studentDAO);

//			updateStudent(studentDAO);

//			deleteStudent(studentDAO);

//			deleteAllStudent(studentDAO);
		};

	}

	private void deleteAllStudent(StudentDAO studentDAO) {
		int numRowDelete = studentDAO.deleteAll();
		System.out.println("Delete All Student: " + numRowDelete);
	}

	private void deleteStudent(StudentDAO studentDAO) {
		//retrieve student base on the id: primaty key
		int studentId = 3;

		//remove Student
		System.out.println("Deleting Student with Id: " + studentId );
		studentDAO.delete(studentId);




	}

	private void updateStudent(StudentDAO studentDAO) {
		//retrieve student base on the id: primaty key
		int studentId = 1;
		System.out.println("Getting student with id: " + studentId);
		Student myStudent = studentDAO.findId(studentId);

		System.out.println("Updating student...");
		//change first name to "Schonoby"
		myStudent.setFirstName("Schonoby");
		studentDAO.update(myStudent);

		//display update student
		System.out.println("Update student: " + myStudent);



	}

	private void queryForStudentByLastName(StudentDAO studentDAO) {
		//query list of student by lastName
		List<Student> studentList = studentDAO.findByLastName("Joid");

		//display list of student by lastName
		for(Student student: studentList){
			System.out.println(student);
		}
	}

	private void queryForStudent(StudentDAO studentDAO) {
		//Get a list of Student
		List<Student> studentList = studentDAO.findAll();

		//Display list of student
		for(Student student: studentList){
			System.out.println(student);
		}
	}

	private void readStudent(StudentDAO studentDAO) {
		//create new Student object
		System.out.println("Creating new Student object...");
		Student tempStudent = new Student("Kiada", "Joid", "kiada@gmail.com");

		//Save Student Object
		System.out.println("Saving Student Object...");
		studentDAO.save(tempStudent);

		//Display Student id
		int theId = tempStudent.getId();
		System.out.println("Save Student. Generated Id: " + theId);

		//Read Student get id
		System.out.println("Retrieving Student witd Id: " + theId);
		Student myStudent = studentDAO.findId(theId);
		System.out.println(myStudent);

	}

	private void createMutiStudent(StudentDAO studentDAO) {

		//create muti student object
		System.out.println("Creating muti Student objects...");
		Student tempStudent1 = new Student("Poe", "kai", "vausoir@gmail.com");
		Student tempStudent2 = new Student("Chat", "Pun", "chat@gmail.com");
		Student tempStudent3 = new Student("GPT", "Opina", "gpt@gmail.com");
		Student tempStudent4 = new Student("Kiada", "Joid", "kiada@gmail.com");


		//save student object
		studentDAO.save(tempStudent1);
		studentDAO.save(tempStudent2);
		studentDAO.save(tempStudent3);
		studentDAO.save(tempStudent4);

	}

	private void createStudent(StudentDAO studentDAO) {
		//create student object
		System.out.println("Creating new Student object...");
		Student tempStudent = new Student("Vaus", "Oir", "vausoir@gmail.com");

		//save student object
		System.out.println("Saving Student object...");
		studentDAO.save(tempStudent);

		//display is of the saved student
		System.out.println("Save Student. Generated id: " + tempStudent.getId());
	}
}
