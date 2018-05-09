package pseudocodigo_2017;

import java.util.Scanner;

public class Ejercicio22 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n,suma=0;
		System.out.println("Insertarás numeros por teclado hasta que la suma de todos ellos sea superior a 1000.");
		System.out.print(">");
		n=in.nextInt();
		suma=n;
		
		while (suma<=1000) {
			System.out.println(">");
			n=in.nextInt();
			
			
			suma=suma+n;
			System.out.println();
			
		}
		System.out.println("La suma"+suma+" te has pasado");
		in.close();
	}

}
