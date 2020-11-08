package com.spring.core;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.annotation.RequestScope;

@Controller
public class controlador {
    //envio de datos desde el formulario
	@RequestMapping(value = "/index",method = RequestMethod.GET)
	public String index()
	{
		return "index";
	}
	//respuesta del fromulario los datos son recibidos
	@RequestMapping(value="/respuesta",method = RequestMethod.GET)
	public String respuesta() {
		return "respuesta";
	}
}
