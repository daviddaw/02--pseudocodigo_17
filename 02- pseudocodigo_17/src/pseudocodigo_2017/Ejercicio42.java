package pseudocodigo_2017;

import java.util.Scanner;

public class Ejercicio42 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n1,n2,resultadoSuma2=0,resultadoSuma1=0;
		System.out.println("Dame dos números que sean positivos");
		do {
			System.out.print(">");
			n1=in.nextInt();
			if (n1<=0) 
				System.out.println("Te he dicho positivo!!");
			
		}
			while (n1<=0);
			
			
		do {
			System.out.print(">");
			n2=in.nextInt();	
			
			if (n1<=0) 
				System.out.println("Te he dicho positivo!!");
			
		
		} while (n1<=0);
		
			for (int divisor = 1; divisor < n2; divisor++) {
				if (n2%divisor==0) 	
					resultadoSuma2=resultadoSuma2+divisor;
				
			}
			for (int divisor = 1; divisor < n1; divisor++) {
				if (n1%divisor==0) 	
					resultadoSuma1=resultadoSuma1+divisor;
			}
			if (n1==resultadoSuma2 && n2==resultadoSuma1)
				
				System.out.println("son amiguitos.");
			
			else
				
				System.out.println("No son amiguitos.");
		
			
		
		
		
		
	
		
		}
	}


