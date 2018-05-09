package pseudocodigo_2017;

import java.util.Iterator;

/**
 * Programa qu muestra las tablas de multiplicar de los números del 1 al 10
 * @author David Palanco
 *
 */
public class Ejercicio29 {
	public static void main(String[] args) {
		for (int tabla = 0; tabla<=10; tabla++) {
			System.out.println(" ");
			System.out.println(">"+" Tabla del "+tabla);
			System.out.println(" ");
			for (int i = 1; i <=10; i++) {
				System.out.println(tabla+" x "+i+" = "+tabla*i);
			}
		}


	}

}
