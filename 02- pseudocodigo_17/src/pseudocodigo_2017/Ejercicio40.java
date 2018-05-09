package pseudocodigo_2017;

import java.util.Scanner;


/**
 * Esteprogramacalcula todos los números perfectos de 1 a 1000 (6,24,496,8128)
 * @author David Palanco
 *
 */
public class Ejercicio40 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n,resultadoSuma=0;

		for ( n = 1; n <=1000; n++) {

			resultadoSuma=0; 
			for (int divisor = 1; divisor < n; divisor++) {

				if (n%divisor==0) {
					resultadoSuma=resultadoSuma+divisor;						
				}

			}

			if (n==resultadoSuma) 
				System.out.println("El número "+n+" es perfecto.");	
		}

		in.close();

		
	}

}
