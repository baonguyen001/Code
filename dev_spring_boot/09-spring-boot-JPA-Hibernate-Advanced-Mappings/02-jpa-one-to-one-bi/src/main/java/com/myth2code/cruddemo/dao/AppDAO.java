package com.myth2code.cruddemo.dao;

import com.myth2code.cruddemo.entity.Instructor;
import com.myth2code.cruddemo.entity.InstructorDetail;

public interface AppDAO {

    void save(Instructor theInstructor);

    Instructor findInstructorById(int theId);

    InstructorDetail findInstructorDetailById(int theId);

    void deleteInstructorById(int theId);

    void deleteInstructorDetailById(int theId);

}
