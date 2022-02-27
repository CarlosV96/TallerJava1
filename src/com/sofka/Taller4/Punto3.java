package com.sofka.Taller4;
import com.sofka.Linea;

public class Punto3 {
	private int i, a, b, contador;
	private int[] vector;
	
	public void Punto3() {
		vector = new int[200];
		b = 0;
		Linea l = new Linea();
		
		
		
		informacion();
		ObtenerNumeros();
		ImprimirNumeros();
		l.Linea();

	}
	
	private void informacion() {
		System.out.println("              INFORMACIÓN DEL PUNTO 3");
		System.out.println("IMPRIMIR TODOS LOS NUMEROS PRIMOS DEL 1 AL 1000");
		System.out.println(" ");
	}
	
	private void ObtenerNumeros() {
		
		for(i=0;i<=1000;i++) {
			a=1;
			contador=0;
			
			while(a<=i) {
				if(i%a == 0) {
					contador++;
				}
				a++;
			}
			
			if (contador==2) {
				vector[b] = i;
				b++;
			}
		}
	}
	
	private void ImprimirNumeros() {
		for(i=0;i<=167;i++) {
		System.out.print(vector[i]);
		System.out.print(" ");
		}
		System.out.println(" ");
	}

}
