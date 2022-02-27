package com.sofka.Taller2;
import java.util.Scanner;
import com.sofka.Linea;

public class Punto4 {
	private int pelicula;
	private String novedad;
	private int opcion;
	private Scanner input;

	
	public void Punto4() {
		input = new Scanner(System.in);
		Linea l = new Linea();

		informacion();
		elegirCliente();
		capturarOpcion(); 
		
		elegirOpcion();
		opcion = capturarOpcion();
		
		do {
			if (opcion == 1) {
				peliculas();
				opcion++;
			}
			else if(opcion == 2) {
				System.out.println("Confirma cual deseas ver?");
				pelicula1();
				pelicula2();
				pelicula3();
				pelicula4();
				confirmarPeli();
				opcion=4;
				}
			else if (opcion == 3) {
				devolverPeli();
			}
			else {
				System.out.println("Opción incorrecta.");
			}
		}while(opcion<4);
		l.Linea();
	}
	private void informacion() {
		System.out.println("    INFORMACION DEL PUNTO 4");
		System.out.println("APLICACION PARA UNA VIDEO TIENDA");
	}
	
		private void elegirCliente() {
			System.out.println("BIENVENIDO A LA VIDEO TIENDA DEL PORVENIR");
			System.out.println("¿Cuál es tu nombre de usuario?");
			System.out.println("1. Camilo");
			System.out.println("2. Juan");
			System.out.println("3. Carlos");
		}
		
		private void elegirOpcion() {
			System.out.println("Elige una opción.");
			System.out.println("1. Consultar películas disponibles.");
			System.out.println("2. Alquilar película.");
			System.out.println("3. Para devolver película.");
		}
		
		private void peliculas() {
			System.out.println("Películas disponibles: 1.Casa del terror 2.Guerra mundial Z 3.Mi pequeño angelito I 4.Mi pequeño angelito II");
		}
		
		private void confirmarPeli() {
			pelicula = input.nextInt();
			System.out.println("pelicula " + pelicula + " alquilada.");
		}
		
		private void devolverPeli() {
			System.out.println("Película recibida, escriba por favor el estado de la película si presentó algún daño u otra novedad");
			Scanner entrada = new Scanner(System.in);
			novedad = entrada.nextLine();
//			entrada.close();
		}
		
		private int capturarOpcion() {
			Scanner entrada = new Scanner(System.in);
			return Integer.parseInt(entrada.nextLine());
		}
		
		private void pelicula1() {
			System.out.println("1.Casa del terror");
		}
		
		private void pelicula2() {
			System.out.println("2.Guerra mundial Z");
		}
		private void pelicula3() {
			System.out.println("3.Mi pequeño angelito");
		}
		private void pelicula4() {
			System.out.println("4.Mi pequeño angelito II");
		}
	}