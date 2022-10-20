package main;

import java.util.Scanner;

public class Main12 {

	public static void main(String[] args) {
		Scanner cifra=new Scanner(System.in);
        System.out.println("Introduce un numero:");
          int numero=cifra.nextInt();
          System.out.println("__");
          if(numero<10 && numero>-10)
              System.out.println("El numero contiene 1 cifra");
         else if(numero<100 && numero>-100)
              System.out.println("El numero contiene 2 cifras"); 
         else if(numero<1000 && numero>-1000)
              System.out.println("El numero contiene 3 cifras");
         else if(numero<10000 && numero>-10000)
              System.out.println("El numero contiene 4 cifras");
         else if(numero<100000 && numero>-100000)
              System.out.println("El numero contiene 5 cifras");
   }

	}
