	import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*9) Un número se dice que es perfecto cuando la suma de sus divisores propios 
 * –todos los divisores a excepción del propio número-,
 *  es igual a dicho número. Hacer un programa que lea un número y nos diga si es perfecto o no.*/
		System.out.println("Introduce un numero y te dire si es un numero perfecto");  
		int n, divisores=0,suma=0;
		Scanner teclado = new Scanner(System.in);
		n=teclado.nextInt();
		for(int x=1;x<n;x++){
			if(n%x==0 && x!=n){
				suma=suma+x;
				divisores++;
System.out.println("Este numero es divisible exacto de: "+x+" se han calculado este numero de divisores hasta el momento: "+divisores);
			}
			  
		}
		if(suma==n){
			System.out.println("Este numero es perfecto");
		}
		else
			System.out.println("Este numero no es perfecto");
	}

}
