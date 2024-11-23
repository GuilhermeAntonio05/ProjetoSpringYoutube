package com.PaginaCursoSpringBoot.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EventoControler {
	
	@RequestMapping(path = "/cadastrarEvento")
	public String form() {
		return "formEvento.html";
	}
}
