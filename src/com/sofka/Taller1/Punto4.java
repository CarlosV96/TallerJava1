package com.sofka.Taller1;
import java.util.Scanner;

import com.sofka.Linea;

public class Punto4 {
	private String ciudad;
	private String pais;
	private Scanner input;
	
	public void Punto4() {
		input = new Scanner(System.in);
		Linea l = new Linea();
		
		informacion();
		solicitarCiudad();
		ciudad = capturarDato();
		
		solicitarPais();
		pais = capturarDato();
		
		escribir();
		l.Linea();
	}
	private void informacion() {
		System.out.println("                INFORMACION DEL PUNTO 4");
		System.out.println("SOLICITAR UNA CIUDAD CAPITAL, Y EL PAIS, E IMPRIMIR UN MENSAJE.");
	}
	
	private void solicitarCiudad() {
		System.out.println("Diga por favor una ciudad capital.");
	}
	
	private void solicitarPais() {
		System.out.println("Digite por favor el país de esta ciudad capital.");
	}
	
	private String capturarDato() {
		return input.nextLine();
	}
	
	private void escribir() {
		System.out.println("La ciudad " + ciudad + " es la capital del país " + pais);
	}
}
