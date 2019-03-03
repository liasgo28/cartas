package br.com.diego.cartas;

import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

public class BaralhoTest{
	
	@Test
    public void deveTer52Cartas()
    {		
		Map<Integer, Carta> baralhoCompleto = Baralho.getBaralhoCompleto();
        Assert.assertEquals(52, baralhoCompleto.size());
    }
    

	
}


