package pseudocodigo_2017;

import java.util.Scanner;

/**
 * Visualizar los números primos hasta N. (2 3 5 7 11 13 17 19 23 29 31 37 41 43
 * 47 53 59 61 67 71 )
 * 
 * @author David Palanco
 *
 */
public class Ejercicio35 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int tope, contador = 0;
		boolean primo;

		System.out.println("Escribe el número hasta el cual quieres los primos.");

		do {
			System.out.print(">");
			tope = in.nextInt();
			if (tope < 1) {
				System.err.println(tope + " no es positivo,escribe un número positivo.");
			}
		} while (tope < 1); // bucle que valida que el numero sea positivo.
		

		if (tope != 1) {

			for (int i = 2; i <= tope; i++) {
				primo = true; //en cada vuelta resetearemos a falso el boolean

				for (int divisor = 2; divisor <= i / 2; divisor++) {

					if (i % divisor == 0) {
						primo = false;
					}

				}
				if (primo == true) {
					System.out.print(" " + i + " ");
					contador++;
				}

			}
			if (contador > 0) {
				System.out.println();
				System.out.println("Hay " + contador + " primos hasta el número " + tope + ".");
				in.close();
			}

			in.close();
		} else {//Validación si introduce el 1
			System.out.println("Hasta el 1 no hay ningun número primo.");
		}
	}

}
