package com.PaginaCursoSpringBoot.Controller;

import org.springframework.web.bind.annotation.RequestMapping;

public class indexController {
	@RequestMapping
	public String index() {
		return "index";
	}
}
