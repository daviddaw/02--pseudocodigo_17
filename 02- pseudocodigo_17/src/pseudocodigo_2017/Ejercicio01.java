package pseudocodigo_2017;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		int a,b,suma,resta,multi;
		double divi;
		Scanner entrada=new Scanner (System.in);
		System.out.println("Dime dos numeros");
		System.out.print(">");
		a=entrada.nextInt();
		System.out.print(">");
		b=entrada.nextInt();
		suma = a+b;
		resta = a-b;
		multi =a*b;
		divi=(double)a/b;
		
		System.out.println(a+"+"+b+" = "+suma);
		System.out.println(a+"-"+b+" = "+resta);
		System.out.println(a+"x"+b+" = "+multi);
		if (b>0) 
			System.out.println(a+"/"+b+" = "+divi);
		else
			System.out.println("No se puede dividir entre cero");
		entrada.close();
	}

}
