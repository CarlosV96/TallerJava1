package com.sofka.Taller4;
import java.util.Scanner;

import com.sofka.Linea;

public class Punto5 {
	private int fila,columna;
	private int[][] tabla;
	private Scanner input;
	
	public void Punto5() {
		input = new Scanner(System.in);
		tabla = new int[10][10];
		Linea l = new Linea();
		informacion();
		multiplicacion();
		
		tablaImpresa();
		resultado();
		l.Linea();
		
	}
	private void informacion() {
		System.out.println("                           INFORMACION DEL PUNTO 5");
		System.out.println("SOLICITAR FILA Y COLUMNA Y MOSTRAR EL RESULTADO QUE DEBE ESTAR PREVIAMENTE CALCULADO.");
		System.out.println(" ");
	}
	
	private void tablaImpresa() {
		System.out.println("                         COLUMNAS");
		System.out.println("      0    1    2    3    4    5    6    7    8    9");
		System.out.println("  0  1X1  2X1  3X1  4X1  5X1  6X1  7X1  8X1  9X1  10X1");
		System.out.println("  1  1X2  2X2  3X2  4X2  5X2  6X2  7X2  8X2  9X2  10X2");
		System.out.println("  2  1X3  2X3  3X3  4X3  5X3  6X3  7X3  8X3  9X3  10X3");
		System.out.println("F 3  1X4  2X4  3X4  4X4  5X4  6X4  7X4  8X4  9X4  10X4");
		System.out.println("I 4  1X5  2X5  3X5  4X5  5X5  6X5  7X5  8X5  9X5  10X5");
		System.out.println("L 5  1X6  2X6  3X6  4X6  5X6  6X6  7X6  8X6  9X6  10X6");
		System.out.println("A 6  1X7  2X7  3X7  4X7  5X7  6X7  7X7  8X7  9X7  10X7");
		System.out.println("S 7  1X8  2X8  3X8  4X8  5X8  6X8  7X8  8X8  9X8  10X8");
		System.out.println("  8  1X9  2X9  3X9  4X9  5X9  6X9  7X9  8X9  9X9  10X9");
		System.out.println("  9  1X10 2X10 3X10 4X10 5X10 6X10 7X10 8X10 9X10 10X10");
		System.out.println(" ");
	}
	
	private int fila() {
		System.out.println("Ingresa la fila que deseas ver.");
		return input.nextInt();
	}
	
	private int columna() {
		System.out.println("Ingresa la columna que deseas ver.");
		return input.nextInt();
	}
	
	private void multiplicacion() {
		tabla[0][0] = 1*1; 
		tabla[0][1] = 2*1; 
		tabla[0][2] = 3*1; 
		tabla[0][3] = 4*1; 
		tabla[0][4] = 5*1; 
		tabla[0][5] = 6*1; 
		tabla[0][6] = 7*1; 
		tabla[0][7] = 8*1; 
		tabla[0][8] = 9*1; 
		tabla[0][9] = 10*1; 
		
		tabla[1][0] = 1*2; 
		tabla[1][1] = 2*2; 
		tabla[1][2] = 3*2; 
		tabla[1][3] = 4*2; 
		tabla[1][4] = 5*2; 
		tabla[1][5] = 6*2; 
		tabla[1][6] = 7*2; 
		tabla[1][7] = 8*2; 
		tabla[1][8] = 9*2; 
		tabla[1][9] = 10*2;
		
		tabla[2][0] = 1*3; 
		tabla[2][1] = 2*3; 
		tabla[2][2] = 3*3; 
		tabla[2][3] = 4*3; 
		tabla[2][4] = 5*3; 
		tabla[2][5] = 6*3; 
		tabla[2][6] = 7*3; 
		tabla[2][7] = 8*3; 
		tabla[2][8] = 9*3; 
		tabla[2][9] = 10*3;
		
		tabla[3][0] = 1*4; 
		tabla[3][1] = 2*4; 
		tabla[3][2] = 3*4; 
		tabla[3][3] = 4*4; 
		tabla[3][4] = 5*4; 
		tabla[3][5] = 6*4; 
		tabla[3][6] = 7*4; 
		tabla[3][7] = 8*4; 
		tabla[3][8] = 9*4; 
		tabla[3][9] = 10*4;
		
		tabla[4][0] = 1*5; 
		tabla[4][1] = 2*5; 
		tabla[4][2] = 3*5; 
		tabla[4][3] = 4*5; 
		tabla[4][4] = 5*5; 
		tabla[4][5] = 6*5; 
		tabla[4][6] = 7*5; 
		tabla[4][7] = 8*5; 
		tabla[4][8] = 9*5; 
		tabla[4][9] = 10*5;
		
		tabla[5][0] = 1*6; 
		tabla[5][1] = 2*6; 
		tabla[5][2] = 3*6; 
		tabla[5][3] = 4*6; 
		tabla[5][4] = 5*6; 
		tabla[5][5] = 6*6; 
		tabla[5][6] = 7*6; 
		tabla[5][7] = 8*6; 
		tabla[5][8] = 9*6; 
		tabla[5][9] = 10*6;
		
		tabla[6][0] = 1*7; 
		tabla[6][1] = 2*7; 
		tabla[6][2] = 3*7; 
		tabla[6][3] = 4*7; 
		tabla[6][4] = 5*7; 
		tabla[6][5] = 6*7; 
		tabla[6][6] = 7*7; 
		tabla[6][7] = 8*7; 
		tabla[6][8] = 9*7; 
		tabla[6][9] = 10*7;
		
		tabla[7][0] = 1*8; 
		tabla[7][1] = 2*8; 
		tabla[7][2] = 3*8; 
		tabla[7][3] = 4*8; 
		tabla[7][4] = 5*8; 
		tabla[7][5] = 6*8; 
		tabla[7][6] = 7*8; 
		tabla[7][7] = 8*8; 
		tabla[7][8] = 9*8; 
		tabla[7][9] = 10*8;
		
		tabla[8][0] = 1*9; 
		tabla[8][1] = 2*9; 
		tabla[8][2] = 3*9; 
		tabla[8][3] = 4*9; 
		tabla[8][4] = 5*9; 
		tabla[8][5] = 6*9; 
		tabla[8][6] = 7*9; 
		tabla[8][7] = 8*9; 
		tabla[8][8] = 9*9; 
		tabla[8][9] = 10*9;
		
		tabla[9][0] = 1*10; 
		tabla[9][1] = 2*10; 
		tabla[9][2] = 3*10; 
		tabla[9][3] = 4*10; 
		tabla[9][4] = 5*10; 
		tabla[9][5] = 6*10; 
		tabla[9][6] = 7*10; 
		tabla[9][7] = 8*10; 
		tabla[9][8] = 9*10; 
		tabla[9][9] = 10*10;
	}

	private void resultado() {
		fila = fila();
		columna = columna();
		System.out.println("INFORMACION DE LA CELDA.");
		System.out.println("        " + (columna+1) + "X" + (fila+1));
		System.out.println("      RESULTADO"); 
		System.out.println("         " + tabla[fila][columna]);
	}
}
