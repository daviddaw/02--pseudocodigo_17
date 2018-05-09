package pseudocodigo_2017;

import java.util.Scanner;

public class Ejercicio33 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int numero;
		boolean primo;
		primo=true;
		System.out.println("Escribe un número (mayor que 0).");
		
		do {
			System.out.print(">");
			numero=in.nextInt();
			if (numero<1) {
				System.err.println(numero+" no es mayor que 0,escribe un número positivo.");
			}
		} while (numero<1); //bucle  que valida que el numero sea positivo.

		for (int divisor = 2; divisor <= numero/2; divisor++) {
			System.out.println("El resto de "+numero+" entre  "+divisor+" es "+numero%divisor);
			if(numero%divisor==0) {
				primo=false;
			}
		}
		if (primo==true)
			System.out.println("El "+numero+" es primo.");
		else
			System.out.println("El "+numero+" no es primo.");



		in.close();
	}

}
