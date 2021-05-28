package br.com.C317.CovidNumbers.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.C317.CovidNumbers.model.Numeros;
import br.com.C317.CovidNumbers.service.NumerosService;

@RestController
@RequestMapping("/numeros")
public class NumerosController {

	@Autowired
	private NumerosService service;
	
	
	@GetMapping
	public List<Numeros> numerosPorMes(){
		return service.numerosService();
	}
	
}
