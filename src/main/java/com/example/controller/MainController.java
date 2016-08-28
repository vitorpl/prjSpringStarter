package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/inicio")
public class MainController {

	// Acessar em: http://localhost:8080/inicio
	@RequestMapping
	public String pesquisa() {
		return "/main/mainPage";
	}
}
