package jp.co.sample.controller;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.sample.domain.Employee;
import jp.co.sample.form.UpdateEmployeeForm;
import jp.co.sample.service.EmployeeService;

@Controller
@Validated
@RequestMapping("/employee")
public class EmployeeController{
	@Autowired
	private EmployeeService service;
	
	@ModelAttribute
	public UpdateEmployeeForm setUpUpdateEmployeeForm() {
		return new UpdateEmployeeForm(); 
	}
	
	@RequestMapping("/showList")
	public String showList(Model model) {
		List<Employee> employeeList=service.showList();
		model.addAttribute("employeeList", employeeList);
		return "employee/list";
	}
	
	@RequestMapping("/showDetail")
	public String showDetail(String id,Model model,UpdateEmployeeForm form) {
		Employee employee=service.showDetail(Integer.parseInt(id));
		BeanUtils.copyProperties(employee, form);
		model.addAttribute("updateEmployeeForm", form);
		return "employee/detail";
	}
	
	@RequestMapping("/update")
	public String update(@Validated UpdateEmployeeForm form,BindingResult result,Model model) {
		if(result.hasErrors()) {
			Employee employee=service.showDetail(form.getId());
			BeanUtils.copyProperties(employee, form);
			form.setDependentsCount(form.getDependentsCount());
			model.addAttribute("updateEmployeeForm", form);
			return "employee/detail";
		}
		Employee employee=service.showDetail(form.getId());
		employee.setDependentsCount(Integer.parseInt(form.getDependentsCount()));
		service.update(employee);
		return "redirect:/employee/showList";
	}
}
