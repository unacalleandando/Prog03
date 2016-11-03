import java.util.*;

//Escribir un programa que una vez que lea un número N por teclado calcule y escriba sus divisores por la pantalla (sin incluirse a si mismo).

public class main {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	int n;
	System.out.println("Introduce el numero para calcular sus divisores, sin incluirse a si mismo.");
	n=teclado.nextInt();
	
	System.out.println("los divisores del numero introducido son: ");
	for(int x=1;x<n;x++){
		int calculo=n%x;
		if(calculo==0){
			System.out.print(" "+x+" ");
		}
		
	}
	
	
		
		
	}

}
