package com.sofka.Taller2;
import java.util.Scanner;

import com.sofka.Linea;

public class Punto3 {
	private String nombre;
	private String apellido;
	private int edad;
	
	public void Punto3() {
		Linea l = new Linea();
		
		informacion();
		solicitarNombre();
		nombre = capturarDato();
		
		solicitarApellido();
		apellido = capturarDato();
		
		solicitarEdad();
		edad = capturarEdad();
		
		
		if(edad>=18){
			System.out.println(nombre + " " + apellido + " Usted es mayor de edad, por lo tanto puede entrar a la fiesta");
		}else {
			System.out.println(nombre + " " + apellido + " Usted es menor de edad, por lo tanto, no puede entrar a la fiesta, por favor devuélvase a su casa.");
		}
		l.Linea();
	}
	private void informacion() {
		System.out.println("          INFORMACION DEL PUNTO 3");
		System.out.println("SOLICITAR NOMBRE, APELLIDOS, Y EDAD, E IMPRIMIR UN MENSAJE");
	}
	
	private void solicitarNombre() {
		System.out.println("Por favor digite su nombre.");
	}
	
	private void solicitarApellido() {
		System.out.println("Por favor digite su apellido.");
	}
	
	private void solicitarEdad() {
		System.out.println("Por favor digite su edad.");
	}
	
	private String capturarDato() {
		Scanner input = new Scanner(System.in);
		return input.nextLine(); 
	}
	
	private int capturarEdad() {
		Scanner input = new Scanner(System.in);
		return input.nextInt(); 
	}
}