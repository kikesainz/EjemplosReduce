package com.kike.main;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

//		Concatenar strings
		String[] palabras = {"Java", "Streams", "API"};
		String concatenado = Arrays.stream(palabras)
		                            .reduce("", (result, element) -> result + element);
		System.out.println(concatenado); // JavaStreamsAPI
		
		
		//Producto de números
		Integer[] numeros = { 1, 3, 5, 8};
		int product = Arrays.stream(numeros)
		                     .reduce(1, (a, b) -> a * b);
		System.out.println("Producto: " + product); 
		
		//Encontrar el mínimo de una lista de números
		int minimo = Arrays.stream(numeros)
				.reduce(Integer.MAX_VALUE, (a, b) -> a < b ? a : b);
		System.out.println("El mínimo es: "+ minimo);
	}

}
