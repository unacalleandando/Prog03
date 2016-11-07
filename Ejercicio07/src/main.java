/*Escribir un programa que lea una secuencia de datos numéricos de longitud indefinida
 *, de manera que cuando el número sea el cero cesará la entrada de dicha secuencia.
 *  El programa debe imprimirnos la media de todos ellos, el mayor y el menor.*/

import java.util.*;
public class main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n,suma=0,contador=0,media,mayor,menor;
		
		
		System.out.println("Listame numeros y hallaremos su media, su numero mas alto y el mas pequeño. (Si introduces [0] se cancelara)");
		n=teclado.nextInt();
		menor=n;
		mayor=n;
		while(n!=0){
			suma=suma+n;
			System.out.println("Introduce otro numero, 0 para terminar");
			n=teclado.nextInt();
			contador++;
			if(n>mayor){
				mayor=n;
			}
			if(n<menor && n!=0){
				menor=n;
			}

		}
		
		media=suma/contador;
		System.out.println("El reslutado de la media es: "+media+ " , el numero mas alto es: "+mayor+" , y el mas pequeño: "+menor+" .");
		

	}

}
