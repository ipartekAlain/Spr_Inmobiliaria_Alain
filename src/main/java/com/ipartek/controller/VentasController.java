package com.ipartek.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.ipartek.service.IViviendaService;

@Controller
public class VentasController {
	
	@Autowired
	private IViviendaService viviendaServ;

}
