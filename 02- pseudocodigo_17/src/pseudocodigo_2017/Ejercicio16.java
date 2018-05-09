package pseudocodigo_2017;

import java.util.Scanner;

/**
 * Este programa pide una nota de 0 a 10 y lo convierte 
	a entre 0 y 2: Muy deficiente, entre 3 y 4: Insuficiente,5: Suficiente,6:Bien,entre 7 y 8: Notable,entre 9 y 10: Sobresaliente
 * @author David Palanco
 *
 */
public class Ejercicio16 {


	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int nota;
		System.out.println("Escribe tu nota en programación ");
		System.out.print(">");
		nota=in.nextInt();
		
		switch (nota) {
		case 1:
		case 2: System.out.println("Muy Deficiente");break;
		case 3:
		case 4: System.out.println("Insuficiente");break;
		case 5: System.out.println("Suficiente");break;
		case 6: System.out.println("bien");break;
		case 7:
		case 8: System.out.println("Notable");break;
		case 9:	
		case 10:System.out.println("Sobresaliente");break;
		default:System.out.println("La escala de notas va de 1 a 10.");break;
		}
		System.out.println("Adios");
		in.close();
		}
		
	}


