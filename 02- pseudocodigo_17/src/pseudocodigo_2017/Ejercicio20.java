package pseudocodigo_2017;
/**
 * Este programa imprime la suma de los múltiplos de 2 desde el 8 al 400.
 * @author David Palanco
 *
 */
public class Ejercicio20 {

	public static void main(String[] args) {
		int suma=0;
		for (int i = 8; i <= 400; i++) {
			if(i%2==0)
				suma=suma+i;
		}
       System.out.println("La suma de los múltiplos es "+suma+".");
	}

}
