package pseudocodigo_2017;

import java.util.Scanner;

public class Ejercicio39 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n,resultadoSuma=0;
		System.out.println("Dame un número que sea positivo");
		do {
			System.out.print(">");
			n=in.nextInt();
			if (n<=0) {
				System.out.println("Te he dicho positivo!!");
			}
		} while (n<=0);
		if (n==1) {
			System.out.println("El numero 1 no es perfecto");
		} else {
			for (int divisor = 1; divisor < n; divisor++) {
				if (n%divisor==0) {	
					resultadoSuma=resultadoSuma+divisor;
						
				}
			}
			if (n==resultadoSuma) 
				System.out.println("El numero "+n+" es perfecto.");
			
			else
				System.out.println("El numero "+n+" no es perfecto.");
		}
		
		
		in.close();

	}

}
