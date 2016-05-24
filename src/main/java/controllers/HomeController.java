/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.util.ArrayList;
import java.util.List;
import model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Paulo Henrique
 */
@Controller
public class HomeController {
    
    private List<Employee> employees=new ArrayList<Employee>();
 
 @RequestMapping(value="/")
 public String loadHomePage(Model model){
  
 model.addAttribute("employees", employees); 
 return "index";
 }
  
  
 @RequestMapping(value="/addEmployee",method=RequestMethod.POST)
 public String addEmployee(@ModelAttribute("employee")Employee employee, Model model){
  
 employees.add(employee);
  
 return "redirect:/";
 }
    
    
}
