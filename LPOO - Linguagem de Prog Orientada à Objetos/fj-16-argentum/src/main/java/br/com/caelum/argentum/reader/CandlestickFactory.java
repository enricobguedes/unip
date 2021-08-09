package br.com.caelum.argentum.reader;

import java.util.Calendar;
import java.util.List;

import br.com.caelum.argentum.Candlestick;
import br.com.caelum.argentum.Negocio;

public class CandlestickFactory { // criando lista baseado nos dados e uma data.
	
	public Candlestick constroiCandleParaData(Calendar data, List<Negocio> negocios) {
		double maximo = negocios.get(0).getPreco();
		double minimo = negocios.get(0).getPreco();
		double volume = 0;
		
		for (Negocio negocio : negocios) { //enfiando os volumes na lista negocios ^^
			volume += negocio.getVolume(); // alocando o volume dentro de uma variavel
			
			if (negocio.getPreco() > maximo) {
				maximo = negocio.getPreco();
			} else if (negocio.getPreco() < minimo) {
				minimo = negocio.getPreco();
			}
		}
		
		double abertura = negocios.get(0).getPreco(); //pegando preço de abertura
		double fechamento = negocios.get(negocios.size() - 1).getPreco(); // preco de fechamento
		
		return new Candlestick(abertura, fechamento, minimo, maximo, volume, data);
	}

}
