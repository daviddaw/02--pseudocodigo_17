package pseudocodigo_2017;

import java.util.Scanner;

/**
 * Este programa usando la ecuacion y= x3+ 5*x2-2*x, visualiza el valor de "y" para los valores de "x" que sean múltiplos de 5 
 * empezando por el 10 hasta el 75
 * @author David Palanco
 *
 */
public class Ejercicio23 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int x;
		double y=0;
		System.out.println("Escribe un numero");
		System.out.print(">");
		x=in.nextInt();
		

		y=Math.pow(x,3)+5*(Math.pow(x, 2))-2*x;
		
		System.out.println("El resultado es "+y);
		in.close();
	}
		
}
