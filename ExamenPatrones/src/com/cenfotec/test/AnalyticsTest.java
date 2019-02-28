package com.cenfotec.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.cenfotec.Analytics;

public class AnalyticsTest {

	@Test
	public static void TestLaMasLarga() {
		
		String frase1 = "casa casita casotota";
		String frase2 = "casotota";
		String frase3 = "casa mia cosa";
		
		String[] arreglo1 = {"casotota"};
		String[] arreglo2 = {"casotota"};
		String[] arreglo3 = {"casa","cosa"};
		
		String[] arregloResultado1 = Analytics.LaMasLarga(frase1);
		String[] arregloResultado2 = Analytics.LaMasLarga(frase2);
		String[] arregloResultado3 = Analytics.LaMasLarga(frase3);
		
		assertEquals(arreglo1, arregloResultado1, "");
		
	}
	
}
