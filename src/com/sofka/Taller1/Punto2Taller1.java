package com.sofka.Taller1;
import java.util.Scanner;

import com.sofka.Linea;

public class Punto2Taller1 {
	private String nombre;
	private String apellidos;
	private int edad;
	private double estatura;
	private Scanner input;
	
	
	public void Punto2Taller1() {
		input = new Scanner(System.in);
		Linea l = new Linea();
		
		informacion();
		
		solicitarNombre();
        nombre = capturarDato();

        solicitarApellido();
        apellidos = capturarDato();
        
        solicitarEdad();
        edad = capturarDatoInt();
        
        solicitarEstatura();
        estatura = capturarDatoDouble();
        
        l.Linea();
    }
	
	private void informacion() {
		System.out.println("          INFORMACION DEL PUNTO 2");
		System.out.println("SOLICITAR NOMBRE, APELLIDOS, EDAD Y ESTATURA.");
	}

    private void solicitarNombre() {
        System.out.println("Por favor digite su nombre");
    }

    private void solicitarApellido() {
        System.out.println("Por favor digite su apellido");
    }
    
    private void solicitarEdad() {
        System.out.println("Por favor diga su edad");
    }
    
    private void solicitarEstatura() {
        System.out.println("Por favor diga su estatura");
    }

    private String capturarDato() {
        return input.nextLine();
    }
    
    private int capturarDatoInt() {
        return input.nextInt();
    }

    private double capturarDatoDouble() {
        return input.nextDouble();
    }


}
