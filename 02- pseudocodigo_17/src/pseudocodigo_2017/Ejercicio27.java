package pseudocodigo_2017;

import java.util.Scanner;

/**
 * Este programa pide dos números x, y  calcula por sumas sucesivas x * y.
 * @author David Palanco
 *
 */
public class Ejercicio27 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int a,b,aux=0,suma=0;
		System.out.println("Escribe dos números");
		System.out.print(">");
		a=in.nextInt();
		System.out.println();
		System.out.print(">");
		b=in.nextInt();
		if (a<b) {
			aux = a;
			a = b;
			b =aux;
			
		}
		
		System.out.println("a vale "+a+" y b vale "+b);
		for (int i = 1; i <=b; i++) {
			suma=suma+a;
			
		}
		System.out.println("La suma es "+suma);
     in.close();
	}

}
