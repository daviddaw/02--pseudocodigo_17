package pseudocodigo_2017;

import java.util.Scanner;

/**
 *  Este programa calcula el valor minimo, maximo y media, acabar la serie con tres 5 consecutivos
 * @author David Palanco
 *
 */
public class Ejercicio47 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numero,max,min,acu=0,cont=0;
		int ultimo=0,penultimo=0;
		double media=0;
		System.out.println("Introduce un número");
		numero=in.nextInt();
		max=Integer.MIN_VALUE;
		min=Integer.MAX_VALUE;
		while (!(numero==5 && penultimo==5 && ultimo==5)) //se repite mientras no sean 5
		{
			if (numero>max) {
				max= numero;
			} 
			if (numero<min) {
				min=numero;
			}
			cont=cont+1;
			acu=acu+numero;
			penultimo=ultimo;
			ultimo=numero;
			
			
			System.out.println("Introduce un número");
			numero=in.nextInt();
		}	
		media=(double)acu/cont;
		System.out.println("El valor minimo es "+min+", el valor maximo es "+max+" y la media es "+media);

	}

}
