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
			System.out.println("Elije qué tipo de decoración deseas (castillo, matrimonio, quinceaños)");
			decoracion = capturarDato();
			System.out.println("Registro de torta");
			System.out.println("El señor(a) " + cliente + " desea una torta sabor " + sabor + " de " + porciones + " porciones y con decoracion de " + decoracion + ".");
		}else if(opcion==2) {
			tortasDisponibles();
			opcion2 = capturarOpcion();
			switch(opcion2) {
			case 1: 
				System.out.println("Señor " + cliente + " Su pedido de Torta fria de chocolate, de 4 porciones, sin decoración ya está en marcha");
				break;
			case 2:
				System.out.println("Señor " + cliente + " Su pedido de Torta caliente de mango, de 8 porciones, con decoración de matrimonio ha sido registrado");
				break;
			case 3:
				System.out.println("Señor " + cliente + " Su pedido de Torta fria de almendras, de 12 porciones, con decoración de quinceaños ha sido registrado");
			}
		}else if(opcion==3){
			System.out.println("Aquí encontrará el registro de ventas, digite cuántas ventas se han realizado el día de hoy, para tener el registro");
			ventas = capturarDato();
			System.out.println("El día de hoy se han realizado " + ventas + " ventas");
		}else {
			System.out.println("Opción incorrecta.");
		}
		l.Linea();
	}
	private void informacion() {
		System.out.println("             INFORMACION DEL PUNTO 8");
		System.out.println("APLICACION PARA PASTELERIA QUE PERMITE REGISTRAR PEDIDOS");
	}

	private void mensaje() {
		System.out.println("Elija una opción");
		System.out.println("1. Realizar pedido personalizado.");
		System.out.println("2. Ver tortas disponibles.");
		System.out.println("3. Ventas del día.");
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
		System.out.println("Tenemos disponibilidad de las siguientes tortas, escriba el número de torta que desee.");
		System.out.println("1. Torta fria de chocolate, de 4 porciones, sin decoración");
		System.out.println("2. Torta caliente de mango, de 8 porciones, con decoración de matrimonio");
		System.out.println("3. Torta fria de almendras, de 12 porciones, con decoración de quinceaños");
	}
}
