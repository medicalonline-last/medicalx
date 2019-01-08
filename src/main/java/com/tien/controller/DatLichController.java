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
import medical.entity.Doctor;
import medical.entity.User;
import medical.service.DatLichService;
import medical.service.DoctorService;
import medical.service.UserService;

@Controller
public class DatLichController {
	AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
	DoctorService doctorService = (DoctorService) context.getBean("doctorService");
	DatLichService datLichService = (DatLichService) context.getBean("datLichService");
	UserService userService=(UserService) context.getBean("userService");
	@RequestMapping(value = { "/medicalonline" }, method = RequestMethod.GET)
	public String view(ModelMap model) {		
		List<String> listPB = doctorService.getChuyenmonDoctor();
		// add phong ban
		List<String> listBS = doctorService.getTenDoctor();
		model.addAttribute("listBS", listBS);
		model.addAttribute("listPB", listPB);
		return "medicalonline";
	}

	
	@RequestMapping(value = { "/medicalonline" }, method = RequestMethod.POST)
	public String datlich(ModelMap modelMap , DatLich datLich,@RequestParam String usernow, @RequestParam String date_t, @RequestParam String khunggio,@RequestParam String ten){
		/* SimpleDateFormat formatter = new SimpleDateFormat("yyy/MM/dd");
		 String strDate = formatter.format(date_t)*/;
		 Doctor doctor=doctorService.getDoctorbyName(ten);
		 /*Doctor doctor=doctorService.getDoctorbyID(idBs);*/
		 User user=userService.selectinfo(usernow);		 
		 
		/* datLich=new DatLich(date_t,khunggio,doctor.getPhonglamviec(), user.getId(), doctor.getId());*/
		 datLich=new DatLich(date_t,khunggio,doctor.getPhonglamviec(), user.getId(), doctor.getId());		 
		 datLichService.insertDatLich(datLich);
		 modelMap.addAttribute("msg","Đặt lịch thành công");
		return "medicalonline";
	}

}
