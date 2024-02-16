package nguyenquocbaotu.gmail.com.RestAPI.rest;

import jakarta.annotation.PostConstruct;
import nguyenquocbaotu.gmail.com.RestAPI.entity.Student;
import nguyenquocbaotu.gmail.com.RestAPI.rest.error.StudentErrorResponse;
import nguyenquocbaotu.gmail.com.RestAPI.rest.error.StudentNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    private List<Student> theStudent;

    // define @PostConstruct to load data student .. only one!

    @PostConstruct
    public void loadData(){
        theStudent = new ArrayList<>();

        theStudent.add(new Student("Bao", "Nguyen"));
        theStudent.add(new Student("Luong", "Xuan"));
        theStudent.add(new Student("Chuc", "Dai"));
    }

    // define endpoint "/student" - return list Student

    @GetMapping("/student")
    public List<Student> listStudent(){

        return theStudent;
    }

    // define endpoint "/student/{studentId}" - return Student at index

    @GetMapping("/student/{studentId}")
    public Student getStudent(@PathVariable int studentId){

        // check studentId again list size

        if(studentId >= theStudent.size() || studentId < 0){
            throw new StudentNotFoundException("Student Id Not Found - " + studentId);
        }
        return theStudent.get(studentId);
    }

}
