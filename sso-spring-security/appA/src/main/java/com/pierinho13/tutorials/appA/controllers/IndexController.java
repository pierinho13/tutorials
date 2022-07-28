package com.pierinho13.tutorials.appA.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {

	@ResponseBody
	@RequestMapping(value = {"", "/"})
	public String getIndex() {
		return "Index success";
	}
	
	@ResponseBody
	@RequestMapping(value = {"/secured-url"})
	public String getSecuredUrl() {
		return "Secured url success";
	}
	
	@ResponseBody
	@RequestMapping(value = {"/free-url"})
	public String getFreeUrl() {
		return "Free url success";
	}
}
