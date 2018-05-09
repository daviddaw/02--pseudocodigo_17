package pseudocodigo_2017;

import java.util.Scanner;

public class Ejercicio26 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
			int factorial=1;
			

	 
		for (int f = 1; f <=10; f++) {
			factorial=1;
		System.out.print("El factorial de "+f+" es ");
		
	for (int i = 1; i <=f; i++) {
		
		factorial=factorial*i;
		
	


		}
	System.out.println(factorial+".");
		}
	
	in.close();
	}

}
