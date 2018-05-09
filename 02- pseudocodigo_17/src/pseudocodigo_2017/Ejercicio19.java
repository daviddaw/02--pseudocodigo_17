package pseudocodigo_2017;

import java.util.Scanner;

/**
 *Algoritmo que calcule el valor mínimo, máximo y medio de una serie de números introducidos por teclado 
 * (la serie termina cuando se introduce un 0).
 * @author David Palanco
 *
 */
/*Para ello pon un breakpoint al comparar el número con min y otro al incrementar la variable suma. 
 * Luego continúa la ejecución con Step Over o Step Into (no uses Step Into en la llamada a LeerTeclado). 
 * Debes observar que no cambia nada al respecto. Muestra con varios pantallazos cómo van cambiando las variables. 
 * Guarda las pantallas en un fichero llamado Depuracion1TuNombre.*/
public class Ejercicio19 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int numero,suma=0,c=0,maximo=Integer.MIN_VALUE,minimo=Integer.MAX_VALUE;
		double media;
		System.out.println("Escribe una serie de numeros para acabar pulsa un 0");
		System.out.print(">");
		numero=in.nextInt();
		while (numero!=0) {
			if(numero<minimo)
				minimo=numero;
			
			if (numero>maximo) 
				maximo=numero;
			

			suma=suma+numero;
			c++;

			
			
			System.out.print(">");
			numero=in.nextInt();
		}
		media =(double)suma/c;
		System.out.println("La media es "+media+",el valor minimo es "+minimo+", y el valor maximo es "+maximo);
		in.close();

	}

}
