package com.tien.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import medical.config.AppConfig;
import medical.service.DoctorService;
import medical.service.UserService;

@Controller
public class DatLichController {
	AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
	@RequestMapping(value={"/medicalonline"}, method = RequestMethod.GET)
	  public String view(ModelMap model) {
		DoctorService doctorService=(DoctorService) context.getBean("doctorService");
		List<String> listPB=doctorService.getChuyenmonDoctor();
	    /*List<String> listBS = new ArrayList<String>();*/	  
	    // add phong ban
	    List<String> listBS = doctorService.getTenDoctor();	      
	    model.addAttribute("listBS", listBS);	
	    model.addAttribute("listPB", listPB);	
	    return "medicalonline";
	  }
}
