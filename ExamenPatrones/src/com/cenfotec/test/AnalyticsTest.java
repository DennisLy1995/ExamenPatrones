package com.cenfotec.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import com.cenfotec.Analytics;

public class AnalyticsTest {

	@Test
	public void TestLaMasLarga() {
		
		String frase1 = "casa casita casotota";
		String frase2 = "casa mia cosa";
		
		String[] arreglo1 = {"casotota"};
		String[] arreglo2 = {"casa","cosa"};
		
		String[] arregloResultado1 = Analytics.LaMasLarga(frase1);
		String[] arregloResultado2 = Analytics.LaMasLarga(frase2);
		
		//assertEquals(arregloResultado1, arreglo1, "Resultado deberia de ser casotota");
		//assertEquals(arregloResultado2, arreglo2, "Resultado deberia de ser casotota");
		//assertEquals(arregloResultado3, arreglo3, "Resultado deberia de ser casa, cosa");
		Assert.assertArrayEquals( arregloResultado1, arreglo1 );
		Assert.assertArrayEquals( arregloResultado2, arreglo2 );
		
	}
	
	
	@Test
	public void TestLaMasCorta() {
		
		String frase1 = "casa casita casotota";
		String frase2 = "casa mia cosa ala";
		
		String[] arreglo1 = {"casa"};
		String[] arreglo2 = {"mia", "ala"};
		
		String[] arregloResultado1 = Analytics.LaMasCorta(frase1);
		String[] arregloResultado2 = Analytics.LaMasCorta(frase2);
		
		//assertEquals(arregloResultado1, arreglo1, "Resultado deberia de ser casotota");
		//assertEquals(arregloResultado2, arreglo2, "Resultado deberia de ser casotota");
		//assertEquals(arregloResultado3, arreglo3, "Resultado deberia de ser casa, cosa");
		Assert.assertArrayEquals( arregloResultado1, arreglo1 );
		Assert.assertArrayEquals( arregloResultado2, arreglo2 );
	}
	
}
