package main;

import java.util.Scanner;

public class Main5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        int numero = 0;

        System.out.println("Introduce un número: ");
        numero = input.nextInt();

        if((numero % 2) == 0)
            System.out.println(numero + " es par");
        
        else{System.out.println(numero + " es impar");}	
	}

}
