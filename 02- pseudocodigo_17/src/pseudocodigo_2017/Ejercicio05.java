package pseudocodigo_2017;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int a;
		System.out.println("Escribe un n�mero");
		System.out.print(">");
		a=in.nextInt();
		if(a%2==0)
		System.out.println("El n�mero es par.");
		else
			System.out.println("El n�mero es impar.");
		in.close();
		
		

	}

}
