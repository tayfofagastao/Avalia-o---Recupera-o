package br.com.calculos.calculos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.calculos.calculos.entity.Entrada;
import br.com.calculos.calculos.entity.Resultado;
import br.com.calculo.calculos.service.CalculosService;


@RestController
@RequestMapping("/calculos")
public class CalculosController {
	
	@Autowired
	private CalculosService calculosService;
	
	@GetMapping
	public ResponseEntity<Resultado> somar(Entrada entrada){
		try {
			
			Resultado resultado = this.calculosService.somar(entrada);
			return new ResponseEntity<Resultado>(resultado, HttpStatus.OK);
			
		}catch (Exception e) {
			
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		
		}
		return null;
	}

}