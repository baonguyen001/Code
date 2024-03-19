package com.myth2code.cruddemo.dao;

import com.myth2code.cruddemo.entity.Instructor;
import com.myth2code.cruddemo.entity.InstructorDetail;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

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
}
















