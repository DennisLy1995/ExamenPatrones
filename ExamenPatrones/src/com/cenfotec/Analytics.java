package com.cenfotec;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

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
		
		for(int i=0;i<arregloRetorno.length;i++) {
			System.out.println(arregloRetorno[i]);
		}
		Arrays.sort(arregloRetorno);
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
		Arrays.sort(arregloRetorno);
		return arregloRetorno;
	}
	
	
	
	
	
	public static String[] PrimeraMasLarga(String frase) {
		String[] arregloPalabras = frase.split(" ");
		String[] arregloRetorno = new String[1];
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
				palabraMayor = frasePalabras + arregloPalabras[i];
				i=arregloPalabras.length;
			}
		}
		arregloRetorno[0] = palabraMayor;
		return arregloRetorno;
	}

	public static String[] retornarListaOrdenada(String[] arreglo) {
		
		List<String> temp = Arrays.asList(arreglo);
		return null;
	}
	
}
