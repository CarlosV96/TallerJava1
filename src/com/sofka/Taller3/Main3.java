package com.sofka.Taller3;
import java.io.IOException;
import java.util.Scanner;

import com.sofka.Linea;

public class Main3 {

    private static boolean bandera = true;
    private static int opcion;
    private static Scanner input;

    public static void main3(String[] args) throws IOException {
    	input = new Scanner(System.in);
    	Linea l = new Linea();
    	
        do {
            menu();
            opcion = capturarOpcion();
            bandera = evaluarOpcion(opcion);
        } while (bandera == true);
        l.Linea();
    }

    private static void menu() {
        System.out.println("Escoja un punto del Taller 3");
        System.out.println("1. Punto #1");
        System.out.println("2. Punto #2");
        System.out.println("3. Punto #3");
        System.out.println("4. Punto #4");
        System.out.println("5. Punto #5");
        System.out.println("6. Punto #6");
        System.out.println("7. Punto #7");
        System.out.println("8. Punto #8");
        System.out.println("0. Salir del taller");
    }

    private static int capturarOpcion() {
    	int resultado = input.nextInt();
    	input.nextLine(); 
		return resultado;
//      return Integer.parseInt(input.nextLine());
    }

    private static boolean evaluarOpcion(int opcion) throws IOException {
        switch (opcion) {
            case 1:
                Punto1 p1 = new Punto1();
                p1.Punto1();
                return true;
       
            case 2:
                Punto2 p2 = new Punto2();
                p2.Punto2();
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
            
            case 6:
                Punto6 p6 = new Punto6();
                p6.Punto6();
                return true;
                
            case 7:
                Punto7 p7 = new Punto7();
                p7.Punto7();
                return true;
                
            case 8:
                Punto8 p8 = new Punto8();
                p8.Punto8();
                return true;
//                
//            case 9:
//                Punto9 p9 = new Punto9();
//                p9.Punto9();
//                return true;
//                
//            case 10:
//                Punto10 p10 = new Punto10();
//                p10.Punto10();
//                return true;
        
            case 0:
                return false;
           
            default:
                System.out.println("Opción incorrecta.");
                System.in.read();
        }
        return true;
    }
}