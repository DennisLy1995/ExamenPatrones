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
		
		Assert.assertArrayEquals( arregloResultado1, arreglo1 );
		Assert.assertArrayEquals( arregloResultado2, arreglo2 );
		
	}	
	
	@Test
	public void TestLaMasCorta() {
		
		String frase1 = "casa casita casotota";
		String frase2 = "casa mia cosa ala";
		
		String[] arreglo1 = {"casa"};
		String[] arreglo2 = {"ala", "mia"};
		
		String[] arregloResultado1 = Analytics.LaMasCorta(frase1);
		String[] arregloResultado2 = Analytics.LaMasCorta(frase2);
		
		Assert.assertArrayEquals( arregloResultado1, arreglo1 );
		Assert.assertArrayEquals( arregloResultado2, arreglo2 );
	}
	
	
	@Test
	public void TestLaMasLargaOrdenado() {
		
		String frase1 = "casa casita casotota casotita";
		String frase2 = "casa mia cosa ala";
		
		String[] arreglo1 = {"casotita","casotota"};
		String[] arreglo2 = {"casa","cosa"};
		
		String[] arregloResultado1 = Analytics.LaMasLarga(frase1);
		String[] arregloResultado2 = Analytics.LaMasLarga(frase2);
		
		Assert.assertArrayEquals( arregloResultado1, arreglo1 );
		Assert.assertArrayEquals( arregloResultado2, arreglo2 );
	}
	
	@Test
	public void TestLaMasCortaOrdenado() {
		
		String frase1 = "casa alto casita casotota";
		String frase2 = "casa mia cosa ala";
		
		String[] arreglo1 = {"alto", "casa"};
		String[] arreglo2 = {"ala", "mia"};
		
		String[] arregloResultado1 = Analytics.LaMasCorta(frase1);
		String[] arregloResultado2 = Analytics.LaMasCorta(frase2);
		
		Assert.assertArrayEquals( arregloResultado1, arreglo1 );
		Assert.assertArrayEquals( arregloResultado2, arreglo2 );
	}
	
	
	@Test
	public void TestLaPrimeraMasLarga() {
		
		String frase1 = "casa casita casotota casotita";
		String frase2 = "casa mia cosa";
		
		String[] arreglo1 = {"casotota"};
		String[] arreglo2 = {"casa"};
		
		String[] arregloResultado1 = Analytics.PrimeraMasLarga(frase1);
		String[] arregloResultado2 = Analytics.PrimeraMasLarga(frase2);
		
		Assert.assertArrayEquals( arregloResultado1, arreglo1 );
		Assert.assertArrayEquals( arregloResultado2, arreglo2 );
		
	}
	
	
}
