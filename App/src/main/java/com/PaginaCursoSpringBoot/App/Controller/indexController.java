package com.PaginaCursoSpringBoot.App.Controller;

import org.springframework.web.bind.annotation.RequestMapping;

public class indexController {
	
	@RequestMapping
	public String index() {
		return "index";
	}
}
