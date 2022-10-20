package main;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		double numero1;
		double numero2;
		Scanner input = new Scanner(System.in);
		System.out.println("Introduzca un número");
		numero1 = input.nextDouble();
		Scanner input2 = new Scanner(System.in);
		System.out.println("Introduzca otro número");
		numero2 = input2.nextDouble();
		if (numero1 < numero2)
		{System.out.println(numero2+">"+numero1);}
		if (numero1 > numero2)
		{System.out.println(numero1+">"+numero2);}
	}

}