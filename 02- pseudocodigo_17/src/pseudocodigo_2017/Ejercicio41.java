package pseudocodigo_2017;

import java.util.Scanner;

/**
 * Se introduce una serie de 50 letras y se cuenta cuántas veces se repite la primera de ellas
 * @author David Palanco
 *
 */
public class Ejercicio41 {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		String letra,serie;
		boolean repetido=false;

		System.out.println("escribe un letra");
		letra=in.next();
		System.out.println("Escribe una serie de letras");
		for (int i = 1; i <=5; i++) {
			serie=in.next();
			System.out.println(" faltan "+(5-i)+" letras.");
			if (serie.equalsIgnoreCase(letra)) {
				repetido=true;				
			} 

		}
		
		if (repetido==true) {
			System.out.println("la letra esta en la serie");
		} else {
System.out.println("la letra no esta en la serie");
		}

}
}