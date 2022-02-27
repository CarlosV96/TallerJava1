package com.sofka.Taller1;
import java.util.Scanner;

import com.sofka.Linea;

public class Punto1 {

    private String nombre;
    private String apellidos;
    private Scanner input;

    public void Punto1() {
    	input = new Scanner(System.in);
    	Linea l = new Linea();
    	
    	informacion();
        solicitarNombre();
        nombre = capturarDato();

        solicitarApellido();
        apellidos = capturarDato();
        
        l.Linea();
    }
    private void informacion() {
		System.out.println("   INFORMACION DEL PUNTO 1");
		System.out.println("SOLICITAR NOMBRE Y APELLIDOS");
	}

    private void solicitarNombre() {
        System.out.println("Por favor digite su nombre");
    }

    private void solicitarApellido() {
        System.out.println("Por favor digite su apellido");
    }

    private String capturarDato() {
        return input.nextLine();
    }
}
