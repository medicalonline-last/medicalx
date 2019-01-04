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
	private static final String MANAGEPRODUCT = "admin/Admin-ManageProduct";
	AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    DrugService drugService = (DrugService) context.getBean("drugService");
    
    @RequestMapping(method=RequestMethod.GET)
	public String showListOfProduct(Model model) {
		List<Drug> list = drugService.getAllThuoc();
    	model.addAttribute("productList",list);
		return MANAGEPRODUCT;
	}
    
    @RequestMapping(value = "/addProduct", method=RequestMethod.POST)
	public String addThuoc(Drug drug, @RequestParam String ten, @RequestParam String thongtin, @RequestParam double giatien, @RequestParam byte[] anh, ModelMap map ) throws Exception {
		drug.setTen(ten); drug.setThongtin(thongtin); drug.setGiatien(giatien); drug.setAnh(anh);
    	drugService.insertThuoc(drug);
    	map.put("msg", "Thêm thành công!!");
		return MANAGEPRODUCT;
	}
    
    @RequestMapping("/updateProduct")
	public String editThuoc(Drug drug) {
		if(drug.getId() != null) {
			drugService.updateThuoc(drug);
		}
		return MANAGEPRODUCT;
	}
    
    @RequestMapping("/deleteProduct")
	public String deleteThuoc(@RequestParam("thuocId") int thuocId) {
		drugService.deleteThuoc(thuocId);
		return MANAGEPRODUCT;
	}
}
