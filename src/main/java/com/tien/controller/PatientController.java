package com.tien.controller;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import medical.config.AppConfig;
import medical.entity.Patient;
import medical.service.PatientService;

@Controller
public class PatientController {
	@RequestMapping(value="/updatePatient.do",method=RequestMethod.POST)
public String updatePatient(Patient patient,@RequestParam String username,
			@RequestParam String phonenumber,
			@RequestParam String email,
			@RequestParam String quequan,
			@RequestParam String gioitinh,
			@RequestParam String ngaysinh,
			@RequestParam String cmnd,
			ModelMap map) {
		AbstractApplicationContext context= new AnnotationConfigApplicationContext(AppConfig.class);
		PatientService patientService=(PatientService) context.getBean("patientService");
		patient.setTen(username);
		patient.setSodienthoai(phonenumber);
		patient.setEmail(email);
		patient.setQuequan(quequan);
		patient.setGioitinh(gioitinh);
		patient.setNgaysinh(ngaysinh);
		patient.setCmnd(cmnd);
		patientService.insertPatient(patient);
		map.addAttribute("smg","Cập nhật thành công");
	
	
	return "userpage";
}
}
