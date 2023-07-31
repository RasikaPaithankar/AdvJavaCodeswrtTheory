package com.java.fortytwolabs.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.java.fortytwolabs.pojo.Student;
import com.java.fortytwolabs.pojo.Subject;

@Controller
public class StudentController {

	
	@RequestMapping("/")
	public ModelAndView getStudent(@RequestParam("sName") String sName) {
		Student s = new Student();
		s.setName("abc");
		s.setAge(1);
		s.setAddress("ABC,ABC");
		Subject subject = new Subject();
		subject.setMaths(0);
		subject.setPhysics(2);
		ArrayList<Subject> subjects = new ArrayList<Subject>();
		subjects.add(subject);
		s.setSubjects(subjects );
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("getData.htm");
		modelAndView.addObject("result", s);
		
		//return "getData.htm";
		return modelAndView;
	}
}
