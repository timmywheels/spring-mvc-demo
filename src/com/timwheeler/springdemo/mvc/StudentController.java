package com.timwheeler.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {


    @RequestMapping("/renderForm")
    public String renderForm(Model theModel) {

        // create a student object
        Student theStudent = new Student();
        // add student object to model
        theModel.addAttribute("student", theStudent);


        return "student-form";
    }

    @RequestMapping("/processForm")
    public String processForm(@ModelAttribute("student") Student theStudent) {
        System.out.println(
                "theStudent: " + theStudent.getFirstName() + " " + theStudent.getLastName()
                + "\nCountry: " + theStudent.getCountry()
                + "\nProgramming Language: " + theStudent.getProgrammingLanguages()
                + "\nOperating System(s): " + theStudent.getOperatingSystems()
        );

        return "student-confirmation";
    }

}
