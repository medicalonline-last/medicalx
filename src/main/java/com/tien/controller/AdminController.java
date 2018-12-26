package com.tien.controller;

import java.io.IOException;
import java.util.List;

import org.omg.CORBA.PUBLIC_MEMBER;
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
public class AdminController {
	@RequestMapping(value="/adduser.do", method=RequestMethod.POST)
	public String addUser(User user, @RequestParam String idphanquyen,
			@RequestParam String username,@RequestParam String password,
			@RequestParam String repeatpassword,ModelMap map) throws IOException {
			user.setUsername(username);
			user.setPassword(password);			
			user.setIdphanquyen(Integer.parseInt(idphanquyen));
			User user1=new User(username);
			AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		        UserService userService = (UserService) context.getBean("userService");
		       int checkuser= userService.selectUserByname(user1);			
			if (password.equals(repeatpassword)==true&&checkuser==0) {				
		        userService.insertUser(user);
		        map.put("msg", "Đăng kí thành công");
		        return "/admin/Admin-ManageUser";
			}
			else if  (checkuser==1) {
				map.put("msg", "Tài khoản đã tồn lại");
				return"/admin/Admin-ManageUser";
			}
				else {
					map.put("msg", "Mật khẩu nhập lại không đúng");
					return "admin/Admin-ManageUser";
				} 
		 		  		
	}
/*	@RequestMapping(value="/adduser.do", method=RequestMethod.GET)
	public String Load(ModelMap map) throws IOException {
			List<User> list;
			AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		        UserService userService = (UserService) context.getBean("userService");
		       list = userService.selectAllUser();			
		       return "admin/Admin-ManageUser";
		 		  		
	}
*/
}
