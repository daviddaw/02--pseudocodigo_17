package pseudocodigo_2017;

import java.util.Scanner;

public class Ejercicio46 {

	public static void main(String[] args) {
		//46.	Dada una fecha en formato dd mm aaaa calcular cuál será la fecha 
		//dentro de n días
		Scanner in =new Scanner(System.in);
		int mes,dia,year,i,n;
		System.out.println("Introduzca fecha dd/mm/aaaa");
		System.out.println("dia");
		dia=in.nextInt();
		System.out.println("mes");
		mes=in.nextInt();
		System.out.println("año");
		year=in.nextInt();
		System.out.println("Introduza dentro de cuantos días");
		n=in.nextInt();
		for (i=1;i<=n;i++){
			if (mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12){
				if (dia<=31)
					dia+=1;
				if (dia>31){
					mes+=1;
					dia=1;	
				}
					
			}
			
			if (mes==4 || mes==6 || mes==9 || mes==11){
				if (dia<=30)
					dia+=1;
				if (dia>30){
					mes+=1;
					dia=1;
				}
				
			}
			if (mes==2){
				if (year%4==0 && (year%100!=0 || year%400==0)){
					if (dia<=29)
						dia+=1;
					if (dia>29){
						mes+=1;
						dia=1;
					}
				}
				else {
					if (dia<=28)
						dia+=1;
					if (dia>28){
						mes+=1;
						dia=1;
					}
				}
			}
			if (mes>12){
				year+=1;
				mes=1;
				dia=1;
			}
				
		}
		System.out.println("La fecha seria "+dia+"/"+mes+"/"+year);
		
	
	}

}
