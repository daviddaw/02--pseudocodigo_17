package pseudocodigo_2017;

import java.util.Scanner;

/**
 * Este programa te dice si el número que has introducido es positivo, negativo o cero.
 * @author David Palanco
 *
 */
public class Ejercicio06 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n;
		String respuesta;
		
		do {
			System.out.println("Introduce un número y te dire si es positivo negativo o cero.");
			System.out.print(">");
			n=in.nextInt();
			if      (n>0) 
				System.out.println("El numero es positivo");
			else if (n<0) 
				System.out.println("El numero es negativo");
			else 
				System.out.println("El numero es cero");
			System.out.println("¿Quieres probar otra vez? S/N");
			System.out.print(">");
			respuesta=in.next();
			if (respuesta.equalsIgnoreCase("s")) {
				System.out.println("Has dicho que si.");
			}else {
				System.out.println("Hasta luego");
			}
		} while (respuesta.equalsIgnoreCase("s"));
		
		System.out.println(" ");
		System.out.println("Programa finalizado");
		in.close();



	}

}
