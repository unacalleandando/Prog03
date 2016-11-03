
/*1) Escribir un programa que calcule e imprima la suma de los números enteros comprendidos entre A y B que deben leerse por teclado y
 *  filtrarse para que A<=B. Los valores de A y B no deben incluirse en la suma.*/

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		int a,b,suma=0;
		
		System.out.println("Vamos a calcular la suma de los numeros comprendidos entre A y B.");
		System.out.println("Dame dos numeros, A tiene que ser menor o igual que B");
		a = teclado.nextInt();
		b= teclado.nextInt();
		while(b<a){
			System.out.print("B tiene que ser mayor o igual que A");
			b = teclado.nextInt();
		}
		for(int x=a+1;x<=(b-1);x++){
			suma=suma+x;
			
		}
		System.out.println("Resultado: "+suma);
		
		
		
		
	}

}
