package pseudocodigo_2017;

import java.util.Scanner;

/**
 * Este programa pide al  usuario 10 números enteros y decidir cuántos son pares y cuántos impares, obtener la suma de los pares y la media aritmética de los impares.
 * @author David Palanco
 *
 */
public class Ejercicio21 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n,cp=0,ci=0;
		System.out.println("Escribe 10 numeros");
		
		for (int i = 1; i <=10; i++) {
			System.out.println("numero "+i);
			System.out.print(">");
			n=in.nextInt();
			if (n%2==0) {
				cp++;	
			}else if (n%i!=0) {
				ci++;
			}
			System.out.println("hay "+cp+" pares y "+ci+" impares.");
		}
		in.close();

	}

}
