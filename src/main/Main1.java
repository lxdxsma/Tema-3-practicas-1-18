package main;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
			double numero1;
			double numero2;
			Scanner input = new Scanner(System.in);
			System.out.println("Introduzca un número");
			numero1 = input.nextDouble();
			Scanner input2 = new Scanner(System.in);
			System.out.println("Introduzca otro número");
			numero2 = input2.nextDouble();
			double numero3;
			double resto;
			resto =numero1 % numero2;
			if (resto == 0){
				System.out.println("Son multiplos");
			}
			else {
				System.out.println("No son multiplos");
				}
				
			 }
				
		}
