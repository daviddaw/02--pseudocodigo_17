package pseudocodigo_2017;

import java.util.Scanner;

public class Ejercicio10 {
	/*
	 * Tabla de multiplicar de un numero entre 1 y 10. 
	 */

	public static void main(String[] cosa) {
	Scanner entrada=new Scanner(System.in);
	int a;
	int resultado;
	
	do {
		System.out.println("Escribe un numero entre 1 y 10 ");
		System.out.print(">");
		a=entrada.nextInt();
	} while (a<1 || a>10);
	
	for (int i = 0; i <= 10; i++) {
		resultado=a*i;
		System.out.println(a+" * "+i+" = "+resultado);
	}
	
	
	entrada.close();

	}

}
