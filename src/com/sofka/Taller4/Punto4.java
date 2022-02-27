package com.sofka.Taller4;

import com.sofka.Linea;

public class Punto4 {
	private String[][] matrizBi;
	private int fila, columna;
	
	public void Punto4() {
		matrizBi = new String[4][5];
		Linea l = new Linea();
		matriz();
		
		informacion();
		matriz1();
		matriz2();
		matriz3();
		matriz4();
		l.Linea();
		
	}
	
	private void informacion() {
		System.out.println("     INFORMACIÓN DEL PUNTO 4");
		System.out.println("IMPRIMIR UNA MATRIZ BIDIMENSIONAL");
		System.out.println(" ");
	}
	
	private void matriz1() {
		for(columna=0;columna<=4;columna++) {
			System.out.print(matrizBi[fila][columna]);
			System.out.print(" ");
		}
		System.out.println(" ");
		fila++;
	}
	
	private void matriz2() {
		for(columna=4;columna>=0;columna--) {
			System.out.print(matrizBi[fila][columna]);
			System.out.print(" ");
		}
		System.out.println(" ");
		fila++;
	}
	
	private void matriz3() {
		for(columna=0;columna<=4;columna++) {
			System.out.print(matrizBi[fila][columna]);
			System.out.print(" ");
		}
		System.out.println(" ");
		fila++;
	}
	
	private void matriz4() {
		for(columna=4;columna>=0;columna--) {
			System.out.print(matrizBi[fila][columna]);
			System.out.print(" ");
		}
		System.out.println(" ");
	}
	
	private void matriz() {
		matrizBi[0][0] = "01";
		matrizBi[0][1] = "02";
		matrizBi[0][2] = "03";
		matrizBi[0][3] = "04";
		matrizBi[0][4] = "05";
		
		matrizBi[1][0] = "06";
		matrizBi[1][1] = "07";
		matrizBi[1][2] = "08";
		matrizBi[1][3] = "09";
		matrizBi[1][4] = "10";
		
		matrizBi[2][0] = "11";
		matrizBi[2][1] = "12";
		matrizBi[2][2] = "13";
		matrizBi[2][3] = "14";
		matrizBi[2][4] = "15";
		
		matrizBi[3][0] = "16";
		matrizBi[3][1] = "17";
		matrizBi[3][2] = "18";
		matrizBi[3][3] = "19";
		matrizBi[3][4] = "20";
	}
}
