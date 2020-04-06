package com.example.demo;

import javax.servlet.http.HttpSession;

// import javax.servlet.http.HttpServletRequest;
// import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
// import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CoursesController {
	@RequestMapping("courses")
	public ModelAndView courses(@RequestParam("cname")String name, HttpSession session) {
		System.out.println("The course name is: " + name);
		ModelAndView mv = new ModelAndView();
		mv.addObject("cname", name);
		mv.setViewName("course");
		return mv;
	}

	// public String courses(HttpServletRequest request) {
	// HttpSession session = request.getSession();
	// String name = request.getParameter("name");
	// System.out.println("The course name is: " + name);
	// session.setAttribute("name", name);
	// return "course";
	// }
	// stil working as well
	// public String courses(String name, HttpSession session) {
	// System.out.println("The course name is: " + name);
	// session.setAttribute("name", name);
	// return "course";
	// }
	// alternative param to the url
	// public String courses(@RequestParam("cname")String name, HttpSession session)
	// {
	// System.out.println("The course name is: " + name);
	// session.setAttribute("name", name);
	// return "course";
	// }

}
