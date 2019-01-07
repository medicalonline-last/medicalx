package com.tien.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DatLichController {
	@RequestMapping(value={"/medicalonline"}, method = RequestMethod.GET)
	  public String view(ModelMap model) {	  
	    List<String> listBS = new ArrayList<String>();
	    listBS.add("Developer");
	    listBS.add("Designer");
	    listBS.add("Tester");
	    listBS.add("QA");
	    // add phong ban
	    List<String> listPB = new ArrayList<String>();
	    listPB.add("Developer");
	    listPB.add("Designer");
	    listPB.add("Tester");
	    listPB.add("QA");
	    
	    model.addAttribute("listBS", listBS);	
	    model.addAttribute("listPB", listPB);	
	    return "medicalonline";
	  }
}
