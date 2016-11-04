/*
 * Hacer un programa que lea una serie de números por teclado de manera que cuando el número leído sea el cero ya no se introduzcan más,
 *  el programa debe calcular y escribir la suma de los números de la serie y cuántos se han introducido en total.
 */

import java.util.*;
public class main {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	int n,suma=0;
	
	System.out.println("Listame numeros y hallaremos su suma. (Si introduces [0] se cancelara)");
	n=teclado.nextInt();
	while(n!=0){
		suma=suma+n;
		System.out.println("Introduce otro numero, 0 para terminar");
		n=teclado.nextInt();

	}
	System.out.println("El reslutado de la suma es: "+suma);
	
	


	}

}
