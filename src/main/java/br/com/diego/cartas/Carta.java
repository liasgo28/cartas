package br.com.diego.cartas;


public class Carta {

	private int numero;
	private Naipes naipe;
	public Carta(int numero, Naipes naipe) {
		super();
		this.numero = numero;
		this.naipe = naipe;
	}

	public int getNumero() {
		return numero;
	}
	public Naipes getNaipe() {
		return naipe;
	}

	@Override
	public String toString() {
		return "Carta [numero=" + numero + ", naipe=" + naipe + "]";
	}

	
	
}
