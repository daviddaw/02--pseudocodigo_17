package pseudocodigo_2017;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		int a, suma=0,c=0;
		double media;
		System.out.println("Escribe una serie de números que se obtendran la media para acabar pulsa el 0");
		System.out.print(">");
		a=entrada.nextInt();
		while (a!=0) {
			suma+=a;
			c++;
			System.out.print(">");
			a=entrada.nextInt();
		}
		media=(double)suma/c;
		
		if (c!=0) 
			System.out.println("La media de los numeros introducidos es "+media);
		else
			System.out.println("La media es 0");
			
		
		entrada.close();
	}

}
