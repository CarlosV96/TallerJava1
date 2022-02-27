package com.sofka.Taller3;
import java.util.Scanner;

import com.sofka.Linea;

public class Punto7 {
	private int opcion, numeroPlaca;
	private Scanner input;
	private String[] placas;
	private boolean parqueado, retirado;

	
	public void Punto7() {
		input = new Scanner(System.in);
		Linea l = new Linea();
		parqueado = true;  				 //El veh�culo inicia por defecto dentro del parqueadero, es decir, parqueado.
		retirado = false;			     //Los vehiculos por defecto est�n dentro del parqueadero para iniciar el codigo, por eso retirado es falso.
		definirplacas();
		informacion();
		
	do {
		System.out.println("PARQUEADERO EL GUARDIAN");
		placa();
		numeroPlaca = datoPlaca();
		if (numeroPlaca==1) {
			parqueadero();
		}
		if (numeroPlaca==2) {
			parqueadero();
		}
		if(numeroPlaca==3) {
			parqueadero();
		}
		if(numeroPlaca==4) {
			parqueadero();
		}
		if(numeroPlaca==5) {
			parqueadero();
		}
	}while (numeroPlaca < 6);
	l.Linea();
}
	private void informacion() {
		System.out.println("                       INFORMACION DEL PUNTO 7");
		System.out.println("APLICACION PARA PARQUEADERO QUE PERMITE REGISTRAR LOS VEHICULOS QUE SE CUIDAN.");
	}
	private void placa() {
		System.out.println("�cual es tu placa?");
		System.out.println("1. " + placas[0]);
		System.out.println("2. " + placas[1]);
		System.out.println("3. " + placas[2]);
		System.out.println("4. " + placas[3]);
		System.out.println("5. " + placas[4]);
		System.out.println("6. Salir.");
		
	}
	private int datoPlaca() {
		return input.nextInt();
	}
	private int menu() {
		System.out.println("Informacion del veh�culo.");
		System.out.println(placas[numeroPlaca-1]);
		System.out.println("Elije la opci�n que deseas.");
		System.out.println("1. Ingresar al parqueadero");
		System.out.println("2. Retirar del parquadero");
		System.out.println("3. Consultar si est� en el parqueadero.");
		System.out.println("4. Volver al men� anterior.");
		return input.nextInt();
	}
	private void definirplacas() {
		placas = new String[5];
		placas[0] = "ABC000 - Marca: Chevrolet - Due�o: Jos� Obreg�n  - Telefono: 3000020";
		placas[1] = "ABC100 - Marca: Toyota    - Due�o: Camilo Plaza  - Telefono: 4000050";
		placas[2] = "ABC200 - Marca: Kia       - Due�o: Jorge Paredes - Telefono: 5000060";
		placas[3] = "ABC300 - Marca: Hyundai   - Due�o: Diana Plaza   - Telefono: 6000030";
		placas[4] = "ABC400 - Marca: Suzuki    - Due�o: Carmen Mora   - Telefono: 7000040";
	}
	private void parqueadero() {
		do {
			opcion = menu();  //VENGO POR AQU� FALTA  SEGUIR CON EL MEN�, SI LO QUIERO RETIRAR O PARQUEAR ETC...
			if(opcion==1 && parqueado == true) { //Opcion:parquear --- y --- ya esta parqueado.
				System.out.println("El veh�culo ya est� en el parqueadero.");
				System.out.println(" ");
			}
			
			else if(opcion==1 && parqueado==false) {//Opcion:parquear --- y --- no esta parqueado.
				System.out.println("Bienvenido se�or, ingres� su veh�culo al parqueadero.");
				retirado = false; //Retirado pasa a ser falso, es decir no est� retirado, si est� dentro del parqueadero en este momento.
				parqueado=true;
				opcion=0;
				System.out.println(" ");
			}
			
			else if(opcion==2 && retirado==false) {//Opcion retirar --- y --- no esta retirado, es decir esta parqueado.
				System.out.println("Hasta luego, ha retirado su veh�culo");
				retirado = true; 					// retirado pasa a true, es decir ya fue retirado el vehiculo.
				parqueado = false;					// y parqueado a false, es decir, no esta en el parqueadero.
				opcion=0;
				System.out.println(" ");
			}
			
			else if(opcion==2 && retirado==true) { //Opcion retirar --- y --- ya fue retirado, o no esta en el parqueadero.
				System.out.println("Se�or su veh�culo no est� en el parqueadero.");
				System.out.println(" ");
			}
			
			else if(opcion==3 && parqueado==true) { //Opcion consultar si est� o no en el parqueadero... en este caso, parqueado = true
				System.out.println("Su veh�culo SI se encuentra en el parqueadero.");
				System.out.println(" ");
			}
			else if(opcion==3 && retirado==true) {
				System.out.println("Su vehiculo NO se encuentra en el parqueadero.");
				System.out.println(" ");
			}
		}while (opcion<4);	
	}
}
