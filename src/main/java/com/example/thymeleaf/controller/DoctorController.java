package com.example.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DoctorController {

    @RequestMapping("/doctor")
    public String doctor(Model model,
    		@RequestParam(value = "name2", required = false, defaultValue = "John Smith") String doctorname,
    		@RequestParam(value = "number2", required = false, defaultValue = "0") String doctornumber)
    		{
    	
    		model.addAttribute("doctorname", doctorname);
    		model.addAttribute("doctornumber", doctornumber);
    	
    	
        return "doctor";
    		}
}
