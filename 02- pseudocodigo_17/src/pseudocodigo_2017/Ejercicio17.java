package pseudocodigo_2017;

import java.util.Scanner;

public class Ejercicio17 {
/**
 * 
 * 
 */
	public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
		int factorial=1,numero;
		
	System.out.println("Escribe un numero");
	System.out.println(">");
	numero=in.nextInt();
     
for (int i = 1; i <=numero; i++) {
	
	factorial=factorial*i;
	
/*	try
	{
	      Thread.sleep(1800);
	        }catch(InterruptedException e){}

Este bloque lo use para provocar un retardo en la salida y encontrar el error por el que no me funcionaba*/


	}
System.out.println(factorial);
in.close();
}
}
