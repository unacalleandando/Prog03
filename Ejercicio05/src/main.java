/*
 * Hacer un programa que lea una serie de n�meros por teclado de manera que cuando el n�mero le�do sea el cero ya no se introduzcan m�s,
 *  el programa debe calcular y escribir la suma de los n�meros de la serie y cu�ntos se han introducido en total.
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
