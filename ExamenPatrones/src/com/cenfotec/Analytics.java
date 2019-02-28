package com.cenfotec;

public class Analytics {

	public static String[] LaMasLarga(String frase) {

		String[] arregloPalabras = frase.split(" ");
		String[] arregloRetorno;
		String palabraTemp = "";
		String palabraMayor = "";
		String frasePalabras = "";
		int tamano = 0;

		// Obtengo la palabra mas larga.

		palabraTemp = arregloPalabras[0];
		for (int a = 1; a < arregloPalabras.length; a++) {
			if (palabraTemp.length() > arregloPalabras[a].length()) {
				palabraMayor = palabraTemp;
			} else if(palabraTemp.length() < arregloPalabras[a].length()) {
				palabraMayor = arregloPalabras[a];
			}
		}
		tamano = palabraMayor.length();
		
		for(int i=0;i<arregloPalabras.length;i++) {
			if(arregloPalabras[i].length() == tamano) {
				frasePalabras = frasePalabras + arregloPalabras[i] + " ";
			}
		}
		arregloRetorno = frasePalabras.split(" ");

		return arregloRetorno;
	}

	
	
	
	
	public static String[] LaMasCorta(String frase) {

		String[] arregloPalabras = frase.split(" ");
		String[] arregloRetorno;
		String palabraTemp = "";
		String palabraMenor = "";
		String frasePalabras = "";
		int tamano = 0;

		// Obtengo la palabra mas larga.

		palabraTemp = arregloPalabras[0];
		for (int a = 1; a < arregloPalabras.length; a++) {
			if (palabraTemp.length() < arregloPalabras[a].length()) {
				palabraMenor = palabraTemp;
			} else if(palabraTemp.length() > arregloPalabras[a].length()) {
				palabraMenor = arregloPalabras[a];
			}
		}
		tamano = palabraMenor.length();
		
		for(int i=0;i<arregloPalabras.length;i++) {
			if(arregloPalabras[i].length() == tamano) {
				frasePalabras = frasePalabras + arregloPalabras[i] + " ";
			}
		}
		arregloRetorno = frasePalabras.split(" ");
		
		System.out.println("======================Cortas");
		for (int i = 0; i < arregloRetorno.length; i++) {
			System.out.println(arregloRetorno[i]);
		}
		System.out.println("======================");

		return arregloRetorno;
	}

}
