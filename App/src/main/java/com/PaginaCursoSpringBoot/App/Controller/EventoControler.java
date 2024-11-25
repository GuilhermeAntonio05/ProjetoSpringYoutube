package com.PaginaCursoSpringBoot.App.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EventoControler {
	
	@GetMapping("/cadastrarEvento")
	public String form() {
		return "formEvento.html";
	}
}
