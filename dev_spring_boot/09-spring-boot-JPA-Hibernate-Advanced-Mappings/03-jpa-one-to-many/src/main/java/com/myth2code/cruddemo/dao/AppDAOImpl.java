package com.myth2code.cruddemo.dao;

import com.myth2code.cruddemo.entity.Course;
import com.myth2code.cruddemo.entity.Instructor;
import com.myth2code.cruddemo.entity.InstructorDetail;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AppDAOImpl implements AppDAO{

    private EntityManager entityManager;

    @Autowired
    public AppDAOImpl(EntityManager theEntityManager){
        this.entityManager = theEntityManager;
    }

    @Override
    @Transactional
    public void save(Instructor theInstructor) {
        entityManager.persist(theInstructor);
    }

    @Override
    public Instructor findInstructorById(int theId) {

        return  entityManager.find(Instructor.class, theId);
    }

    @Override
    public InstructorDetail findInstructorDetailById(int theId) {

        return entityManager.find(InstructorDetail.class, theId);
    }

    @Override
    @Transactional
    public void deleteInstructorById(int theId) {

        // find instructor by id
        Instructor theInstructor = entityManager.find(Instructor.class, theId);

        // delete instructor
        entityManager.remove(theInstructor);

    }

    @Override
    @Transactional
    public void deleteInstructorDetailById(int theId) {

        // find Instructor Detail
        InstructorDetail theInstructorDetail = entityManager.find(InstructorDetail.class, theId);

        // Remove references to Instructor
        // Break link
        //
        theInstructorDetail.getInstructor().setInstructorDetail(null);

        //delete Instructor Detail
        entityManager.remove(theInstructorDetail);

    }

    @Override
    public List<Course> findCourseInstructorById(int theId) {


        TypedQuery<Course> query = entityManager.createQuery("from Course where instructor.id=:data", Course.class);
        query.setParameter("data", theId);

        List<Course> result = query.getResultList();

        return result;
    }

    @Override
    public Instructor findInstructorByIdJoinFetch(int theId) {

        TypedQuery<Instructor> query = entityManager.createQuery(
                "select i from Instructor i JOIN FETCH i.courses WHERE i.id = :data", Instructor.class);

        query.setParameter("data", theId);

        Instructor result = query.getSingleResult();

        return result;
    }

    @Override
    @Transactional
    public void updateInstructor(Instructor instructor) {
        entityManager.merge(instructor);
    }

    @Override
    @Transactional
    public void updateCourse(Course course) {
        entityManager.merge(course);
    }

    @Override
    public Course findCourseById(int theId) {

        return entityManager.find(Course.class, theId);
    }

    @Override
    @Transactional
    public void removeInstructor(int theId) {

        // get instructor
        Instructor instructor = findInstructorById(theId);

        List<Course> courseList = instructor.getCourses();

        // break link course
        for(Course course: courseList){
            course.setInstructor(null);
        }

        // remove instructor
        entityManager.remove(instructor);
    }

    @Override
    @Transactional
    public void removeCourse(int theId) {

        // find course
        Course course = entityManager.find(Course.class, theId);

        // remove course
        entityManager.remove(course);

    }
}
















