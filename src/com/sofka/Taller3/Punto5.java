package com.sofka.Taller3;

import java.util.Scanner;

import com.sofka.Linea;

public class Punto5 {
	private int a;
	private boolean captura;
	private String nombre;
	private Scanner input;
	
	public void Punto5() {
		input = new Scanner(System.in);
		Linea l = new Linea();
		captura=false;
		informacion();
	
		
		do {
		a = menu();
		if (a==1) {
			nombre = capturarNombre();
			captura = true;
		}
		else if(a==2) {
			if(captura==true) {
				System.out.println("Hola " + nombre);
			}else {
				System.out.println("Para saludarte primero debes capturar tu nombre");
			}
		}
		}while(a < 3);
		System.out.println("Vuelve pronto.");
		l.Linea();
	}
	private void informacion() {
		System.out.println("                     INFORMACION DEL PUNTO 5");
		System.out.println("CREAR UN MENU DE EJECUCION INFINITA HASTA QUE EL USUARIO DECIDA FINALIZAR");
	}
	
	private int menu() {
		System.out.println("Menú de usuario.");
		System.out.println("1. Capturar nombre.");
		System.out.println("2. Saludar persona.");
		System.out.println("3. Salir del sistema.");
		return input.nextInt();
	}
	
	private String capturarNombre() {
		System.out.println("Dime tu nombre.");
		Scanner entrada = new Scanner(System.in);
		return entrada.nextLine();
	}
}
