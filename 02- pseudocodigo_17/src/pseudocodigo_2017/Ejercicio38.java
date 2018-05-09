package pseudocodigo_2017;

import java.util.Scanner;

public class Ejercicio38 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int contador=1,divisor;

		System.out.println("Escribe un número entero");
		System.out.print(">");
		divisor=in.nextInt();
	
		while (divisor>=10) {
			divisor=divisor/10;
			contador++;
		}
		
/*		do {
			divisor=divisor/10;
			contador++;
		} while (divisor>=10);
		Con este bucle el el contador suma una cifra de mas a los numeros de una cifra
		*/
	
			

		

 		
System.out.println("tiene "+contador+" cifras");
in.close();
	}
}