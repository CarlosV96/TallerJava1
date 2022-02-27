package com.sofka;
import java.io.IOException;
import java.util.Scanner;

import com.sofka.Taller1.Main1;
import com.sofka.Taller2.Main2;
import com.sofka.Taller3.Main3;
import com.sofka.Taller4.Main4;

public class Main {
	private static boolean bandera = true;
    private static int opcion;
    private static Scanner input;

	public static void main(String[] args)  throws IOException{
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
        System.out.println("Escoja el Taller que desea ver");
        System.out.println("1. Taller #1 - Variables e impresion.");
        System.out.println("2. Taller #2 - Condicionales.");
        System.out.println("3. Taller #3 - Ciclos.");
        System.out.println("4. Taller #4 - Arreglos");
        System.out.println("0. Salir o terminar.");
    }
	
	private static int capturarOpcion() {
    	int resultado = input.nextInt();
    	input.nextLine(); 
		return resultado;
	}
	
	 private static boolean evaluarOpcion(int opcion) throws IOException {
	        switch (opcion) {
	            case 1:
				new Main1();
	                Main1.main1(null);
	                return true;
	       
	            case 2:
				new Main2();
	                Main2.main2(null);
	                return true;
	                
	            case 3:
				Main3.main3(null);
	                return true;
	                
	            case 4:
				new Main4();
	                Main4.main4(null);
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
