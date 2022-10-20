package main;

import java.util.Scanner;

public class Main10 {

	public static void main(String[] args) {
		boolean esNegativo = false;
		int numero;
		Scanner input = new Scanner(System.in);
		
		do {
			System.out.println("Introduce un número");
			numero = input.nextInt();
			if(numero < 0) {
				esNegativo = true;
			} 
			else {
				System.out.println("El cuadrado del número es " + Math.pow(numero, 2));
			}
		
		} while(!esNegativo);	

	}

}
