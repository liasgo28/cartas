package br.com.diego.cartas;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class BaralhoController {
	private List<Baralho> listaBaralhos = new ArrayList<Baralho>();
	
	
	private static final Map<Integer, Carta> BARALHO_COMPLETO = Baralho.getBaralhoCompleto();
	
	
	public BaralhoController(int[] listaCartas) {
		for (int identificadorCarta : listaCartas) {
			Baralho baralho = this.recuperarBaralho(identificadorCarta);
			baralho.addCarta(identificadorCarta, BARALHO_COMPLETO.get(identificadorCarta));
		}
		
		
	}

	public int calculaQuantidadeBaralhosCompletos() {
		int quantidadeBaralhosCompletos = 0;
	
		for (Baralho baralho : listaBaralhos) {
			if (baralho.estaCompleto()) {
				quantidadeBaralhosCompletos += 1;
			}
			
		}
		
		return quantidadeBaralhosCompletos;
	}
	
	private Baralho recuperarBaralho (int identificadorCarta) {
		if (listaBaralhos.size() == 0) {
			this.criarNovoBaralho();
		}
		
		for (Baralho baralhoExistente : listaBaralhos) {
			if (!baralhoExistente.ehCartaRepetida(identificadorCarta)) {
				return baralhoExistente;
			}				
		}
		
		
		return this.criarNovoBaralho();	

		
	}
	
	private Baralho criarNovoBaralho() {
		Baralho baralho = new Baralho();
		listaBaralhos.add(baralho);
		return baralho;
		
	}

	public int calculaQuantidadeBaralhosIncompletos() {
		int quantidadeBaralhosIncompletos = 0;
		
		for (Baralho baralho : listaBaralhos) {
			if (!baralho.estaCompleto()) {
				quantidadeBaralhosIncompletos += 1;
			}
			
		}
		
		return quantidadeBaralhosIncompletos;
	}
	
	
	

}
