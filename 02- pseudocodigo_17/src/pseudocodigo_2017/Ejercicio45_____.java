/**
 * 
 */
package pseudocodigo_2017;

import java.util.Scanner;

/**
 * @author David Palanco
 *	A este programale entregamos  una fecha en formato d�a, mes, a�o y obtiene el n�mero de orden 
 *  del d�a en el total del a�o (Ejemplo: si se lee 01 03 2005, se obtiene 61� de 2005)
		a) Considera todos los meses de 30 d�as
		b) Considera en cada mes los d�as que tiene

 */
public class Ejercicio45_____ {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int day,month,year,menu;
		System.out.println("============================");
		System.out.println("       Men� principal");
		System.out.println(" ");
		System.out.println("============================");
		do {
			System.out.println("Introduce un dia");
			System.out.print(">");
			day=in.nextInt();
			if (day<1 || day>30) {
				System.out.println("Dia incorrecto");
			}
		} while (day<0 || day>30);
        do {
        	System.out.println("introduce el mes");
        	System.out.print(">");
    		month=in.nextInt();
			if (month<1 || month>12) {
				System.out.println("mes incorrecto");
			}
		} while (month<1 || month>12);
		System.out.println("introduce el a�o");
		System.out.print(">");
		year=in.nextInt();
		System.out.println(" ");
		System.out.println("Has introducido el "+day+"/"+month+"/"+year);
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("     Elija una opci�n:");
		System.out.println(" ");
		System.out.println("============================");
		System.out.println(" ");
		System.out.println("> Pulse 1 para meses de 30 dias.");
		System.out.println("> Pulse 2 para meses reales.");
		System.out.println(" ");
		System.out.println("============================");
		menu=in.nextInt();
		
		switch (menu) {
		case 1:System.out.println("Has elegido meses de 30 dias.");
			
			break;
		case 2:System.out.println("Has elegido meses reales.");
			
			break;

		default:System.out.println("Esa opci�n no existe, Adios.");
			break;
		}
		
		
		
		

		
		
		
		
		in.close();
		
	}

}
