package com.sofka.Taller2;

import java.util.Scanner;

import com.sofka.Linea;

public class Punto9 {
	private String estudiante;
	private Scanner input;
	private int opcion, largo, ancho, base, altura, base1, base2;
	
	public void Punto9() {
		input = new Scanner(System.in);
		Linea l = new Linea();
		
		informacion(); 
		
		estudiante = capturarNombre();
		opcion = mensaje();
		
		if(opcion==1) {
			System.out.println("Digita por favor los siguientes valores para obtener el área del rectangulo.");
			largo();
			ancho();
			areaR();
		}else if(opcion==2) {
			System.out.println("Digita por favor los siguientes valores para obtener el área del triangulo.");
			base();
			altura();
			areaT();
		}else if(opcion==3) {
			System.out.println("Digita por favor los siguientes valores para obtener el área del trapecio");
			base1();
			base2();
			altura();
			areaTra();
		}else {
			System.out.println("Opción incorrecta.");
		}
		l.Linea();
	}
	
	private void informacion() {
		System.out.println("                       INFORMACION DEL PUNTO 9");
		System.out.println("APLICACION QUE PERMITE CALCULAR EL AREA DE UNA DETERMINADA FIGURA GEOMETRICA");
	}
	
	private String capturarNombre(){
		System.out.println("Escriba su nombre");
		return input.nextLine();
	}
	
	private int mensaje() {
		System.out.println(estudiante + " ¿Qué área deseas calcular? " + "Elije una opción.");
		System.out.println("1. Área de un rectángulo.");
		System.out.println("2. Área de un tríangulo.");
		System.out.println("3. Área de un trapecio.");
		return input.nextInt();
	}
	private int largo() {
		System.out.println("Valor del largo");
		return largo = input.nextInt();
	}
	private int ancho() {
		System.out.println("Valor del ancho");
		return ancho = input.nextInt();
	}
	private void areaR() {
		int recta;
		recta = largo*ancho;
		System.out.println("El valor del área del rectángulo es de " + recta);
	}
	private int base() {
		System.out.println("Valor de la base");
		return base = input.nextInt();
	}
	private int altura() {
		System.out.println("Valor de la altura");
		return altura = input.nextInt();
	}
	private void areaT() {
		int tria;
		tria = base*altura/2;
		System.out.println("El valor del área del triángulo es de " + tria);
	}
	private int base1() {
		System.out.println("Valor de la base1");
		return base1 = input.nextInt();
	}
	private int base2() {
		System.out.println("Valor de la base2");
		return base2 = input.nextInt();
	}
	private void areaTra() {
		int tra;
		tra = (base1 + base2)*altura/2;
		System.out.println("El valor del área del trapecio es de " + tra);
	}
}
