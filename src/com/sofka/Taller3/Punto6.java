package com.sofka.Taller3;
import java.util.Scanner;

import com.sofka.Linea;

public class Punto6 {
	private int opcion, a, eliminar;
	private Scanner input;
	private boolean agregar1, agregar2, agregar3;
	
	public void Punto6() {
		Linea l = new Linea();
		input = new Scanner(System.in);
		String[] contacto1 = new String[3];
		String[] contacto2 = new String[3];
		String[] contacto3 = new String[3];
		agregar1 = false;
		agregar2 = false;
		a=0;
		
		informacion();
		
		do {
			//Guardar contacto 1
			while(a==0) {
				opcion = menu();
				if(opcion==1) {
					agregar1 = true;
					agregar1(contacto1);
					a++;
				}
				else if(opcion==2 && agregar1 == false) {  //Si doy en ver contactos, pero no he guardado ninguno arroja esto.
					System.out.println("NO HAS AGREGADO NINGÚN CONTACTO");
				}
				else if(opcion==3 && agregar1 == false) { //Si doy en eliminar contactos y no he guardado uno, arroja esto.
					System.out.println("NO HAS GUARDADO NINGÚN CONTACTO");
				}
				else {
					System.out.println("HASTA PRONTO");
					a = 4;
				}
			}
			
			//Guardar contacto 2
			while (a==1) {
				opcion= menu2();
				if(opcion==1) {
					agregar2 = true;
					agregar2(contacto2);
					a++;
				}
				else if(opcion==2 && agregar2 == false) {
					imprimirDatos(contacto1);
				}
				else if(opcion==3 && agregar2 == false) { //Si doy en eliminar contactos y no he guardado uno, arroja esto.
					System.out.println("¿ELIMINAR CONTACTO 1?");
					System.out.println("1. Para si.");
					System.out.println("2. Para no.");
					eliminar = eliminar();
					if (eliminar == 1) {
						a = 0;
						agregar1 = false;
					}
				}
				else {
					System.out.println("HASTA PRONTO");
					a = 4;
				}
			}
			//Guardar contacto 3
			while (a==2) {
				opcion= menu3();
				if(opcion==1) {
					agregar3 = true;
					agregar3(contacto3);
					a++;
				}
				else if(opcion==2 && agregar3 == false) {
					imprimirDatos(contacto1);
					imprimirDatos2(contacto2);
				}
				else if(opcion==3 && agregar3 == false) { //Si doy en eliminar contactos y no he guardado uno, arroja esto.
					System.out.println("¿ELIMINAR CONTACTO 2?");
					System.out.println("1. Para si.");
					System.out.println("2. Para no.");
					eliminar = eliminar();
					if (eliminar == 1) {
						a = 1;
						agregar2 = false;
					}
				}
				else {
					System.out.println("HASTA PRONTO");
					a = 4;
				}
			}//Memoria llena
			while (a==3) {
				opcion=menu4();
				if(opcion==2) {
					imprimirDatos(contacto1);
					imprimirDatos2(contacto2);
					imprimirDatos3(contacto3);
				}
				else if(opcion==3) {
					System.out.println("¿ELIMINAR CONTACTO 3?");
					System.out.println("1. Para si.");
					System.out.println("2. Para no.");
					eliminar = eliminar();
					if (eliminar == 1) {
						a = 2;
						agregar3 = false;
					}
				}else {
					System.out.println("HASTA PRONTO");
					a = 4;
				}
			}
		}while(opcion<4);	
		l.Linea();
	}
	private void informacion() {
		System.out.println("              INFORMACION DEL PUNTO 6");
		System.out.println("APLICACION QUE PERMITA ALMANCENAR CONTACTOS TELEFONICOS.");
	}
	
	private int menu() {
		System.out.println("Menu de usuario");
		System.out.println("1. Añadir contacto 1.");
		System.out.println("2. Ver contactos almacenados");
		System.out.println("3. Eliminar contactos.");
		System.out.println("4. Salir del sistema.");
		return input.nextInt();
	}
	
	private int menu2() {
		System.out.println("Menu de usuario");
		System.out.println("1. Añadir contacto 2.");
		System.out.println("2. Ver contactos almacenados");
		System.out.println("3. Eliminar contactos.");
		System.out.println("4. Salir del sistema.");
		return input.nextInt();
	}
	
	private int menu3() {
		System.out.println("Menu de usuario");
		System.out.println("1. Añadir contacto 3.");
		System.out.println("2. Ver contactos almacenados");
		System.out.println("3. Eliminar contactos.");
		System.out.println("4. Salir del sistema.");
		return input.nextInt();
	}
	
	private int menu4() {
		System.out.println("Menu de usuario");
		System.out.println("MEMORIA LLENA");
		System.out.println("2. Ver contactos almacenados");
		System.out.println("3. Eliminar contactos.");
		System.out.println("4. Salir del sistema.");
		return input.nextInt();
	}
	
	private String capturarDato(String pregunta){
		System.out.println(pregunta);
		Scanner input = new Scanner(System.in);
		return input.nextLine();
	}
	
	private int eliminar() {
		return input.nextInt();
	}
	
	private void agregar1(String[] contacto1) {
		contacto1[0] = capturarDato("Escribe el nombre de la persona");
		contacto1[1] = capturarDato("Digita el numero telefonico");
		contacto1[2] = capturarDato("Organización");
		}
	
	private void agregar2(String[] contacto2) {
		contacto2[0] = capturarDato("Escribe el nombre de la persona");
		contacto2[1] = capturarDato("Digita el numero telefonico");
		contacto2[2] = capturarDato("Organización");
	}
	
	private void agregar3(String[] contacto3) {
		contacto3[0] = capturarDato("Escribe el nombre de la persona");
		contacto3[1] = capturarDato("Digita el numero telefonico");
		contacto3[2] = capturarDato("Organización");
	}
	
	private void imprimirDatos(String[] contacto) {
		System.out.println("CONTACTO 1");
		System.out.println("Nombre: " + contacto[0]);
		System.out.println("Telefono: " + contacto[1]);
		System.out.println("Organización: " + contacto[2]);
		System.out.println("");
	}
	
	private void imprimirDatos2(String[] contacto) {
		System.out.println("CONTACTO 2");
		System.out.println("Nombre: " + contacto[0]);
		System.out.println("Telefono: " + contacto[1]);
		System.out.println("Organización: " + contacto[2]);
		System.out.println("");
	}
	
	private void imprimirDatos3(String[] contacto) {
		System.out.println("CONTACTO 3");
		System.out.println("Nombre: " + contacto[0]);
		System.out.println("Telefono: " + contacto[1]);
		System.out.println("Organización: " + contacto[2]);
		System.out.println("");
	}
}