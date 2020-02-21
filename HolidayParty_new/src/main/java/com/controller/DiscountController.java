package com.controller;

import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.model.DiscountBean;

@Controller
public class DiscountController {

	@RequestMapping(value = "/indexPage", method = RequestMethod.GET)
	public String home(@ModelAttribute("discount") DiscountBean db) {

		return "discountPriceCalculation";
	}

	@ModelAttribute("productList")
	public Map<String, String> buildState() {
		Map<String, String> map = new HashMap<>();
		map.put("Electronics", "Electronics");
		map.put("Toys", "Toys");
		map.put("Apparels", "Apparels");
		return map;
	}
	@RequestMapping(value = "/result", method = RequestMethod.GET)
	public String result(@Valid @ModelAttribute("discount") DiscountBean db,BindingResult result,ModelMap m) {
		if(result.hasErrors()) {
			return "discountPriceCalculation";
		}
		DiscountBean d = new DiscountBean();
		double ans = d.calculateFinal(db);
		m.addAttribute("ans",ans);
		return "thankyou";
	}

}
