package com.ipartek.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MenuController {
	
	@RequestMapping("/menu_ventas")
	public String menuVentas()
	{
		return "/home";
		
	}
	
	@RequestMapping("/menu_alquiler")
	public String menuAlquiler()
	{
		return "/alquiler";
		
	}

}
