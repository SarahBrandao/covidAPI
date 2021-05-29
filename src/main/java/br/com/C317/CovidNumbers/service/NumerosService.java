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
		
		Numeros numero07 = new Numeros();
		numero07.setMes("Julho");
		numero07.setNumeroCasosConfirmados(31);
		numero07.setNumeroObito(1);
		numero07.setNumeroRecuperados(21);
		numero07.setPorcentagemRecuperados(67.74);
		numero07.setPorcentagemObito(3.22);
		numeros.add(numero07);
		
		Numeros numero08 = new Numeros();
		numero08.setMes("Agosto");
		numero08.setNumeroCasosConfirmados(139);
		numero08.setNumeroObito(4);
		numero08.setNumeroRecuperados(74);
		numero08.setPorcentagemRecuperados(53.24);
		numero08.setPorcentagemObito(2.88);
		numeros.add(numero08);
		
		Numeros numero09 = new Numeros();
		numero09.setMes("Setembro");
		numero09.setNumeroCasosConfirmados(374);
		numero09.setNumeroObito(15);
		numero09.setNumeroRecuperados(263);
		numero09.setPorcentagemRecuperados(70.32);
		numero09.setPorcentagemObito(4.0);
		numeros.add(numero09);
		
		Numeros numero10 = new Numeros();
		numero10.setMes("Outubro");
		numero10.setNumeroCasosConfirmados(487);
		numero10.setNumeroObito(19);
		numero10.setNumeroRecuperados(466);
		numero10.setPorcentagemRecuperados(95.69);
		numero10.setPorcentagemObito(3.9);
		numeros.add(numero10);
		
		Numeros numero11 = new Numeros();
		numero11.setMes("Novembro");
		numero11.setNumeroCasosConfirmados(559);
		numero11.setNumeroObito(19);
		numero11.setNumeroRecuperados(495);
		numero11.setPorcentagemRecuperados(88.55);
		numero11.setPorcentagemObito(3.4);
		numeros.add(numero11);
		
		Numeros numero12 = new Numeros();
		numero12.setMes("Dezembro");
		numero12.setNumeroCasosConfirmados(737);
		numero12.setNumeroObito(21);
		numero12.setNumeroRecuperados(643);
		numero12.setPorcentagemRecuperados(87.24);
		numero12.setPorcentagemObito(2.85);
		numeros.add(numero12);
		
		Numeros numero01 = new Numeros();
		numero01.setMes("Janeiro");
		numero01.setNumeroCasosConfirmados(1155);
		numero01.setNumeroObito(27);
		numero01.setNumeroRecuperados(996);
		numero01.setPorcentagemRecuperados(86.23);
		numero01.setPorcentagemObito(2.34);
		numeros.add(numero01);	
		
		Numeros numero02 = new Numeros();
		numero02.setMes("Fevereiro");
		numero02.setNumeroCasosConfirmados(1293);
		numero02.setNumeroObito(29);
		numero02.setNumeroRecuperados(1234);
		numero02.setPorcentagemRecuperados(95.44);
		numero02.setPorcentagemObito(2.24);
		numeros.add(numero02);
		
		Numeros numero03 = new Numeros();
		numero03.setMes("Março");
		numero03.setNumeroCasosConfirmados(1711);
		numero03.setNumeroObito(34);
		numero03.setNumeroRecuperados(1493);
		numero07.setPorcentagemRecuperados(87.26);
		numero07.setPorcentagemObito(1.99);
		numeros.add(numero03);
		
		Numeros numero04 = new Numeros();
		numero04.setMes("Abril");
		numero04.setNumeroCasosConfirmados(2008);
		numero04.setNumeroObito(41);
		numero04.setNumeroRecuperados(1831);
		numero04.setPorcentagemRecuperados(91.18);
		numero04.setPorcentagemObito(2.04);
		numeros.add(numero04);
		
		Numeros numero05 = new Numeros();
		numero05.setMes("Maio");
		numero05.setNumeroCasosConfirmados(2555);
		numero05.setNumeroObito(50);
		numero05.setNumeroRecuperados(2243);
		numero05.setPorcentagemRecuperados(87.79);
		numero05.setPorcentagemObito(1.96);
		numeros.add(numero05);
		
		return numeros;
	}
	
}
