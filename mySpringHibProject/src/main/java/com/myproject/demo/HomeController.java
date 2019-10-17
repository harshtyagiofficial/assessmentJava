package com.myproject.demo;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.myproject.dao.ProjectDao;
import com.myproject.model.ProjectModelClass;

@Controller
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@RequestMapping(value = "/")
	public String home() {

//		Write the main landing page
		return "index";
	}

	@Autowired
	ProjectDao projectdao;

	@RequestMapping(value = "/saveShoe")
	public String saveShoeDetail() {

		return "home";
	}

	@RequestMapping(value = "/saveShoes")
	public String saveShoeDetails(@ModelAttribute ProjectModelClass projectmodelclass) {

		projectdao.saveShoes(projectmodelclass);
		return "index";
	}

	@RequestMapping("/displaySize")
	public String ListProductsBySizes() {

		return "displayByBrand";

	}

	@RequestMapping("/displayByBrand")
	public String ListProductsBySize(Model model, @RequestParam("size") int sizeno) {

		ArrayList<ProjectModelClass> pms = projectdao.getShoesBySize(sizeno);

		model.addAttribute("products", pms);
		return "displayBySize";

	}

	@RequestMapping("/deleteId")
	public String deleteByIds() {

		return "delete";

	}

	@RequestMapping("/delete")
	public String deleteById(Model model, @RequestParam("serialNumber") int id) {

		projectdao.deleteById(id);

		return "deleteById";

	}
	
	@RequestMapping(value="/retriveAll")
	public String restListDisp(Model model) {
				
		ArrayList<ProjectModelClass> pmc = projectdao.getList();
		model.addAttribute("products", pmc);
		return "displayAll";
	}
	
	@RequestMapping(value="/update")
	public String update() {
		return "update";
	}
	

}
