package pseudocodigo_2017;

import java.util.Scanner;
/**
 * Escribe una serie de números  que va sumando para finalizar introduce un cero.
 * @author David Palanco
 *
 */
public class Ejercicio13 {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		int a, suma=0;
		System.out.println("Escribe una serie de números que se sumaran para acabar pulsa el 0");
		System.out.print(">");
		a=entrada.nextInt();
		while (a!=0) {
			suma+=a;
			System.out.print(">");
			a=entrada.nextInt();
		}
		System.out.println("La suma de los numeros introducidos es "+suma);
		entrada.close();
	}

}
