package com.timwheeler.springdemo.mvc.validation;


import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = CourseConstraintValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface CourseCode {

    // define attributes
    public String value() default "TW";
    // define default error message
    public String message() default "must start with TW";
    // define default groups
    public Class<?>[] groups() default {};
    // define default payloads
    public Class<? extends Payload>[] payload() default {};
}
