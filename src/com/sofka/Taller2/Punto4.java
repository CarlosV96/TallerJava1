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
				System.out.println("Opci�n incorrecta.");
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
			System.out.println("�Cu�l es tu nombre de usuario?");
			System.out.println("1. Camilo");
			System.out.println("2. Juan");
			System.out.println("3. Carlos");
		}
		
		private void elegirOpcion() {
			System.out.println("Elige una opci�n.");
			System.out.println("1. Consultar pel�culas disponibles.");
			System.out.println("2. Alquilar pel�cula.");
			System.out.println("3. Para devolver pel�cula.");
		}
		
		private void peliculas() {
			System.out.println("Pel�culas disponibles: 1.Casa del terror 2.Guerra mundial Z 3.Mi peque�o angelito I 4.Mi peque�o angelito II");
		}
		
		private void confirmarPeli() {
			pelicula = input.nextInt();
			System.out.println("pelicula " + pelicula + " alquilada.");
		}
		
		private void devolverPeli() {
			System.out.println("Pel�cula recibida, escriba por favor el estado de la pel�cula si present� alg�n da�o u otra novedad");
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
			System.out.println("3.Mi peque�o angelito");
		}
		private void pelicula4() {
			System.out.println("4.Mi peque�o angelito II");
		}
	}