package pseudocodigo_2017;

import java.util.Scanner;

/**
 * Este programa pide un numero y despues  una serie de números terminada en 0 indique si el número N se encuentra en la serie.
 * @author David Palanco
 *
 */
public class Ejercicio31y32 {


	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n,serie,c=0;
		boolean repetido=false;

		System.out.println("escribe un numero");
		n=in.nextInt();
		System.out.println("Escribe una serie de numeros, para finalizar cero");
		serie=in.nextInt();
		while (serie!=0) {
			if (serie==n) {
				repetido=true;
				c=c+1;
				
				
			}
        
			System.out.println("Escribe una serie de numeros");
			serie=in.nextInt();
		}
		
		if (repetido==true) {
			System.out.println("el numero esta en la serie");
			
		} else {
System.out.println("El numero no esta en la serie");


		}
		
		System.out.println("el numero "+n+" se repite "+c+"veces");
	}

}
