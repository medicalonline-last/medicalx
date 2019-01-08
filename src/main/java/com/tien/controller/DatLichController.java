package com.tien.controller;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import medical.config.AppConfig;
import medical.entity.DatLich;
import medical.service.DatLichService;
import medical.service.DoctorService;

@Controller
public class DatLichController {
	AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
	DoctorService doctorService = (DoctorService) context.getBean("doctorService");
	DatLichService datLichService = (DatLichService) context.getBean("datLichService");
	@RequestMapping(value = { "/medicalonline" }, method = RequestMethod.GET)
	public String view(ModelMap model) {		
		List<String> listPB = doctorService.getChuyenmonDoctor();
		// add phong ban
		List<String> listBS = doctorService.getTenDoctor();
		model.addAttribute("listBS", listBS);
		model.addAttribute("listPB", listPB);
		return "medicalonline";
	}
<<<<<<< HEAD
		/*@RequestMapping(value = { "/medicalonline" }, method = RequestMethod.POST)
		public String datlich() {
			return null;
		}*/
=======
	
	@RequestMapping(value = { "/medicalonline" }, method = RequestMethod.POST)
	public String datlich(DatLich datLich, @RequestParam String ngay, @RequestParam String khunggio, @RequestParam String phongban, @RequestParam String bacsi) throws Exception {
		Date date = new SimpleDateFormat("MM/dd/yyyy").parse(ngay);
		return null;
	}
>>>>>>> e1f41e46cba12ace9b003f2f8d03ea1e6bde8142
}
