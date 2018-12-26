package com.tien.controller;


import java.io.IOException;
import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import medical.config.AppConfig;
import medical.entity.User;
import medical.service.UserService;

@Controller
public class UserController {
	@RequestMapping(value="/register.do", method=RequestMethod.POST)
	public String addUser(User user, @RequestParam String username, @RequestParam String password,@RequestParam String repeatpassword,ModelMap map) throws IOException {
			user.setUsername(username);
			user.setPassword(password);
			User user1=new User(username);
			AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		        UserService userService = (UserService) context.getBean("userService");
		       int checkuser= userService.selectUserByname(user1);
			
			if (password.equals(repeatpassword)==true&&checkuser==0) {				
		        userService.insertUser(user);
		        map.put("msg", "Đăng kí thành công");
		        return "login";
			}
			else if  (checkuser==1) {
				map.put("msg", "Tài khoản đã tồn lại");
				return"login";
			}
				else {
					map.put("msg", "Mật khẩu nhập lại không đúng");
					return "login";
				}
		 		  		
	}
	@RequestMapping(value="/login.do", method=RequestMethod.POST)
	public String loginUser(User user, @RequestParam String username, @RequestParam String password,ModelMap map) throws IOException {
			user.setUsername(username);
			user.setPassword(password);		
			
			  AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		      UserService userService = (UserService) context.getBean("userService");
		      User user1= userService.selectinfo(username);		      
		       int check= userService.selectUser(user);
		       if (check==1&&user1.getIdphanquyen()==2) {
		    	   map.put("msg", username);
				return"admin/Admin-home";				
			}
		       else if(check==1) {
		    	   map.put("msg", username);
		    	   return"index";
		       }
		       else {
		    	   map.put("msg", "Nhập sai mật khẩu hoặc password");
				return "login";
			}
		 		  
	
	}
}
