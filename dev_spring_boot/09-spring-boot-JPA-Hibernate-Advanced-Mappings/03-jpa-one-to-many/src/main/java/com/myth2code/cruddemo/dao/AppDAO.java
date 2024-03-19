package com.myth2code.cruddemo.dao;

import com.myth2code.cruddemo.entity.Course;
import com.myth2code.cruddemo.entity.Instructor;
import com.myth2code.cruddemo.entity.InstructorDetail;

import java.util.List;

public interface AppDAO {

    void save(Instructor theInstructor);

    Instructor findInstructorById(int theId);

    InstructorDetail findInstructorDetailById(int theId);

    void deleteInstructorById(int theId);

    void deleteInstructorDetailById(int theId);

    List<Course> findCourseInstructorById(int theId);

    Instructor findInstructorByIdJoinFetch(int theId);

    void updateInstructor(Instructor instructor);

    void updateCourse(Course course);

    Course findCourseById(int theId);

    void removeInstructor(int theId);

    void removeCourse(int theId);

}
