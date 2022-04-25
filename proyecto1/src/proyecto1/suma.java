package proyecto1;

import java.util.Scanner;

public class suma {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int num1, num2, suma;		
		
		System.out.println("Introduzca el primer valor:");
		num1=teclado.nextInt();
		
		System.out.println("Introduzca el segundo valor:");
		num2=teclado.nextInt();
		
		suma=num1+num2;
		
		System.out.println("El resultado es: "+ suma);

	}

}
