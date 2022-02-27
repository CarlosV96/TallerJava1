package com.sofka.Taller2;

import java.util.Scanner;

import com.sofka.Linea;

public class Punto7 {
	private String nombre;
	private double peso, imc, estatura;
	private Scanner input;
	
	public void Punto7() {
		input = new Scanner(System.in);
		Linea l = new Linea();
		informacion();
		
		nombre = capturarNombre();
		peso = capturarPeso();
		estatura = capturarEstatura();
		imc = (peso)/Math.pow(estatura,2);
		
		if(imc<=18.5) {
			System.out.println(nombre + " Su imc es de " + imc + " y estás bajo de peso.");	
		}else if(imc>18.5 && imc<=24.9){
			System.out.println(nombre + " Su imc es de " + imc + " y estás en el rango de lo normal.");
		}else if(imc>25 && imc<=29.9) {
			System.out.println(nombre + " Su imc es de " + imc + " y estás con sobrepeso");
		}else if(imc>30) {
			System.out.println(nombre + " Su imc es de " + imc + " y estás sufriendo de obesidad");
		}
		l.Linea();
	}
	private void informacion() {
		System.out.println("                   INFORMACION DEL PUNTO 7");
		System.out.println("APLICACION PARA CALCULAR EL IMC DE LAS PERSONAS Y EMITIR UN MENSAJE.");
	}
	
	private String capturarNombre(){
		System.out.println("Escriba su nombre");
		return input.nextLine();
	}
	
	private double capturarPeso() {
		System.out.println("Escriba su peso en kilogramos");
		return input.nextDouble();
	}
	
	private double capturarEstatura() {
		System.out.println("Escriba su estatura en metros");
		return input.nextDouble();
	}
	
}
