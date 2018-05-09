package pseudocodigo_2017;

import java.util.Scanner;

/**
 * Este programa  calcula todos los divisores de un nº N
 * @author David Palanco
 *
 */
public class Ejercicio24 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n;
		boolean divisores=false;
		
			System.out.println("Escribe un numero diferente de cero y te calculo sus divisores");
			System.out.print(">");
			n=in.nextInt();
		


		for (int i = 1; i < n; i++) {
			if (n%i==0) {
				divisores=true;
			System.out.println(i);
			System.out.println("hola");
			}
			System.out.println("como esta divisores "+divisores);

			
		}
		if (divisores==false)
			System.out.println("No tiene divisores");
		in.close();

	}

}
