package pseudocodigo_2017;

import java.util.Scanner;

/**
 * En este programa podemos introducir dos números por teclado y mediante un menú calcula su suma, resta, multiplicación o división.
 * @author David Palanco
 *
 */
public class Ejercicio43 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n1,n2,menu,suma,resta,multiplicacion;
		double division;
		System.out.println(" ");
		System.out.println("       Menú principal");
		System.out.println(" ");
		System.out.print(" ");
		System.out.println("Inserte un número:");
		System.out.print(">");
		n1=in.nextInt();
		System.out.println("Inserte otro número:");
		System.out.print(">");
		n2=in.nextInt();
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("     Elija una opción:");
		System.out.println(" ");
		System.out.println("> Pulse 1 para sumarlos");
		System.out.println("> Pulse 2 para restarlos");
		System.out.println("> Pulse 3 para multiplicarlos");
		System.out.println("> Pulse 4 para dividirlos");
		System.out.println("> Pulse 5 para salir");
		System.out.println(" ");
		System.out.println(" ");
					
		
		menu=in.nextInt();
		switch (menu) {
		case 1:suma=n1+n2;
			System.out.println("Su suma es "+suma);

		break;
		case 2:resta=n1-n2;
			System.out.println("Su resta es "+resta);

		break;
		case 3:multiplicacion=n1*n2;
			System.out.println("Su multiplicacion es "+multiplicacion);

		break;
		case 4: 
			if (n2!=0 ) {
				division=(double)n1/n2;
			System.out.println("Su division es "+division);
			}
			
			
			
		else
			System.out.println("No se puede dividir entre cero");
			
			

		break;
		
		case 5: System.out.println("Hasta la proxima");

		default:System.out.println("No has introducido ningun numero de 1 a 5");
		break;
		}
		System.out.println(" ");
	
		
	}

}
