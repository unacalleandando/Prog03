import java.util.*;
public class main_primo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*4) Hacer un programa que lea un número N y nos escriba en la pantalla mediante un mensaje si es o no primo
   (NOTA: Número primo es aquél que es divisible solo por si mismo y por la unidad)
 */
		int n,x,contador=0;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un numero por teclado, te dire si es primo.");
		n=teclado.nextInt();
		
		for(x=1;x<=n;x++){
		if(n%x==0){
			contador++;
		}
			
		}
		if(contador==2){
			System.out.println("Tu numero es primo.");
		}
		else{
			System.out.println("Tu numero no es primo.");
		}
		
		
		
	}

}
