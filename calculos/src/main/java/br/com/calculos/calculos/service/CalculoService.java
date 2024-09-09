package br.com.calculos.calculos.service;

import org.springframework.stereotype.Service;

import br.com.calculos.calculos.entity.Entrada;
import br.com.calculos.calculos.entity.Resultado;

@Service
public class CalculoService {
	
	public Resultado somar(Entrada entrada) {
		
		Resultado resultado = new Resultado();
		Integer soma = 0;
		
		if (entrada.getLista() != null)
			for(int i=0; i < entrada.getLista().size(); i++) {
				soma += entrada.getLista().get(i);
			}
		
		resultado.setSoma(soma);
		
		
		return resultado;
		
	}

}
