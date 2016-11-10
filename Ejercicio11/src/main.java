/*Dado un numero N imprimir la lista de todos los numero primos hasta dicho numero N.*/
import java.util.*;
public class main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n,x,contador=0,y ;
		System.out.println("Dame un numero y encontraremos todos los numeros primos hasta el.");
		n=teclado.nextInt();
		for(x=1;x<=n;x++){
				contador=0;		
		for( y=1;y<=x;y++){
			if(x%y==0){
				contador++;		
			}
			
			
		}
	if(contador==2){
				System.out.println("El subprimo de tu numero es: "+ x);
				contador=0;
		
			
			}
		}
		
				
		
	}

}
