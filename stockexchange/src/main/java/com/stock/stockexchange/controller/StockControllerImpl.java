package com.stock.stockexchange.controller;

import java.sql.SQLException;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.stock.stockexchange.model.Stock;
import com.stock.stockexchange.service.StockService;

@Controller
public class StockControllerImpl {

	@Autowired
	private StockService stockService;
	
	@RequestMapping(value = "/addStock", method = RequestMethod.GET)
	public String getStockForm(ModelMap model) {
		System.out.println("add stock");
		Stock stock=new Stock();
		
		model.addAttribute("stock", stock);
		return "addStock";
		
		

		
	}
	
	@RequestMapping(value = "/addStock", method = RequestMethod.POST)
	public String processStockForm(@Valid @ModelAttribute("stock") Stock stock, BindingResult result,
			 Model model) throws SQLException {
		
		
		
		System.out.println(stock);
		if(result.hasErrors()){
			System.out.println("eror");
				model.addAttribute("stock",stock);
				return "addStock";
			}
		stockService.insertStock(stock);
	
		 return "StockView";
	}
	
	@RequestMapping(path="/stockList")
	public ModelAndView getStockList() throws SQLException {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("stockList");
		mv.addObject("stockList",stockService.getStockList());
		return mv;
	}
}
