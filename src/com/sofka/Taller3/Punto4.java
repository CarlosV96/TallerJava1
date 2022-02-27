package com.sofka.Taller3;

import java.util.Scanner;

import com.sofka.Linea;

public class Punto4 {
	private int a, b;
	private Scanner input;
	
	public void Punto4() {
		input = new Scanner(System.in);
		Linea l = new Linea();
		informacion();
		
		System.out.println("Elije el número que deseas multiplicar.");
		Scanner input = new Scanner(System.in);
		a = input.nextInt();
		
		for(b=1; b<=10; b++) {
			System.out.println(b + " X " + a + " = " + b*a);
		}
		l.Linea();
	}
	
	private void informacion() {
		System.out.println("                                   INFORMACION DEL PUNTO 4");
		System.out.println("SOLICITAR UN NUMERO Y GENERAR TABLA DE MULTIPLICAR DEL 1 AL 10 POR EL NÚMERO INGRESADO POR EL USUARIO");
	}

}
