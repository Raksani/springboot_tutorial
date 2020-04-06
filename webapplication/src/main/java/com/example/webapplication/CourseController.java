package com.example.webapplication;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class CourseController {

    @RequestMapping("/courses")
    public String courses() {
        System.out.println("welcome to Beau land!");
        return "course";
    }

}