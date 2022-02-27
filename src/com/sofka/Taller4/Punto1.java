package com.sofka.Taller4;

import java.util.Scanner;

import com.sofka.Linea;

public class Punto1 {
	private int[] numero;
	private Scanner input;
	private int i;
	
	public void Punto1() {
		input = new Scanner(System.in);
		numero = new int[5];
		Linea l = new Linea();
		
		informacion();
		capturarNum();
		imprimirNum();
		l.Linea();
		
	}


	private void informacion() {
		System.out.println("                          INFORMACIÓN DEL PUNTO 1");
		System.out.println("CREAR UN VECTOR DE 5 POSICIONES, LLENARLO CON INFORMACION SOLICITADA, E IMPRIMIRLO.");
		System.out.println(" ");
	}
	
	private void capturarNum() {
		for (i = 0; i <= 4; i++) {
		System.out.println("Digita por favor un número");
		numero[i] = input.nextInt();
		}
	}
	
	private void imprimirNum() {
		for (i=0; i<= 4; i++)
		System.out.println("[" + i + "] = " + numero[i]);
	}
}
