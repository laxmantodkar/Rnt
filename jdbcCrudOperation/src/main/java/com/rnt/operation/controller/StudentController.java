package com.rnt.operation.controller;

import java.util.List;

import javax.imageio.ImageTranscoder;

import org.eclipse.jdt.internal.compiler.env.IUpdatableModule.UpdateKind;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.rnt.operation.Studentdao.StudentDao;
import com.rnt.operation.model.Student;

@Controller
public class StudentController {

	StudentDao studentDao = new StudentDao();

	// Home Page select Data
	// select All Student
	@RequestMapping("/")
	public ModelAndView test() {
		ModelAndView modelAndView = new ModelAndView();
		List<Student> student = studentDao.getAllStudent();
		
		modelAndView.addObject("student", student);
		modelAndView.setViewName("index");
		return modelAndView;
	}
	
	// Add New Student
	@RequestMapping("/student")
	public ModelAndView addStudent() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("title", "Add Student");
		modelAndView.setViewName("addStudent");
		return modelAndView;
	}

	// insert Student
	@RequestMapping(value = "/student", method = RequestMethod.POST)
	public String saveStudent(@ModelAttribute Student student) {

		int i = studentDao.insertStudent(student);
		
		return "redirect:/";

	}

	//update
	@RequestMapping("/update/{id}")
	public ModelAndView update(@PathVariable("id") int id)
	{
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.addObject("update",studentDao.getSingleStudent(id));
	    modelAndView.addObject("title", "Update Student");
	    modelAndView.setViewName("update");
		return modelAndView;
	}
	
	
	
	// Update student
	@RequestMapping(value="/updateStudent", method=RequestMethod.POST)
	public String updateStudent( @ModelAttribute Student student, Model model)
	{
		System.out.println(student);
		ModelAndView modelAndView=new ModelAndView();
		int i = studentDao.updateStudent(student);
		System.out.println();
	    
		return "redirect:/";
	
		
	}
	
	//delete
	@RequestMapping("/delete/{id}")
	public String deleteStudent(@PathVariable("id") int id)
	{
		studentDao.deleteStudent(id);
		return "redirect:/";
		
	}
	
	
	
	
	
	
	
	
	
}
