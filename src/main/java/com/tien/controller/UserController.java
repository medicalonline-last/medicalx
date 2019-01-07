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

import medical.config.AppConfig;
import medical.entity.User;
import medical.service.UserService;

@Controller
public class UserController {
	public static  User user2;
	AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
	@RequestMapping(value="addUser.do", method = RequestMethod.POST)
	public String addminAddUser(User user, @RequestParam String username, @RequestParam String password, @RequestParam String repeatpassword, @RequestParam String loainguoidung, ModelMap map) throws IOException {
		user.setUsername(username);
		user.setPassword(password);
		Integer phanquyen;
		if (loainguoidung.equals("Bá»‡nh NhÃ¢n")) {
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
	        map.put("msg", "ÄÄƒng kÃ­ thÃ nh cÃ´ng");
	        return "admin/Admin-ManageUser";
		}
		else if  (checkuser==1) {
			map.put("msg", "TÃ i khoáº£n Ä‘Ã£ tá»“n láº¡i");
			return "admin/Admin-ManageUser";
		}
			else {
				map.put("msg", "Máº­t kháº©u nháº­p láº¡i khÃ´ng Ä‘Ãºng");
				return "admin/Admin-ManageUser";
			}
	 		  
		
	}
	 @RequestMapping(value = "/addUser.do", method=RequestMethod.GET)
		public String showListOfProduct(ModelMap model) {
			UserService userService = (UserService) context.getBean("userService");
			List<User> list = userService.selectAllUser();
	    	model.addAttribute("userList",list);
			return "/admin/Admin-ManageProduct";
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
		        map.put("msg", "ÄÄƒng kÃ­ thÃ nh cÃ´ng");
		        return "login";
			}
			else if  (checkuser==1) {
				map.put("msg", "TÃ i khoáº£n Ä‘Ã£ tá»“n láº¡i");
				return"login";
			}
				else {
					map.put("msg", "Máº­t kháº©u nháº­p láº¡i khÃ´ng Ä‘Ãºng");
					return "login";
				}
		 		  		
	}
	@RequestMapping(value="/login.do", method=RequestMethod.POST)
	public String loginUser(HttpServletRequest request,User user,@RequestParam String username, @RequestParam String password,ModelMap map) throws IOException {
			user.setUsername(username);
			user.setPassword(password);
			HttpSession session = request.getSession();
			String userpost =request.getParameter("username");
			session.setAttribute("usernamepost",userpost );
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
		    	   map.put("msg", "Nháº­p sai máº­t kháº©u hoáº·c password");
				return "login";
			}
		 		  
	
	}

}
