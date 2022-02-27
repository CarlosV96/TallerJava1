package com.sofka.Taller3;

import com.sofka.Linea;

public class Punto3 {
	private int fila, i, j;
	
	public void Punto3(){
		Linea l = new Linea();
		
		do {
			j = 0;
			fila = 1;
			if (fila==1) {
				fila++;
				do {
					j++;
					if(j<=10 || j>= 10+2){ //Entonces escribe espacio
						System.out.print(" ");
					}else if (j > 10 && j < 10+2) {
						System.out.print("*");
					}
				}while(j<21);
				System.out.println(" ");
			}
			
			if (fila==2) {
				tronco();
			}
			
			if (fila==3) {
				j=0;
				fila++;
				do {
					j++;
					if(j<=10-2 || j>= 10+2){ //Entonces escribe espacio
						System.out.print(" ");
					}else if (j > 10 && j < 10+2) {
						System.out.print("*****");
					}
				}while(j<21);
				System.out.println(" ");
			}
			
			if (fila==4) {
				j=0;
				fila++;
				do {
					j++;
					if(j<=10-3 || j>= 10+2){ //Entonces escribe espacio
						System.out.print(" ");
					}else if (j > 10 && j < 10+2) {
						System.out.print("*******");
					}
				}while(j<21);
				System.out.println(" ");
			}
			
			if (fila==5) {
				j=0;
				fila++;
				do {
					j++;
					if(j<=10-4 || j>= 10+2){ //Entonces escribe espacio
						System.out.print(" ");
					}else if (j > 10 && j < 10+2) {
						System.out.print("*********");
					}
				}while(j<21);
				System.out.println(" ");
			}
			
			if (fila==6) {
				j=0;
				fila++;
				do {
					j++;
					if(j<=10-5 || j>= 10+2){ //Entonces escribe espacio
						System.out.print(" ");
					}else if (j > 10 && j < 10+2) {
						System.out.print("***********");
					}
				}while(j<21);
				System.out.println(" ");
			}
			
			if (fila==7) {
				j=0;
				fila++;
				do {
					j++;
					if(j<=10-6 || j>= 10+2){ //Entonces escribe espacio
						System.out.print(" ");
					}else if (j > 10 && j < 10+2) {
						System.out.print("*************");
					}
				}while(j<21);
				System.out.println(" ");
			}
			
			if (fila==8) {
				j=0;
				fila++;
				do {
					j++;
					if(j<=10-7 || j>= 10+2){ //Entonces escribe espacio
						System.out.print(" ");
					}else if (j > 10 && j < 10+2) {
						System.out.print("***************");
					}
				}while(j<21);
				System.out.println(" ");
			}
			
			if (fila==9) {
				j=0;
				fila++;
				do {
					j++;
					if(j<=10-8 || j>= 10+2){ //Entonces escribe espacio
						System.out.print(" ");
					}else if (j > 10 && j < 10+2) {
						System.out.print("*****************");
					}
				}while(j<21);
				System.out.println(" ");
			}
			
			if (fila==10) {
				j=0;
				fila++;
				do {
					j++;
					if(j<=10-9 || j>= 10+2){ //Entonces escribe espacio
						System.out.print(" ");
					}else if (j > 10 && j < 10+2) {
						System.out.print("*******************");
					}
				}while(j<21);
				System.out.println(" ");
			}
			
			if (fila==11) {
				j=0;
				fila++;
				do {
					j++;
					if(j<=0 || j>= 10+2){ //Entonces escribe espacio
						System.out.print(" ");
					}else if (j > 10 && j < 10+2) {
						System.out.print("*********************");
					}
				}while(j<21);
				System.out.println(" ");
			}
			
			if (fila==12) {
				tronco();
			}
			
			if (fila==13) {
				tronco();
			}
			
			if (fila==14) {
				j=0;
				fila++;
				do {
					j++;
					if(j<=10-2 || j>= 10+2){ //Entonces escribe espacio
						System.out.print(" ");
					}else if (j > 10 && j < 10+2) {
						System.out.print("*****");
					}
				}while(j<21);
				System.out.println(" ");
			}
			
			if (fila==15) {
				j=0;
				fila++;
				do {
					j++;
					if(j<=10-3 || j>= 10+2){ //Entonces escribe espacio
						System.out.print(" ");
					}else if (j > 10 && j < 10+2) {
						System.out.print("*******");
					}
				}while(j<21);
				System.out.println(" ");
			}
		} while(j < 21);
		l.Linea();
	}
	
	private void tronco() {
		j = 0;
		fila++;
		do {
			j++;
			if(j<=10-1 || j>= 10+2){ //Entonces escribe espacio
				System.out.print(" ");
			}else if (j > 10 && j < 10+2) {
				System.out.print("***");
			}
		}while(j<21);
		System.out.println(" ");
	}
}
