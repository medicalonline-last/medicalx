package com.tien.controller;


import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import medical.config.AppConfig;
import medical.entity.Drug;
import medical.service.DrugService;


@Controller
public class ProductController {	
	AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
	 @RequestMapping(value = {"/Admin-ManageProduct"}, method=RequestMethod.GET)
	public String showListOfProductforAdmin(ModelMap model) {
		 DrugService drugService = (DrugService) context.getBean("drugService");
		List<Drug> list = drugService.getAllThuoc();
    	model.addAttribute("productList",list);
		return "/admin/Admin-ManageProduct";
	}   
	 @RequestMapping(value = {"/store"}, method=RequestMethod.GET)
		public String showListOfProductforUser(ModelMap model) {
			 DrugService drugService = (DrugService) context.getBean("drugService");
			List<Drug> list = drugService.getAllThuoc();
	    	model.addAttribute("productListUser",list);
			return "store";
		}   
    @RequestMapping(value = "/addProduct.do", method=RequestMethod.POST)
	public String addThuoc(@RequestParam String ten,@RequestParam String loaihinh, @RequestParam String thongtin, @RequestParam String giatien, @RequestParam byte[] anh,  ModelMap map ) throws Exception {
    	
        DrugService drugService = (DrugService) context.getBean("drugService");
        Double giatienx=Double.parseDouble(giatien);
        Drug drug=new Drug(ten, thongtin, giatienx,loaihinh, anh);    	
    	drugService.insertThuoc(drug);
    	map.put("msg", "Thêm thành công!!");
		return "redirect:Admin-ManageProduct";
	}
    
 /*   @RequestMapping("/updateProduct")
	public String editThuoc(Drug drug) {
		if(drug.getId() != null) {
			drugService.updateThuoc(drug);
		}
		return MANAGEPRODUCT;
	}*/
    
    @RequestMapping("/deleteProduct")
	public String deleteThuoc(ModelMap model, @RequestParam("thuocId") int thuocId) {
    	DrugService drugService = (DrugService) context.getBean("drugService");
		drugService.deleteThuoc(thuocId);
		return "redirect:Admin-ManageProduct.html";
	}
}
