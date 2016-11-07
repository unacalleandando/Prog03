/*Se define el factorial de un número N como N*(N-1)*(N-2)*.......*3*2*1.
 *  Hacer un programa que lea un número N filtrando que debe ser mayor que cero y calcule su factorial.*/

import java.util.*;
public class main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n,factorial=1;
		System.out.println("Introduce un numero y procederemos a calcular su factorial");
		n=teclado.nextInt();
		for(int x=n;x>0;x--){
			factorial=factorial*x;

			
		}
		System.out.print("El factorial del numero: "+n+" es: "+factorial);
	}

}
