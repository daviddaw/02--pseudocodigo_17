package pseudocodigo_2017;

import java.util.Scanner;

/**
 * Este programa visualiza los n primeros primos.
 * @author David Palanco
 *
 */
public class Ejercicio34y36 {

	public static void main (String [] args){
		Scanner in=new Scanner(System.in);
        //suma de n primeros primos
		int tope,cont,n,suma=0;
		boolean primo;
		n = 2;
		cont = 0;

		System.out.println("Introduce un número.");
		tope=in.nextInt();//introducimos el numero de primos
		while(cont<tope)//mientras el contador sea menor al numero de primos el bucle seguira
		{
			primo=true;//inicializamos el buleano a verdadero

			for(int i=2;i<=n/2;i++)//avanzara desde 2 hasta el numero que estemos analizando
			{
				if(n%i==0){
					primo=false;//si tiene un divisor no sera primo, y pondremos primo a falso 
				}	
			}
			
			if(primo==true)//si primo es verdadero
			{
				cont++;  //con cada primo aumentara 1 el contador sumaremos uno al contador
				System.out.println(n);
				suma=suma+n;
			}
			n++;// sumamos un numero
		}	
		System.out.println("La suma de los primos es "+suma);
	}


}
