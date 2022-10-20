package main;

import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double a;
        double b;
        double c;
  
        System.out.print("Introduzca un numero : ");
        a=teclado.nextInt();
        
        System.out.print("Introduzca otro numero : ");
        b=teclado.nextInt();
        
        System.out.print("Introduzca otro numero : ");
        c=teclado.nextInt();
       
        if(a>b && b>c)
            System.out.println( a+", "+b+", "+c);
        else{
            if(a>c && c>b)
                System.out.println(a+", "+c+", "+b);
            else{
               if(b>a && a>c)
                   System.out.println(b+", "+a+", "+c);
               else{
                  if(b>c && c>a)
                      System.out.println(b+", "+c+", "+a);
                  else{
                      if(c>a && a>b)
                         System.out.println(c+", "+a+", "+b);
                      else{
                         if(c>b && b>a)
                            System.out.println(c+", "+b+", "+a);
                        }
                      }
                   }
                }
            }
        }
	}

