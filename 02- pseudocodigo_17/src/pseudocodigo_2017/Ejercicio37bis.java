package pseudocodigo_2017;

import java.util.Scanner;

public class Ejercicio37bis {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		int a,b,c,aux;
		boolean orden=true;
		System.out.println("Introduce un numero para a");
		a=in.nextInt();
		System.out.println("Introduce un numero para b");
		b=in.nextInt();
		System.out.println("Introduce un numero para c");
		c=in.nextInt();
		if (a>b){
			aux=a;
			a=b;
			b=aux;
			orden=false;
		}
		if(a>c){
			aux=a;
			a=c;
			c=aux;
			orden=false;
		}
		if(b>c){
			aux=b;
			b=c;
			c=aux;
			orden=false;
		}
		System.out.println("Los numero son "+a+" "+b+" "+c);
		if (orden==true){
			System.out.println("Los numeros han sido introducidos en orden");
		}else{
			System.out.println("Los numeros no han sido introducidos en orden");
		}
	}
}
