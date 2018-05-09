package pseudocodigo_2017;

public class Ejercicio12 {

	public static void main(String[] args) {
		// 12.	Calcular el producto de los números del 1 al 100
		double resultado=1;
		for (double i = 1; i < 100; i++) {//Es necesario?
			resultado= i*resultado;
		}
       System.out.println(resultado);
	}

}
