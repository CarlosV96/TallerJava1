package com.sofka.Taller3;

import java.util.Scanner;

import com.sofka.Linea;

public class Punto8 {
	private int opcion, repetir;
	private String[] usuario;
	private Scanner input;
	private boolean curso1, curso2, curso3, curso4, curso5, curso6, curso7, curso8;
	
	public void Punto8() {
		Linea l = new Linea();
		input = new Scanner(System.in);
		curso1 = false;
		informacion();
		
		usuario = new String[8];
		usuario[0] = "";
		usuario[1] = "";
		usuario[2] = "";
		usuario[3] = "";
		usuario[4] = "";
		usuario[5] = "";
		usuario[6] = "";
		usuario[7] = "";
		
		do {
			opcion = menu();
			if (opcion==1 && curso1 == false) {
				informacionUsuario1();
			}else if(opcion==1 && curso1==true) {
				yaAprobado();
			}
			
			if (opcion==2 && curso2 == false) {
				informacionUsuario2();
			}else if(opcion==2 && curso2 ==true) {
				yaAprobado();
			}
			
			if (opcion==3 && curso3 == false) {
				informacionUsuario3();
			}else if(opcion==3 && curso3 ==true) {
				noAprobo();
			}
			
			if (opcion==4 && curso4 == false) {
				informacionUsuario4();
			}else if(opcion==4 && curso4 ==true) {
				noAprobo();
			}
			
			if (opcion==5 && curso5 == false) {
				informacionUsuario5();
			}else if(opcion==5 && curso5 ==true) {
				yaAprobado();
			}
			
			if (opcion==6 && curso6 == false) {
				informacionUsuario6();
			}else if(opcion==6 && curso6 ==true) {
				noAprobo();
			}
			
			if (opcion==7 && curso7 == false) {
				informacionUsuario7();
			}else if(opcion==7 && curso7 ==true) {
				yaAprobado();
			}
			
			if (opcion==8 && curso8 == false) {
				informacionUsuario8();
			}else if(opcion==8 && curso8 ==true) {
				yaAprobado();
			}
		}while(opcion<9);
		l.Linea();
	}
	
	private void informacion() {
		System.out.println("                          INFORMACION DEL PUNTO 8");
		System.out.println("APLICACION QUE PERMITE REGISTRAR CLIENTES DE CURSOS Y ESTABLECER QUIENES APROBARON");
	}

	private int menu(){
		System.out.println("Ingrese al usuario que desea acceder.");
		System.out.println("1. " + usuario[0]);
		System.out.println("2. " + usuario[1]);
		System.out.println("3. " + usuario[2]);
		System.out.println("4. " + usuario[3]);
		System.out.println("5. " + usuario[4]);
		System.out.println("6. " + usuario[5]);
		System.out.println("7. " + usuario[6]);
		System.out.println("8. " + usuario[7]);
		System.out.println("9. Salir");
		return input.nextInt();
	}
	
	private String capturarNombre() {
		System.out.println("Digita tu nombre");
		Scanner entrada = new Scanner(System.in);
		return entrada.nextLine();
	}
	private boolean presentarCurso() {
		System.out.println("Presenta ahora tu curso");
		System.out.println("Escribe 'true' para confirmar la realización del curso.");
		return input.nextBoolean();
	}
	private void aprobado() {
		System.out.println("Felicidades, has aprobado.");
	}
	
	private void noAprobado() {
		System.out.println("Lo sentimos, no has aprobado.");
	}
	
	private void yaAprobado() {
		System.out.println("El señor " + usuario[opcion-1] + " ha aprobado.");
	}
	
	private void noAprobo() {
		System.out.println("El señor " + usuario[opcion-1] + " no ha aprobado.");
	}
	
	private int debesPresentar() {
		System.out.println("Debes presentar tu curso.");
		System.out.println("Presiona 1 para ir a realizarlo.");
		return input.nextInt();
	}
	
	private void informacionUsuario1() {
		usuario[opcion-1] = capturarNombre();
		curso1 = presentarCurso();
		opcion=0;
		if(curso1==true) {
			aprobado();
		}else { do {
					repetir= debesPresentar();
					if (repetir==1) {
						curso1 = presentarCurso();
					}
				}while(repetir!=1 || curso1 == false);
		aprobado();}
	}
	
	private void informacionUsuario2() {
		usuario[opcion-1] = capturarNombre();
		curso2 = presentarCurso();
		opcion=0;
		if(curso2==true) {
			aprobado();
		}else { do {
					repetir= debesPresentar();
					if (repetir==1) {
						curso2 = presentarCurso();
					}
				}while(repetir!=1 || curso2 == false);
		aprobado();}
	}
	
	private void informacionUsuario3() {
		usuario[opcion-1] = capturarNombre();
		curso3 = presentarCurso();
		opcion=0;
		if(curso2==true) {
			noAprobado();
		}else { do {
					repetir= debesPresentar();
					if (repetir==1) {
						curso3 = presentarCurso();
					}
				}while(repetir!=1 || curso3 == false);
		noAprobado();}
	}
	
	private void informacionUsuario4() {
		usuario[opcion-1] = capturarNombre();
		curso4 = presentarCurso();
		opcion=0;
		if(curso4==true) {
			noAprobado();
		}else { do {
					repetir= debesPresentar();
					if (repetir==1) {
						curso4 = presentarCurso();
					}
				}while(repetir!=1 || curso4 == false);
		noAprobado();}
	}
	
	private void informacionUsuario5() {
		usuario[opcion-1] = capturarNombre();
		curso5 = presentarCurso();
		opcion=0;
		if(curso5==true) {
			aprobado();
		}else { do {
					repetir= debesPresentar();
					if (repetir==1) {
						curso5 = presentarCurso();
					}
				}while(repetir!=1 || curso5 == false);
		aprobado();}
	}
	
	private void informacionUsuario6() {
		usuario[opcion-1] = capturarNombre();
		curso6 = presentarCurso();
		opcion=0;
		if(curso6==true) {
			noAprobado();
		}else { do {
					repetir= debesPresentar();
					if (repetir==1) {
						curso6 = presentarCurso();
					}
				}while(repetir!=1 || curso6 == false);
		noAprobado();}
	}
	
	private void informacionUsuario7() {
		usuario[opcion-1] = capturarNombre();
		curso7 = presentarCurso();
		opcion=0;
		if(curso7==true) {
			aprobado();
		}else { do {
					repetir= debesPresentar();
					if (repetir==1) {
						curso7 = presentarCurso();
					}
				}while(repetir!=1 || curso7 == false);
		aprobado();}
	}
	
	private void informacionUsuario8() {
		usuario[opcion-1] = capturarNombre();
		curso8 = presentarCurso();
		opcion=0;
		if(curso8==true) {
			aprobado();
		}else { do {
					repetir= debesPresentar();
					if (repetir==1) {
						curso8 = presentarCurso();
					}
				}while(repetir!=1 || curso8 == false);
		aprobado();}
	}
}
