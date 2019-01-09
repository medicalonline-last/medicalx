package com.tien.controller;


import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import medical.config.AppConfig;
import medical.entity.User;
import medical.service.UserService;

@Controller
@SessionAttributes("slogin")
public class UserController {	
	AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
	@RequestMapping(value="/addUser.do", method = RequestMethod.POST)
	public String addminAddUser(User user, @RequestParam String username, @RequestParam String password, @RequestParam String repeatpassword, @RequestParam String loainguoidung, ModelMap map) throws IOException {
		user.setUsername(username);
		user.setPassword(password);
		int phanquyen;
		if (loainguoidung=="Bệnh Nhân") {
			phanquyen = 3;
		} else {
			phanquyen = 1;
		}
		user.setIdphanquyen(phanquyen);
		User user1=new User(username);
	        UserService userService = (UserService) context.getBean("userService");
	       int checkuser= userService.selectUserByname(user1);
		
		if (password.equals(repeatpassword)==true&&checkuser==0) {				
	        userService.insertUser(user);
	        map.put("msg", "Đăng kí thành công");
	        return "redirect:Admin-ManageUser";
		}
		else if  (checkuser==1) {
			map.put("msg", "Tài khoản đã tồn lại");
			return "redirect:Admin-ManageUser";
		}
			else {
				map.put("msg", "Mật khẩu nhập lại không đúng");
				return "redirect:Admin-ManageUser";
			}
	 		  
		
	}
	 @RequestMapping(value = "/Admin-ManageUser", method=RequestMethod.GET)
		public String showListOfProduct(ModelMap model) {
			UserService userService = (UserService) context.getBean("userService");
			List<User> list = userService.selectAllUser();
	    	model.addAttribute("userList",list);
			return "/admin/Admin-ManageUser";
	 }
	
	@RequestMapping(value="/register.do", method=RequestMethod.POST)
	public String addUser(User user, @RequestParam String username, @RequestParam String password,@RequestParam String repeatpassword,ModelMap map) throws IOException {
			user.setUsername(username);
			user.setPassword(password);
			user.setIdphanquyen(3);
			User user1=new User(username);
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
	public ModelAndView loginUser(ModelAndView modelandview,User user,@RequestParam String username, @RequestParam String password,ModelMap map) throws IOException {
			user.setUsername(username);
			user.setPassword(password);		
		      UserService userService = (UserService) context.getBean("userService");
		      User user1= userService.selectinfo(username);		      
		       int check= userService.selectUser(user);
		       if (check==1&&user1.getIdphanquyen()==2) {
		    	   map.put("msg", username);	
		    	   modelandview.addObject("slogin",user1.getUsername());
		    	   modelandview.setViewName("admin/Admin-home");
		    	   return modelandview;				
			}
		       else if(check==1) {
		    	   map.put("msg", username);
		    	   modelandview.addObject("slogin",user1.getUsername());
		    	   modelandview.setViewName("index");
		    	   return modelandview;
		       }
		       else {
		    	   map.put("msg", "Nhập sai mật khẩu hoặc password");
		    	   modelandview.setViewName("login");
		    	   return modelandview;
			}
		 		  
	
	}

}