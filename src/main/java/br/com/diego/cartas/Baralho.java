package br.com.diego.cartas;

import java.util.HashMap;
import java.util.Map;



public class Baralho {

	private Map<Integer, Carta> baralho = new HashMap<Integer, Carta>();

	
	public Map<Integer, Carta> getBaralho() {
		return baralho;
	}


	public void addCarta(int identificadorCarta, Carta carta) {
		this.baralho.put(identificadorCarta, carta);
	}
	
	
	public boolean estaCompleto() {
		return this.baralho.size() == Baralho.getBaralhoCompleto().size();
	}
	
	public static Map<Integer, Carta> getBaralhoCompleto() {
		 Map<Integer, Carta> baralhoCompleto = new HashMap<Integer, Carta>();
		
		
		int identificadorCarta = 0;
		for(int numero=1;numero<=13;numero++) {
			identificadorCarta += 1;
			baralhoCompleto.put(identificadorCarta,new Carta(numero,Naipes.OUROS));			
			
			identificadorCarta += 1;
			baralhoCompleto.put(identificadorCarta, new Carta(numero,Naipes.ESPADAS));
			
			identificadorCarta += 1;
			baralhoCompleto.put(identificadorCarta,new Carta(numero,Naipes.COPAS));
			
			identificadorCarta += 1;
			baralhoCompleto.put(identificadorCarta,new Carta(numero,Naipes.PAUS));
			
		}
		
		return baralhoCompleto;
	}
	
	public boolean ehCartaRepetida(int identificadorCarta) {
		return this.baralho.containsKey(identificadorCarta);
	}
	
}
