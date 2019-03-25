package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BaseController {

	@RequestMapping("/index")
    public String hello(ModelMap model) {
		model.addAttribute("main","这个是首页:main");
		model.addAttribute("index","这个是首页:index");
		return "/base/index";
    }
	
}
