package pseudocodigo_2017;

import java.util.Scanner;

/**
 * Al introducir las edades de 25 alumnos de una clase, 
 * El programa imprime la edad del más joven, la del mayor y la media de la clase. 
 * @author David Palanco
 *
 */

public class Ejercicio30 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int edad;
		int joven=Integer.MAX_VALUE;
		int mayor=Integer.MIN_VALUE;
		for (int i = 1; i <=25; i++) {
			System.out.println("Escribe la edad del alumno "+i);
			System.out.print(">");
			edad=in.nextInt();
			if(edad<joven)
				joven=edad;
			if (edad>mayor)
				mayor=edad;	
		}
		System.out.println("El alumno más joven tiene "+joven
				+" años y el mayor tiene "+mayor+" años.");
		in.close();
	}

}
