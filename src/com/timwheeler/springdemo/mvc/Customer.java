package com.timwheeler.springdemo.mvc;

import com.timwheeler.springdemo.mvc.validation.CourseCode;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.*;

public class Customer {

    @NotNull(message = "required")
    @Size(min = 2, message = "required")
    private String firstName;

    @NotNull(message = "required")
    @Size(min = 2, message = "required")
    private String lastName;

    @NotNull(message = "required")
    @Range(min = 0, max = 10, message = "Select up to 10 free passes")
    private Integer freePasses;

    @NotNull(message = "required")
    @Pattern(regexp = "^[0-9]{5}", message = "Please enter a valid ZIP code.")
    private String zipCode;

    @CourseCode
    private String courseCode;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getFreePasses() {
        return freePasses;
    }

    public void setFreePasses(Integer freePasses) {
        this.freePasses = freePasses;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }
}
