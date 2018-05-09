/**
 * 
 */
package pseudocodigo_2017;

import java.util.Scanner;

/**
 * Algoritmo que dados tres nº a, b y c,:
a.	calcule el valor de Y en la ecuación de 2º grado: y=ax2+bx+c (pidiendo primero a, b y c y luego dos  valores de X).
b.	resuelva la ecuación de 2º grado: ax2+bx+c=0 

 * @author David Palanco
 *
 */
public class Ejercicio04 {
	/* 
	* x=(-b+-Math.sqrt(Math.pow(b, 2)-4ac))/2a
	* a=8,b=-2,c=-3;
	*  8x2 - 2x - 3 = 0.
	*  x1=3/4
	*  x2=-1/2
	 */

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int a,b,c,x1,x2,discriminante;
		double raiz,divisorp,divisorn,resultado_p,resultado_n;
		System.out.println("Escribe un valor para a");
		System.out.print(">");
		a=in.nextInt();
		System.out.println("Escribe un valor para b");
		System.out.print(">");
		b=in.nextInt();
		System.out.println("Escribe un valor para b");
		System.out.print(">");
		c=in.nextInt();
		discriminante=4*a*c;
		raiz=Math.sqrt(Math.pow(b, 2)-discriminante);
		divisorp=-b+raiz;
		divisorn=+-b-raiz;
		resultado_p=divisorp/(2*a);
		resultado_n=divisorn/(2*a);
		
		System.out.println(resultado_p+"  "+resultado_n);
		in.close();
     
	}

}
