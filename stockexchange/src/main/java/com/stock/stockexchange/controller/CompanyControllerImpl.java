package com.stock.stockexchange.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.stock.stockexchange.model.Company;
import com.stock.stockexchange.model.Sector;
import com.stock.stockexchange.service.CompanyService;
import com.stock.stockexchange.service.SectorService;



@Controller
public class CompanyControllerImpl {

	
	@Autowired
	private CompanyService companyService;
	
	
	@Autowired
	private SectorService sectorService;
	
/*
	@RequestMapping(value = "/login", method = RequestMethod.GET)

	public ModelAndView home(HttpServletRequest request,Model model)
	{
		 model.addAttribute("login", new User());
		return new ModelAndView("admin-login");
	}

	
	
	@RequestMapping(value = "/loginProcess", method = RequestMethod.POST)

	public String login(@RequestParam("id") String userName, @RequestParam("password") String password,
			ModelMap map, HttpServletRequest request)
	{
		User users = new User();
		
		Boolean check = false;
		
		
			int user = Integer.parseInt(userName);
			users.setId(user);
			System.out.println(users);
			
			users.setPassword(password);
			System.out.println(password);

			String userss = Integer.toString(user);
			try
			{
				check = companyService.validateUser(users);
			} 
			catch (SQLException e)
			{
				System.out.println(e);
			}

			if (check == true)
			{
				
				
				return "admin-landing-page";

			}

			else if (check == false)
			{
				
				return "redirect:/login";
			} 
			
		return "redirect:/login";

	}
	
	
	public Company insertCompany(Company company) throws SQLException {
		companyService.insertCompany(company);
		return company;	
	}
*/


	@RequestMapping(path="/companyList")
	public ModelAndView getCompanyList() throws SQLException, ClassNotFoundException {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("companyList");
		mv.addObject("companyList",companyService.getCompanyList());
		return mv;
	}
	
	
	@RequestMapping(value = "/addCompany", method = RequestMethod.GET)
	public String getCompanyForm(ModelMap model) throws SQLException {
		System.out.println("add company");
		ModelAndView mav = null;
		Company company=new Company();
		List<Sector> sectorList=null;
		sectorList = sectorService.fetchSector();
		System.out.println("hiiii "+sectorService.fetchSector());
		model.addAttribute("sectorList",sectorList);
		model.addAttribute("company", company);
		return "companyForm";
		
		

		
	}
	
	@RequestMapping(value = "/addCompany", method = RequestMethod.POST)
	public String formHandler(@Valid @ModelAttribute("company") Company company,BindingResult result, 
			 Model model) throws SQLException {
		
		
		
		System.out.println(company);
		if(result.hasErrors()){
		System.out.println("eror");
			model.addAttribute("company",company);
			return "companyForm";
		}
		companyService.insertCompany(company);
	
		 return "CompanyView";
	}
	
	/*
	
	
	@RequestMapping(value = "/addUser", method = RequestMethod.GET)
	public String getUserForm(ModelMap model) {
		System.out.println("add user");
		User user = new User();
		
		model.addAttribute("user", user);
		return "registration";
		
		

		
	}
	
	@RequestMapping(value = "/addUserProcess", method = RequestMethod.POST)
	public String formHandler(@Valid @ModelAttribute("user") User user,BindingResult result,
			 Model model) throws SQLException {
		
		
		
		System.out.println(user);
		
		if(result.hasErrors()){
			System.out.println("eror");
				model.addAttribute("user",user);
				return "registration";
			}
		
		companyService.insertUser(user);
	
		 return "redirect:/login";
	}
*/
	
	
}

