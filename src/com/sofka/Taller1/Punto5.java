package com.sofka.Taller1;

import java.util.Scanner;

import com.sofka.Linea;

public class Punto5 {
	private String nombre;
	private int edad;
	private String tipo;
	private String dueno;
	private Scanner input;
	
	public void Punto5() {
		input = new Scanner(System.in);
		Linea l = new Linea();
		
		informacion();
		
		solicitarNombre();
		nombre = capturarDato();
		
		solicitarTipo();
		tipo = capturarDato();
		
		solicitarDueno();
		dueno = capturarDato();
		
		solicitarEdad();
		edad = capturarDatoInt();
		
		mensaje();
		l.Linea();
	}
	
	private void informacion() {
		System.out.println("              INFORMACION DEL PUNTO 5");
		System.out.println("SOLICITAR DISTINTOS DATOS DE LA MASCOTA E IMPRIMIR UN MENSAJE.");
	}
	
	private void solicitarNombre() {
		System.out.println("Digite por favor el nombre de su mascota.");
	}
	
	private void solicitarEdad() {
		System.out.println("Digite por favor la edad de su mascota.");
	}
	
	private void solicitarTipo() {
		System.out.println("Digite por favor que tipo de animal es su mascota.");
	}
	
	private void solicitarDueno() {
		System.out.println("Digite por favor su nombre completo.");
	}
	
	private String capturarDato() {
		return input.nextLine();
	}
	
	private int capturarDatoInt() {
		return input.nextInt();
	}	
	
	private void mensaje() {
		System.out.println(nombre + " es un(a) " + tipo + " el cual, tiene " + edad + " años de edad y " + dueno + " actualmente es su dueño.");
	}
}
