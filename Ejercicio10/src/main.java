
/*10) Dado un numero N leído por teclado encontrar el numero P primo mas cercano a él por exceso.*/
import java.util.*;

public class main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n,nuevo=0,y=1;

		boolean primo=false;
		
		System.out.println("Dame un numero y encontraremos su numero primo por encima de el");
		n=teclado.nextInt();
		
		while(primo==false){
			nuevo=n+y;
			int contador=0;
			for(int x=1;x<=nuevo;x++){
				if(nuevo%x==0){
					contador++;
				}	
			}
			if(contador==2){
				primo=true;
			}
				y++;
		}
		
		System.out.println("El numero primo mas cercano es: "+(nuevo));
		
		
		
	}

}
