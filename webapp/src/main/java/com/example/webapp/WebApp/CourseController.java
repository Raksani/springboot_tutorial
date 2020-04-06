package com.example.webapp.WebApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class CourseController {

    @RequestMapping("course")
    public String courses() {
        System.out.println("welcome to Beau land!");
        return "course";
    }

}