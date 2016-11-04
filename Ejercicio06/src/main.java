/*Hacer un programa que vaya leyendo números por el teclado hasta que lea el cero, que indicará el fin de la entrada de datos.
 *  El programa debe calcular y escribir la suma de los números introducidos en lugar par y de los introducidos en lugar impar,
 *  es decir los introducidos primero, tercero, quinto, etc. y la suma de los introducidos segundo, cuarto, sexto, etc.*/

import java.util.*;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int n,sumapar=0,sumaimpar=0,contador=1;
		
		System.out.println("Listame numeros y calcularemos sus sumas de las posisciones par e impar, introduce [0] para terminar");
		n=teclado.nextInt();
		while(n!=0){
			
			if(contador%2==0){
					sumapar=sumapar+n;
			}else{
				sumaimpar=sumaimpar+n;
			}
			contador++;
		System.out.println("Introduce otro numero, 0 para terminar");
			n=teclado.nextInt();

		}
		System.out.println("El reslutado de la suma par es: "+sumapar);
		System.out.println("El reslutado de la suma impar es: "+sumaimpar);
	}

}
