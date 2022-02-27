package com.sofka.Taller1;
import java.util.Scanner;

import com.sofka.Linea;

public class Punto3 {
	private String nombre;
	private String nombreP;
	private String nombreM;
	private Scanner input;
	
	public void Punto3() {
		input = new Scanner(System.in);
		Linea l = new Linea();
		
		informacion();
		
		SolicitarNombre();
		nombre = CapturarDato();
		
		SolicitarNombreMama();
		nombreM = CapturarDato();
		
		SolicitarNombrePapa();
		nombreP = CapturarDato();
		
		Escribir();
		l.Linea();
	}
	
	private void informacion() {
		System.out.println("                    INFORMACION DEL PUNTO 3");
		System.out.println("SOLICITAR NOMBRE, NOMBRE DEL PADRE Y DE LA MADRE E IMPRIMIR UN MENSAJE");
	}
	
	private void SolicitarNombre() {
		System.out.println("Por favor digite su nombre completo");
	}
	
	private void SolicitarNombreMama() {
		System.out.println("Por favor digite el nombre completo de su madre.");
	}
	
	private void SolicitarNombrePapa() {
		System.out.println("Por favor digite el nombre completo de su padre.");
	}
	
	private String CapturarDato() {
		return input.nextLine();
	}
	private void Escribir() {
		System.out.println("Yo " + nombre + " soy hijo de " + nombreM + " y de " + nombreP);
	}
}
