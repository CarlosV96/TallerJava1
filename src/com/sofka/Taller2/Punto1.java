package com.sofka.Taller2;
import java.util.Scanner;

import com.sofka.Linea;

public class Punto1 {
	private int edad;
	
	public void Punto1() {
		Linea l = new Linea();
		
		informacion();
		solicitarEdad();
		edad = capturarEdad();
		
		
		if(edad>=18){
			System.out.println("Usted es mayor de edad");
		}
		else {
			System.out.println("Usted aún es un niño(a)");
		}
		l.Linea();
	}
	private void informacion() {
		System.out.println("                  INFORMACION PUNTO 1 Y 2");
		System.out.println("SOLICITAR EDAD Y CORROBORAR SI ES MAYOR DE EDAD O UN NIÑO AUN");
	}
	
	private void solicitarEdad() {
		System.out.println("Por favor digite su edad.");
	}
	
	private int capturarEdad() {
		Scanner input = new Scanner(System.in);
		return input.nextInt(); 
		
	}

}