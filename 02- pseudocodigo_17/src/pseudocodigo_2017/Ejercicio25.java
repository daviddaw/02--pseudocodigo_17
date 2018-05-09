package pseudocodigo_2017;

import java.util.Scanner;

/**
 * Algoritmo que, dado un a�o, decida si es bisiesto o no.
 * @author David Palanco
 *
 */
//Si es m�ltiplo de 4 Y ademas, o bien es m�ltiplo de 400 o bien no es m�ltiplo de 100.
public class Ejercicio25 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int year;
		
		System.out.println("Introduce un a�o para saber si es bisiesto");
		System.out.print(">");
		year=in.nextInt();
		
		if (year%4==0 && (year%400==0 || year%100!=0))
			System.out.println("El "+year+" es bisiesto");
		else
			System.out.println("El "+year+" no es bisiesto");
		in.close();
		

	}

}
