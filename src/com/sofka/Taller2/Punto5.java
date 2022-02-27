package com.sofka.Taller2;

import java.util.Scanner;

import com.sofka.Linea;

public class Punto5 {
	private int opcion;
	private int opcion2;
	private String cliente;
	private Scanner input;
	private boolean compra;
	
	public void Punto5() {
		input = new Scanner(System.in);
		Linea l = new Linea();
		informacion();
		
		System.out.println("Digita tu nombre");
		cliente = capturarDato();
		
		medicamentos();
		opcion = capturarOpcion();
		
		 // Opción uno, información del Dolex.
		if (opcion==1) {
			System.out.println("DESCRIPCIÓN PRODUCTO: Cada tableta contiene acetaminofén 500 mg y cafeína 65mg");
			opciones();
			opcion2 = capturarOpcion();
			if (opcion2==1) {
				System.out.println("Felicidades, compra de dolex éxitosa");
			}else if (opcion2==2) {
				infoDolex();
				compra = compra();
				if (compra==true) {
					System.out.println("Felicidades señor (a) " + cliente + " compra exitosa.");
				}else {
					System.out.println("Vuelve pronto");
				}
			}else if (opcion2==3) {
				System.out.println("Recibida su devolución.");
			}else {
				System.out.println("Opción incorrecta.");
			}
		}
		
		//Opción dos, información del Advil
		else if (opcion==2) {
			System.out.println("DESCRIPCIÓN DE PRODUCTO: Cada cápsula blanda (líquida) contiene: Ibuprofeno (solubilizado) 400 mg. Indicaciones: Analgésico y antipirético");
			opciones();
			opcion2 = capturarOpcion();
			if (opcion2==1) {
				System.out.println("Felicidades, compra de advil éxitosa");
			}else if(opcion2==2) {
				infoAdvil();
				compra = compra();
				if (compra==true) {
					System.out.println("Felicidades señor (a) " + cliente + " compra exitosa.");
				}else {
					System.out.println("Vuelve pronto");
				}
			}else if (opcion2==3) {
				System.out.println("Recibida su devolución.");
			}else {
				System.out.println("Opción incorrecta.");
				}
		}
		
		//Opción tres información del movidol.
		else if (opcion==3) {
			System.out.println("DESCRIPCIÓN DE PRODUCTO: Reúne las propiedades analgésicas del acetaminofeno con la actividad antiinflamatoria-analgésica de larga duración del naproxeno");
			opciones();
			opcion2 = capturarOpcion();
			if (opcion2==1) {
				System.out.println("Felicidades, compra de movidol éxitosa");
			}else if(opcion2==2) {
				infoMovidol();
				compra = compra();
				if (compra==true) {
					System.out.println("Felicidades señor (a) " + cliente + " compra exitosa.");
				}else {
					System.out.println("Vuelve pronto");
				}
			}else if (opcion2==3) {
				System.out.println("Recibida su devolución.");
			}else {
				System.out.println("Opción incorrecta.");
				}
		}
		l.Linea();
}
	private void informacion() {
		System.out.println("               INFORMACION DEL PUNTO 5");
		System.out.println("APLICACION PARA UNA DROGUERIA QUE PERMITE FACTURAR PRODUCTOS.");
	}
	
	private String capturarDato() {
		return input.nextLine();
	}
	private void medicamentos() {
		System.out.println(cliente + " Elija el medicamento que necesita.");
		System.out.println("1. Dolex");
		System.out.println("2. Advil");
		System.out.println("3. Movidol");
	}
	private int capturarOpcion() {
		return input.nextInt();
	}
	private void opciones() {
		System.out.println("Elije la opción que deseas.");
		System.out.println("1. Comprar");
		System.out.println("2. Consultar precio");
		System.out.println("3. Devoluciones");
	}
	private boolean compra() {
		return input.nextBoolean();
	}
	private void infoDolex() {
		System.out.println("El dolex tiene un precio de $ 1.200");
		System.out.println("¿Desea comprar?");
		System.out.println("true para si");
		System.out.println("False para no.");
	}
	private void infoAdvil() {
		System.out.println("El Advil tiene un precio de $ 1.800");
		System.out.println("¿Desea comprar?");
		System.out.println("true para si");
		System.out.println("False para no.");
	}
	private void infoMovidol() {
		System.out.println("El Movidol tiene un precio de $ 2.500");
		System.out.println("¿Desea comprar?");
		System.out.println("true para si");
		System.out.println("False para no.");
	}
}
