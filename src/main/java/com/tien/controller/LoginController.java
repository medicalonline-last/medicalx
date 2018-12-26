package com.tien.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//nơi để các file controller
@Controller //đánh dấu controller
public class LoginController {
	@RequestMapping("/")		
	public String ViewTrangchu() {
		return "login";
	}
	
}
