package br.com.C317.CovidNumbers.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.C317.CovidNumbers.model.Numeros;

@Service
public class NumerosService {

	
	private static List<Numeros> numeros;
	
	
	public List<Numeros> numerosService() {
		numeros = new ArrayList<Numeros>();
		
		Numeros numero09 = new Numeros();
		numero09.setMes("Setembro");
		numero09.setNumeroInfectados(80);
		numero09.setNumeroObito(1);
		numero09.setNumeroRecuperados(79);
		numeros.add(numero09);
		
		Numeros numero10 = new Numeros();
		numero10.setMes("Outubro");
		numero10.setNumeroInfectados(25);
		numero10.setNumeroObito(2);
		numero10.setNumeroRecuperados(23);
		numeros.add(numero10);
		
		Numeros numero11 = new Numeros();
		numero11.setMes("Novembro");
		numero11.setNumeroInfectados(12);
		numero11.setNumeroObito(3);
		numero11.setNumeroRecuperados(15);
		numeros.add(numero11);
		
		Numeros numero12 = new Numeros();
		numero12.setMes("Dezembro");
		numero12.setNumeroInfectados(111);
		numero12.setNumeroObito(10);
		numero12.setNumeroRecuperados(101);
		numeros.add(numero12);
		
		Numeros numero01 = new Numeros();
		numero01.setMes("Janeiro");
		numero01.setNumeroInfectados(100);
		numero01.setNumeroObito(5);
		numero01.setNumeroRecuperados(95);
		numeros.add(numero01);	
		
		Numeros numero02 = new Numeros();
		numero02.setMes("Fevereiro");
		numero02.setNumeroInfectados(55);
		numero02.setNumeroObito(1);
		numero02.setNumeroRecuperados(54);
		numeros.add(numero02);
		
		Numeros numero03 = new Numeros();
		numero03.setMes("Março");
		numero03.setNumeroInfectados(28);
		numero03.setNumeroObito(0);
		numero03.setNumeroRecuperados(28);
		numeros.add(numero03);
		
		Numeros numero04 = new Numeros();
		numero04.setMes("Abril");
		numero04.setNumeroInfectados(112);
		numero04.setNumeroObito(7);
		numero04.setNumeroRecuperados(105);
		numeros.add(numero04);
		
		return numeros;
	}
	
}
