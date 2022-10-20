package main;

import java.util.Scanner;

public class Main6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        double nota;
        
        System.out.println("Dime numero entre 0 y 10: ");
        nota = sc.nextDouble();
        if (nota < 0 || nota > 10) {
        	
            System.out.println("Error");
            
        } else if (nota >= 10) { 	
            System.out.println("Sobresaliente");
            
        } else if (nota >= 7) {
            System.out.println("Notable");
            
        } else if (nota >= 6) {
            System.out.println("Bien");
            
        } else if (nota >= 5) {
            System.out.println("Suficiente");
            
        } else {
            System.out.println("Insuficiente");
        }
	}

}
