package pseudocodigo_2017;

import java.util.Scanner;

/**
 * Programa que pidiendo el radio calcula la longitud de su circunferencia y el área del círculo.
 * @author David Palanco
 *
 */
public class Ejercicio02 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int radio;
		double longitudC,areaC;;
		final double PI=3.1416;
		System.out.println("Dame un radio");
		System.out.print(">");
		radio=in.nextInt();
		longitudC=2*PI*radio;
		areaC=PI*Math.pow(radio, 2);
		System.out.println("La longitud de la circunferencia es "+longitudC+" y el area del circulo es "+areaC+".");
		in.close();

	}

}
