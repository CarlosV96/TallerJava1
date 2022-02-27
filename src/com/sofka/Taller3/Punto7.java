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
		parqueado = true;  				 //El vehículo inicia por defecto dentro del parqueadero, es decir, parqueado.
		retirado = false;			     //Los vehiculos por defecto están dentro del parqueadero para iniciar el codigo, por eso retirado es falso.
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
		System.out.println("¿cual es tu placa?");
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
		System.out.println("Informacion del vehículo.");
		System.out.println(placas[numeroPlaca-1]);
		System.out.println("Elije la opción que deseas.");
		System.out.println("1. Ingresar al parqueadero");
		System.out.println("2. Retirar del parquadero");
		System.out.println("3. Consultar si está en el parqueadero.");
		System.out.println("4. Volver al menú anterior.");
		return input.nextInt();
	}
	private void definirplacas() {
		placas = new String[5];
		placas[0] = "ABC000 - Marca: Chevrolet - Dueño: José Obregón  - Telefono: 3000020";
		placas[1] = "ABC100 - Marca: Toyota    - Dueño: Camilo Plaza  - Telefono: 4000050";
		placas[2] = "ABC200 - Marca: Kia       - Dueño: Jorge Paredes - Telefono: 5000060";
		placas[3] = "ABC300 - Marca: Hyundai   - Dueño: Diana Plaza   - Telefono: 6000030";
		placas[4] = "ABC400 - Marca: Suzuki    - Dueño: Carmen Mora   - Telefono: 7000040";
	}
	private void parqueadero() {
		do {
			opcion = menu();  //VENGO POR AQUÍ FALTA  SEGUIR CON EL MENÚ, SI LO QUIERO RETIRAR O PARQUEAR ETC...
			if(opcion==1 && parqueado == true) { //Opcion:parquear --- y --- ya esta parqueado.
				System.out.println("El vehículo ya está en el parqueadero.");
				System.out.println(" ");
			}
			
			else if(opcion==1 && parqueado==false) {//Opcion:parquear --- y --- no esta parqueado.
				System.out.println("Bienvenido señor, ingresó su vehículo al parqueadero.");
				retirado = false; //Retirado pasa a ser falso, es decir no está retirado, si está dentro del parqueadero en este momento.
				parqueado=true;
				opcion=0;
				System.out.println(" ");
			}
			
			else if(opcion==2 && retirado==false) {//Opcion retirar --- y --- no esta retirado, es decir esta parqueado.
				System.out.println("Hasta luego, ha retirado su vehículo");
				retirado = true; 					// retirado pasa a true, es decir ya fue retirado el vehiculo.
				parqueado = false;					// y parqueado a false, es decir, no esta en el parqueadero.
				opcion=0;
				System.out.println(" ");
			}
			
			else if(opcion==2 && retirado==true) { //Opcion retirar --- y --- ya fue retirado, o no esta en el parqueadero.
				System.out.println("Señor su vehículo no está en el parqueadero.");
				System.out.println(" ");
			}
			
			else if(opcion==3 && parqueado==true) { //Opcion consultar si está o no en el parqueadero... en este caso, parqueado = true
				System.out.println("Su vehículo SI se encuentra en el parqueadero.");
				System.out.println(" ");
			}
			else if(opcion==3 && retirado==true) {
				System.out.println("Su vehiculo NO se encuentra en el parqueadero.");
				System.out.println(" ");
			}
		}while (opcion<4);	
	}
}
