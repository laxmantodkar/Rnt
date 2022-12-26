package com.rnt.emp.Controller;

import java.io.InputStream;
import java.lang.ProcessBuilder.Redirect;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.websocket.Endpoint;

import org.apache.taglibs.standard.lang.jstl.test.beans.PublicBean1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.view.RedirectView;

import com.rnt.emp.model.Employee;
import com.rnt.emp.service.EmpService;

@Controller
public class EmpController {
	@Autowired
	private EmpService empService;

	@RequestMapping("/")
	public String home(Model model) {

		List<Employee> emp = empService.getEmp();
		model.addAttribute("Employee", emp);
	
		return "index";
	}

	@RequestMapping("/add_emp")
	// @ModelAttribute
	public String addEmp(Model model) {
		model.addAttribute("title", "Add Employee");
		
		return "add_emp";
	}

	// Insert page
	@RequestMapping(value = "/save_emp", method = RequestMethod.POST)
	public String handleEmp(@ModelAttribute Employee emp, HttpServletRequest request, Model model) throws InterruptedException {
		String msg = empService.createEmp(emp);
		//System.out.println(msg);
		//model.addAttribute("insertSuccessfully", msg);
		Thread.sleep(1000);
		return "redirect:/";
	}

	// delete
	@RequestMapping("/delete_emp/{empId}")
	public String deleteEmp(@PathVariable("empId") int empId,Model  model) throws InterruptedException {
		String msg = empService.deleteEmp(empId);
		//model.addAttribute("deleteSuccessfully", msg);
		//System.out.println(msg);
		Thread.sleep(1000);
		return "redirect:/";
	}
   //update
	@RequestMapping("/update/{empId}")
	public String updateEmp(@PathVariable("empId") int empId, Model model) {

		Employee emp = empService.getSingleEmp(empId);
		model.addAttribute("title","Update Employee");
		model.addAttribute("emp", emp);
		return "update";

	}

	// Update form
	@RequestMapping(value = "/update_emp", method = RequestMethod.POST)
	public String updateEmp(@ModelAttribute Employee emp, Model model) throws InterruptedException {
		String msg = empService.updateEmp(emp);
		//model.addAttribute("UpdateSuccessfully", msg);
		//System.out.println(msg);
		Thread.sleep(1000);
		return "redirect:/";
	}
	
	//search
       @RequestMapping(value="/search",method = RequestMethod.POST)
       public String search(@RequestParam("name") String name,Model model )
       { 
    	   List<Employee> emp = empService.serachEmp(name);
    	   model.addAttribute("Employee", emp);
    	 
    	   //System.out.println(emp);
		return "index";
    	   
       }
}
