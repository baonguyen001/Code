package com.myth2code.spring.mvc.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = CourseCodeConstraintValidation.class) // rule valiation
@Target({ElementType.METHOD, ElementType.FIELD}) // áp dụng trên method, field
@Retention(RetentionPolicy.RUNTIME) // Time run
public @interface CourseCode {

    // define default course code
    public String value() default "MYTH";

    // define default error message
    public String message() default "must start with MYTH";

    // define default groups
    public Class<?>[] groups() default {};

    // define defaul payloads
    public Class<? extends Payload>[] payload() default {};








}
