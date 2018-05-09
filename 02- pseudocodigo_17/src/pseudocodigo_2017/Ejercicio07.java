package pseudocodigo_2017;

import java.util.Scanner;
//CTRL + MAY + O    Organizador de imports (añadiéndolos si faltan)

/**
 * Este programa lee dos números y decide si uno es divisor del otro.
 * @author David Palanco
 *
 */
public class Ejercicio07 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n1,n2;
		System.out.println("Escribe dos numeros");
		
		do {
			System.out.print(">");
			n1=in.nextInt();
			if (n1==0)
				System.out.println("No puede ser cero el primer numero, vuelve a escribirlo");
		} while (n1==0);
		do {
			System.out.print(">");
			n2=in.nextInt();
			if (n2==0)
				System.out.println("No puede ser cero el segundo numero, vuelve a escribirlo");
		} while (n2==0);
	
		if (n1>n2) {
			if (n1%n2==0) 
				System.out.println("El "+n1+" es divisible por "+n2);
			else 
				System.out.println(n1+" y "+n2+" no son divisibles");
		}
			else if (n2>n1) {
				if (n2%n1==0)
					System.out.println("El "+n1+" es divisor de "+n2);
				else 
					System.out.println(n1+" y "+n2+" no son divisibles");
		}else {
			System.out.println("Son el mismo número");
		}
			
			 
		in.close();
	}

}
