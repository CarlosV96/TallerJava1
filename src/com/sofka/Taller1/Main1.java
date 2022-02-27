package com.sofka.Taller1;
import java.io.IOException;
import java.util.Scanner;

import com.sofka.Linea;

public class Main1 {

    private static boolean bandera = true;
    private static int opcion;
	private static Scanner input;

    public static void main1(String[] args) throws IOException {
    	Linea l = new Linea();
    	
        do {
            menu();
            opcion = capturarOpcion();
            bandera = evaluarOpcion(opcion);
        } while (bandera == true);
        l.Linea();
    }

    private static void menu() {
        System.out.println("Escoja un punto del Taller 1");
        System.out.println("1. Punto #1");
        System.out.println("2. Punto #2");
        System.out.println("3. Punto #3");
        System.out.println("4. Punto #4");
        System.out.println("5. Punto #5");
        System.out.println("0. Salir del taller");
    }

    private static int capturarOpcion() {
        input = new Scanner(System.in);
        return input.nextInt();
    }

    private static boolean evaluarOpcion(int opcion) throws IOException {
        switch (opcion) {
            case 1:
                Punto1 p1 = new Punto1();
                p1.Punto1();
                return true;
       
            case 2:
                Punto2Taller1 p2 = new Punto2Taller1();
                p2.Punto2Taller1();
                return true;
                
            case 3:
                Punto3 p3 = new Punto3();
                p3.Punto3();
                return true;
                
            case 4:
                Punto4 p4 = new Punto4();
                p4.Punto4();
                return true;
                
            case 5:
                Punto5 p5 = new Punto5();
                p5.Punto5();
                return true;
        
            case 0:
                return false;
           
            default:
                System.out.println("Opción incorrecta.");
                System.in.read();
        }
        return true;
    }
}
