package pseudocodigo_2017;

import java.util.Scanner;

/**
 * Esteprograma ca�cula el valor de Y en la ecuaci�n de 1� grado y=A * X +B (pidiendo primero A y B y luego dos   valores de X).
 * @author David Palanco
 *
 */

public class Ejercicio03 {

	public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	int a,b,x1,x2,y;
	System.out.println("Para resolver la ecuacion y=a*x+b");
	System.out.println("introduce un valor para a");
	System.out.print(">");
	a=in.nextInt();
	System.out.println("introduce un valor para b");
	System.out.print(">");
	b=in.nextInt();
	System.out.println("introduce el 1� valor de x");
	System.out.print(">");
	x1=in.nextInt();
	System.out.println("introduce el 2� valor de x");
	System.out.print(">");
	x2=in.nextInt();
	
	y=a*x1+b;
	System.out.println("El resultado de la ecuacion para la 1� x = "+x1+" es "+y);
	y=a*x2+b;
	System.out.println("El resultado de la ecuacion para la 2� x = "+x2+" es "+y);
	
	in.close();
		
	}

}
