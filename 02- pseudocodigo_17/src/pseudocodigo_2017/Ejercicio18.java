package pseudocodigo_2017;

import java.util.Scanner;

/**
 * Este Programa nos pide dos numeros y suma todos los numero que haya entre ellos(Ellos incluidos).
 * @author David Palanco
 */
public class Ejercicio18 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n1,n2,suma=0;
		System.out.println("Escribe dos números");
		System.out.print(">");
		n1=in.nextInt();
		System.out.print(">");
		n2=in.nextInt();
		for (int i = n1; i <=n2; i++) {// Asi seria evitando el primero y el ultimo. for (int i = n1+1; i <n2; i++)
			System.out.println(i);
			suma=suma+i;
		}
		System.out.println("La suma es "+suma);
		
		in.close();
	}

}
