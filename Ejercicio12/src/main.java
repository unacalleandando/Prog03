import java.util.*;
public class main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int valor=1,a,b;
		/*12) Realizar un programa que elija mediante un menú un tipo de figura:
		 Triángulo
		 Cuadrado
		 Rectángulo
			Una vez elegida la opción nos pida en cada caso los datos necesarios para calcular su área y nos la muestre.*/
		
		while (valor!=0){
			System.out.println("Introduce el valor para entrar en el apartado deseado");
			System.out.println("1.- Calculo del area del Triangulo");
			System.out.println("2.-Calculo del area del Cuadrado");
			System.out.println("3.-Calculo del area del rectangulo (Se calcula igual que la del cuadrado cateto) ");
			System.out.println("0.-Salir");
			valor=teclado.nextInt();
			if(valor==1){
				System.out.println("Introduce la altura de tu triangulo");
				a=teclado.nextInt();
				System.out.println("Introduce la base de tu triangulo");
				b=teclado.nextInt();
				System.out.println("El area de tu triangulo es: "+ ( (b*a)/2) );
			}
			if(valor==2){
				System.out.println("Introduce la altura de tu cuadrado");
				a=teclado.nextInt();
				System.out.println("Introduce la base de tu cuadrado");
				b=teclado.nextInt();
				System.out.println("El area de tu cuadrado es: "+ (b*a) );
			}
			if(valor==3){
				System.out.println("Introduce la altura de tu rectangulo");
				a=teclado.nextInt();
				System.out.println("Introduce la base de tu rectangulo");
				b=teclado.nextInt();
				System.out.println("El area de tu rectangulo es: "+ (b*a) );
			}
			System.out.println("");
		}
			
	}

}
