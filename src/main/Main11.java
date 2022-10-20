package main;

import java.util.Scanner;

public class Main11 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			String dia;
			String diasMinuscula;
			System.out.println("Introduzca un dia de la semana: ");
			dia = sc.next();
			diasMinuscula=dia.toLowerCase();
			    switch(diasMinuscula){                                    
			        case "lunes": System.out.print("1");
			                break;
			        case "martes": System.out.print("2");
			                break;
			        case "miercoles": System.out.print("3");
			                break;
			        case "jueves": System.out.print("4");
			                break;
			        case "viernes": System.out.print("5");
			                break;
			        case "sabado": System.out.print("6");
			                break;
			        case "domingo": System.out.print("7");
			                break;
			        default:System.out.println("---ERROR 245---");

			    }
			}
		}
	}