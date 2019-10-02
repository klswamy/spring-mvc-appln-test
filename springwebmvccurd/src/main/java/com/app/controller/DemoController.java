package com.app.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.app.model.Employee;
import com.app.service.EmpService;

@Controller

public class DemoController {
	@Autowired
	private EmpService service;
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
				dateFormat.setLenient(false);
				binder.registerCustomEditor(Date.class, new CustomDateEditor(
						dateFormat, false));
	}
	
@RequestMapping(value="/")
 
	public String demo() {
		return "index";
	}
	@RequestMapping(value="/save")
	public String showReg() {
		return "register";
	}
	@RequestMapping(value="/reg")
	public ModelAndView save(@ModelAttribute Employee employee) {
		String str=service.save(employee);
		
		return new ModelAndView("register","msg",str);	

	}
	@RequestMapping(value="/edit")
	public String showUpdate(@RequestParam("empId")int empId,ModelMap map) {
		Employee emp=service.update(empId);
		map.addAttribute("emp", emp);
		return "update";
	}
	@RequestMapping(value="getAll")
	public String getAll(ModelMap map) {
		List<Employee> list=service.getAll();
		map.addAttribute("list", list);
		return "all";
	}
	
	@RequestMapping(value="/delete")
	public String delete(@RequestParam("empId")int empId) {
	service.delete(empId);
	return "redirect:getAll";
	}
	@RequestMapping(value="/Update")
	public String updateEmp(@ModelAttribute("employee") Employee emp,ModelMap map) {
		service.updateEmp(emp);
		return "redirect:/getAll";
	}
}
