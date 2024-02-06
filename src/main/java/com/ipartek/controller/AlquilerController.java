package com.ipartek.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/** 
 * @author Alain
 */
import com.ipartek.service.IViviendaService;

@Controller
public class AlquilerController {

	 @Autowired
	 private IViviendaService viviendaServ;
	
}
