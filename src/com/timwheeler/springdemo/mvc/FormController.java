package com.timwheeler.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/form")
public class FormController {

    // need controller method to show initial html form

    @RequestMapping("/renderForm")
    public String renderForm(){
        return "form";
    }

    // need controller to process form
    @RequestMapping("/processForm")
    public String processForm() {
        return "thank-you";
    }

    @RequestMapping("/formatData")
    public String formatData(HttpServletRequest request, Model model) {

        // read req param from html form
        String name = request.getParameter("studentName");
        // convert form data to uppercase
        name = name.toUpperCase();
        // create the message
        String result = "Hello, " + name;
        // add message to the model
        model.addAttribute("message", result);

        return "thank-you";
    }

    @RequestMapping("/processFormData")
    public String processFormData(
            @RequestParam("studentName") String name,
            Model model) {

        name = name.toUpperCase();

        String result = "Student: " + name;

        model.addAttribute("message", result);

        return "thank-you";
    }



}
