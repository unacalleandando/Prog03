import java.util.Scanner;
public class main {
	/*2) Leer un número N que debe filtrarse entre 1 y 100 y a continuación calcular y escribir la tabla de multiplicar
	 *  de ese número con el siguiente formato:
			TABLA DE MULTIPLICAR DE 8
			8 * 1 = 8
			8 * 2 = 16
			8 * 3 = 24
			......
			.....
			8 * 10 = 80*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		int n;
		System.out.println("Introduce un numero entre 1 y 100, vamos a calcular su tabla de multiplicar hasta el 10");
		
		n = teclado.nextInt();
		while(n<1 || n>100){
			System.out.println("El numero tiene que estar comprendido entre 1 y 100");
			n= teclado.nextInt();
		}		
		System.out.println("Tabla de multiplicar de: "+n);
		for(int x=1;x<=10;x++){
	
			System.out.println(n +"*"+x +"="+n*x);
		}
		
		
	}

}
