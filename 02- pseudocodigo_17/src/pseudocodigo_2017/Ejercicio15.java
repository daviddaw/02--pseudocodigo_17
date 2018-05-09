package pseudocodigo_2017;

import java.util.Scanner;

/**
 * Imprime los multiplos de 3 hasta n.
 * @author David Palanco
 *
 */
public class Ejercicio15 {

	public static void main(String[] argumentos) {
	Scanner in=new Scanner(System.in);
	int n;
	System.out.println("Escribe un número");
	System.out.print(">");
	n=in.nextInt();
	
	for (int i = 3; i <= n; i++) {
		if (i%3==0) {
			System.out.println(i);
		} 
		
	}
	
		
	in.close();
	}

}
