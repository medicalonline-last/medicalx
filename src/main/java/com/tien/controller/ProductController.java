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
	 @RequestMapping(value = {"/addProduct"}, method=RequestMethod.GET)
	public String showListOfProduct(ModelMap model) {
		 DrugService drugService = (DrugService) context.getBean("drugService");
		List<Drug> list = drugService.getAllThuoc();
    	model.addAttribute("productList",list);
		return "/admin/Admin-ManageProduct";
	}   
    @RequestMapping(value = "/addProduct.do", method=RequestMethod.POST)
	public String addThuoc(@RequestParam String ten,@RequestParam String loaihinh, @RequestParam String thongtin, @RequestParam String giatien,  ModelMap map ) throws Exception {
    	
        DrugService drugService = (DrugService) context.getBean("drugService");
        Double giatienx=Double.parseDouble(giatien);
        Drug drug=new Drug(ten, thongtin, giatienx,loaihinh);    	
    	drugService.insertThuoc(drug);
    	map.put("msg", "Thêm thành công!!");
		return "redirect:addProduct";
	}
    
 /*   @RequestMapping("/updateProduct")
	public String editThuoc(Drug drug) {
		if(drug.getId() != null) {
			drugService.updateThuoc(drug);
		}
		return MANAGEPRODUCT;
	}*/
    
  /*  @RequestMapping("/deleteProduct")
	public String deleteThuoc(@RequestParam("thuocId") int thuocId) {
		drugService.deleteThuoc(thuocId);
		return MANAGEPRODUCT;
	}*/
}
