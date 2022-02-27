package com.sofka.Taller2;

import java.util.Scanner;

import com.sofka.Linea;

public class Punto10 {
	private int opcion, accion;
	private double cuenta1, cuenta2, cuenta3, consignar, retirar;
	private Scanner entrada;
	private String titular1, titular2, titular3;
	
	public void Punto10() {
		Linea l = new Linea();
		entrada = new Scanner (System.in);
		informacion();
		
		titular1 = "Camilo";
		titular2 = "Juan";
		titular3 = "Andres";
		cuenta1 = 126.358;
		cuenta2 = 318.293;
		cuenta3 = 672.382;
		
		System.out.println("               SU BANCO FIEL");
		System.out.println("");
		capturaTitular();
		
		if(opcion==1) {
			mensaje();
			metodo1();
			
		}else if(opcion==2) {
			mensaje();
			metodo2();
			
		}else if(opcion==3) {
			mensaje();
			metodo3();
		}else {
			System.out.println("Opción incorrecta.");
		}
		l.Linea();
	}
	private void informacion() {
		System.out.println("          INFORMACION DEL PUNTO 10");
		System.out.println("APLICACION PARA LLEVAR LAS CUENTAS DE SUS CLIENTES.");
		System.out.println(" ");
	}
	private int capturaTitular() {
	System.out.println("¿Cuál es tu nombre?");
	System.out.println("1. " + titular1);
	System.out.println("2. " + titular2);
	System.out.println("3. " + titular3);
	return opcion = entrada.nextInt();
	}
	private int mensaje() {
		System.out.println("Bienvenido a su cuenta.");
		System.out.println("Escriba la opción que desea realizar");
		System.out.println("1. Realizar una consignación");
		System.out.println("2. Realizar un retiro");
		System.out.println("3. Consultar saldo");
		return accion = entrada.nextInt();
	}
	private double consignar() {
		System.out.println("Ingrese el valor que desea consignar.");
		return consignar = entrada.nextDouble();
	}
	private double retirar() {
		System.out.println("Ingrese el valor que desea retirar.");
		return retirar = entrada.nextDouble();
	}
	private void consignacion() {
		if(consignar > 0) {
			System.out.println("Usted consignó correctamente el valor de " + consignar);
		}else {
			System.out.println("No se puede consignar valores negativos.");
		}
	}
	private void metodo1() {
		switch (accion) {
		case 1:
			consignar();
			consignacion();
			break;
		case 2:
			retirar();
			if (retirar <= cuenta1) {
				System.out.println("Usted retiró correctamente el valor de $" + retirar);
			}else {
				System.out.println("Señor, usted no posee fondos suficientes.");
			}
			break;
		case 3: 
			System.out.println("Su saldo es de $" + cuenta1);
		}
	}
	private void metodo2() {
		switch (accion) {
		case 1:
			consignar();
			consignacion();
			break;
		case 2:
			retirar();
			if (retirar <= cuenta2) {
				System.out.println("Usted retiró correctamente el valor de $" + retirar);
			}else {
				System.out.println("Señor, usted no posee fondos suficientes.");
			}
			break;
		case 3: 
			System.out.println("Su saldo es de $" + cuenta2);
		}
	}
	private void metodo3() {
		switch (accion) {
		case 1:
			consignar();
			consignacion();
			break;
		case 2:
			retirar();
			if (retirar <= cuenta3) {
				System.out.println("Usted retiró correctamente el valor de $" + retirar);
			}else {
				System.out.println("Señor, usted no posee fondos suficientes.");
			}
			break;
		case 3: 
			System.out.println("Su saldo es de $" + cuenta3);
		}
	}
}
