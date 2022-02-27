package com.sofka.Taller4;
import com.sofka.Linea;

public class Punto2 {
	private int[] num;
	private int i;
	
	public void Punto2() {
		num = new int[20];	
		Linea l = new Linea();
		
		informacion();
		escribirNum();
		imprimirNum();
		par();
		impar();
		l.Linea();
	}
	
	private void informacion() {
		System.out.println("                                INFORMACIÓN DEL PUNTO 2");
		System.out.println("CREAR ARREGLO DE 20 NUMEROS AL AZAR DEL 1 AL 100, Y DE ESTOS IMPRIMIR NUMEROS PARES E IMPARES.");
		System.out.println(" ");
	}
	
	private void escribirNum() {
		for(i=0; i<=19; i++) {
			num[i] = (int) Math.floor(Math.random()*(100-1+1)+1);
		}
	}
	
	private void imprimirNum() {
		for(i=0;i<=19; i++) {
		System.out.print(num[i]);
		System.out.print(" ");	
		}
		System.out.println(" ");
	}
	
	private void par() {
		for (i=0;i<=19;i++) {
			if (num[i]%2 == 0) {
				System.out.print(num[i]);
				System.out.print(" ");
			}
		}
		System.out.println(" ");
	}
	
	private void impar() {
		for (i=0;i<=19;i++) {
			if (num[i]%2 == 1) {
				System.out.print(num[i]);
				System.out.print(" ");
			}
		}
		System.out.println(" ");
	}
}
