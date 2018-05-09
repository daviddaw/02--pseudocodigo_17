package pseudocodigo_2017;

import java.util.Scanner;

/**
 * Este programa que dada una serie de nº terminada en 0 indique si ha habido
 * algún negativo
 * 
 * @author David Palanco
 *
 */
public class Ejercicio28 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int numero,cn=0;
		do {
			System.out.println("Escribe una serie de numeros");
			System.out.println(">");
			numero=in.nextInt();
			if (numero<0) {
				cn++;
			}
		} while (numero != 0);
		if (cn>0) {
			System.out.println("Ha habido numeros negativos");
		}else
			System.out.println("No ha habido numeros negativos");
		

	}

}
