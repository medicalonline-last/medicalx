package com.tien.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller

public class HomeController {
	@RequestMapping("/index") //đánh dấu class dưới nó đóng vai trò như 1 servlet xử lý các url login.html
	public String index() {
		return "index";
	}
	@RequestMapping("/userpage") //đánh dấu class dưới nó đóng vai trò như 1 servlet xử lý các url login.html
	public String userpage() {
		return "userpage";
	}
	@RequestMapping("/store")
	public String store() {
		return "store";
	}
	@RequestMapping("/billcontent")
	public String billcontent() {
		return "billcontent";
	}
	@RequestMapping("/billcontent_info")
	public String billcontent_info() {
		return "billcontent_info";
	}
	@RequestMapping("/medicalonline")
	public String medicalonline() {
		return "medicalonline";
	}
	@RequestMapping("/schedule")
	public String schedule() {
		return "schedule";
	}
	@RequestMapping("/Admin-ManageUser")
	public String AdminManageUser() {
		return "admin/Admin-ManageUser";
	}
	@RequestMapping("/Admin-ManageProduct")
	public String AdminManageProduct() {
		return "admin/Admin-ManageProduct";
	}
	@RequestMapping("/Admin-inbox")
	public String AdminInbox() {
		return "admin/Admin-inbox";
	}
	@RequestMapping("/Admin-Work")
	public String AdminWork() {
		return "admin/Admin-Work";
	}
	@RequestMapping("/Admin-ManageBill")
	public String AdminManageBill() {
		return "admin/Admin-ManageBill";
	}

}
