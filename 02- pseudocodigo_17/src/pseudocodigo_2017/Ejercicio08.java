package pseudocodigo_2017;

import java.util.Scanner;

/**
 * El programa pide un nº de 1 a 7 y lo convierte en el día de la semana que representa .
 * @author David Palanco
 *
 */
public class Ejercicio08 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int dia ;
		System.out.println("Escribe un numero del 1 al 7");
		System.out.print(">");
		dia=in.nextInt();
		switch (dia) {
		case 1:System.out.println("Lunes");
			
			break;
		case 2:System.out.println("Martes");
			
			break;
		case 3:System.out.println("Miercoles");
			
			break;

		case 4:System.out.println("Jueves");
			
			break;
		case 5:System.out.println("Viernes");
			
			break;
		case 6:System.out.println("Sabado");
			
			break;
		case 7:System.out.println("Domingo");
			
			break;
		default:System.out.println("No es ningun dia.");
			break;
			
		}
		
		in.close();
	}

}
