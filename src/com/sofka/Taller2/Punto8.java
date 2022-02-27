package com.sofka.Taller2;

import java.util.Scanner;

import com.sofka.Linea;

public class Punto8 {
	private String cliente, sabor, decoracion, ventas;
	private int opcion, porciones, opcion2;
//	private Scanner input;
	
	public void Punto8() {
//		input = new Scanner(System.in);
		Linea l = new Linea();
		informacion();
		
		System.out.println("PASTELERIA DE DON CARLOS");
		System.out.println("Escribe tu nombre");
		cliente = capturarDato();
		mensaje();
		opcion = capturarOpcion();
		if (opcion==1) {
			System.out.println("Elije sabor de torta (chocolate, mango, fresa)");
			sabor = capturarDato();
			
			System.out.println("Elije las porciones 4, 8, 12");
			porciones = capturarOpcion();
			System.out.println("Elije qu� tipo de decoraci�n deseas (castillo, matrimonio, quincea�os)");
			decoracion = capturarDato();
			System.out.println("Registro de torta");
			System.out.println("El se�or(a) " + cliente + " desea una torta sabor " + sabor + " de " + porciones + " porciones y con decoracion de " + decoracion + ".");
		}else if(opcion==2) {
			tortasDisponibles();
			opcion2 = capturarOpcion();
			switch(opcion2) {
			case 1: 
				System.out.println("Se�or " + cliente + " Su pedido de Torta fria de chocolate, de 4 porciones, sin decoraci�n ya est� en marcha");
				break;
			case 2:
				System.out.println("Se�or " + cliente + " Su pedido de Torta caliente de mango, de 8 porciones, con decoraci�n de matrimonio ha sido registrado");
				break;
			case 3:
				System.out.println("Se�or " + cliente + " Su pedido de Torta fria de almendras, de 12 porciones, con decoraci�n de quincea�os ha sido registrado");
			}
		}else if(opcion==3){
			System.out.println("Aqu� encontrar� el registro de ventas, digite cu�ntas ventas se han realizado el d�a de hoy, para tener el registro");
			ventas = capturarDato();
			System.out.println("El d�a de hoy se han realizado " + ventas + " ventas");
		}else {
			System.out.println("Opci�n incorrecta.");
		}
		l.Linea();
	}
	private void informacion() {
		System.out.println("             INFORMACION DEL PUNTO 8");
		System.out.println("APLICACION PARA PASTELERIA QUE PERMITE REGISTRAR PEDIDOS");
	}

	private void mensaje() {
		System.out.println("Elija una opci�n");
		System.out.println("1. Realizar pedido personalizado.");
		System.out.println("2. Ver tortas disponibles.");
		System.out.println("3. Ventas del d�a.");
	}
	private int capturarOpcion() {
		Scanner input = new Scanner(System.in);
		return input.nextInt(); 
	}
	private String capturarDato() {
		Scanner input = new Scanner(System.in);
		return input.nextLine();
	}
	private void tortasDisponibles() {
		System.out.println("Tenemos disponibilidad de las siguientes tortas, escriba el n�mero de torta que desee.");
		System.out.println("1. Torta fria de chocolate, de 4 porciones, sin decoraci�n");
		System.out.println("2. Torta caliente de mango, de 8 porciones, con decoraci�n de matrimonio");
		System.out.println("3. Torta fria de almendras, de 12 porciones, con decoraci�n de quincea�os");
	}
}
