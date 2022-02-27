package com.sofka.Taller3;
import com.sofka.Linea;

public class Punto1 {
	private int a, b;
	
	public void Punto1() {
		Linea l = new Linea();
		
		for(a = 1; a <= 10; a++) {
			for(b = 1; b <= a; b++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		l.Linea();
	}
}
