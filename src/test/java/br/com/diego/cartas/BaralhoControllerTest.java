package br.com.diego.cartas;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;


public class BaralhoControllerTest {

	@Test
	public void deveTerUmBaralhoCompleto() {
		int[] listaCartas = new int[52];
		for (int i = 0; i<52; i++) {
			listaCartas[i] = i+1;
		}
		
		assertEquals(52, listaCartas.length);
		BaralhoController baralhoControler = new BaralhoController(listaCartas);
		int qtdeBaralhosCompletos = baralhoControler.calculaQuantidadeBaralhosCompletos();
		Assert.assertEquals(1, qtdeBaralhosCompletos);
		
	}
	
	
	@Test
	public void deveTerUmBaralhoCompletoUmIncompleto() {
		int[] listaCartas = new int[60];
		for (int i = 0; i<52; i++) {
			listaCartas[i] = i+1;
		}
		
		for (int i = 0; i<8; i++) {
			listaCartas[i+52] = i+1;
		}
		
		assertEquals(60, listaCartas.length);
		BaralhoController baralhoControler = new BaralhoController(listaCartas);
		int qtdeBaralhosCompletos = baralhoControler.calculaQuantidadeBaralhosCompletos();
		Assert.assertEquals(1, qtdeBaralhosCompletos);
		int qtdeBaralhosIncompletos = baralhoControler.calculaQuantidadeBaralhosIncompletos();
		Assert.assertEquals(1, qtdeBaralhosIncompletos);
		
	}
	
	
	@Test
	public void deveTerUmBaralhoCompletoDoisIncompletos() {
		int[] listaCartas = new int[60];
		for (int i = 0; i<52; i++) {
			listaCartas[i] = i+1;
		}
		
		for (int i = 0; i<4; i++) {
			listaCartas[i+52] = i+1;
		}
		
		for (int i = 0; i<4; i++) {
			listaCartas[i+56] = i+1;
		}
		
		assertEquals(60, listaCartas.length);
		BaralhoController baralhoControler = new BaralhoController(listaCartas);
		int qtdeBaralhosCompletos = baralhoControler.calculaQuantidadeBaralhosCompletos();
		Assert.assertEquals(1, qtdeBaralhosCompletos);
		int qtdeBaralhosIncompletos = baralhoControler.calculaQuantidadeBaralhosIncompletos();
		Assert.assertEquals(2, qtdeBaralhosIncompletos);
		
	}
	
	@Test
	public void deveTerDoisBaralhosCompletosUmIncompleto() {
		int[] listaCartas = new int[108];
		for (int i = 0; i<52; i++) {
			listaCartas[i] = i+1;
		}
		
		for (int i = 0; i<52; i++) {
			listaCartas[i+52] = i+1;
		}
		
		for (int i = 0; i<4; i++) {
			listaCartas[i+104] = i+1;
		}
		
		assertEquals(108, listaCartas.length);
		BaralhoController baralhoControler = new BaralhoController(listaCartas);
		int qtdeBaralhosCompletos = baralhoControler.calculaQuantidadeBaralhosCompletos();
		Assert.assertEquals(2, qtdeBaralhosCompletos);
		int qtdeBaralhosIncompletos = baralhoControler.calculaQuantidadeBaralhosIncompletos();
		Assert.assertEquals(1, qtdeBaralhosIncompletos);
		
	}
	
}
