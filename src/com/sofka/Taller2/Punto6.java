package com.sofka.Taller2;

import java.util.Scanner;

import com.sofka.Linea;

public class Punto6 {
	private String cliente1;
	private String observaciones;
	private boolean continuar;
	private Scanner input;
	private int opcion;
	
	public void Punto6() {
		input = new Scanner(System.in);
		Linea l = new Linea();
		informacion();
		
		System.out.println("TALLER DE MOTOS EL MAQUINISTA");
		cliente1 = CapturarNombre();
		observaciones = CapturarInfo();
		mensajeAntes();
		continuar = revision();
		
		if (continuar==true) {
			mensajeDespues();
			opcion = CapturarInt();
			if(opcion==1) {
				System.out.println("A la motocicleta se le realizó el cambio de aceite, y de filtro de aire, debido a que ya estaban de cambio, se le hizo desmonte de culata para revisión, y se le volvió a poner");
			}else if(opcion==2) {
				System.out.println("1. Filtro de aire $12.000");
				System.out.println("2. Cambio de aceite (mano de obra incluído) $43.000");
				System.out.println("3. Monte y desmonte de Culata $85.000");
			}else {
				System.out.println("Opción incorrecta.");
			}
		}else {
			System.out.println("No se puede continuar.");
		}
		l.Linea();
	}
	private void informacion() {
		System.out.println("                      INFORMACION DEL PUNTO 6");
		System.out.println("APLICACIÓN PARA UN TALLER DE MOTOS QUE PERMITE REGISTRAR SERVICIOS GENERADOS");
	}
	
	private String CapturarNombre(){
		System.out.println("Escriba su nombre");
		return input.nextLine();
	}
	
	private String CapturarInfo() {
		System.out.println("Qué le sucede a la motocicleta");
		return input.nextLine();
	}
	
	private void mensajeAntes() {
		System.out.println("Fecha 27 Junio de 2022.");
		System.out.println("Ingresa motocicleta del señor(a), " + cliente1 + " con un problema descrito por el cliente como: '" + observaciones + "'. Se realiza la respectiva inspección de la moto.");
		System.out.println("Por favor escriba true para continuar");
	}
	
	private void mensajeDespues() {
		System.out.println("Fecha 28 Junio de 2022.");
		System.out.println("Una vez realizada la revisión y el trabajo respectivo de la moto del señor(a) " + cliente1 + ", se le hace entrega y se presentan las novedades que se le realizaron a la moto, y el cambio de repuestos");
		System.out.println("Elija la opción que desea ver");
		System.out.println("1. Novedades.");
		System.out.println("2. Repuestos cambiados.");
	}
	
	private int CapturarInt() {
		return input.nextInt();
	}
	
	private boolean revision() {
		return input.nextBoolean();
	}
	
}
