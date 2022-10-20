package main;

import java.util.Scanner;

public class Main8 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int dias;
			System.out.println("Elija los dias de un mes: ");
			dias =  sc.nextInt();
			if (dias < 28 || dias > 31 || dias ==29)                                    
			    System.out.println("ERROR 404");
			else{  
				    switch(dias){                                    
				        case 28: System.out.print("Febrero es un mes de 28 dias");
				               break;
				        case 30: System.out.print("Abril, Junio, Septiembre y Noviembre son meses de 30 días");
				               break;
				        case 31: System.out.print("Enero, Marzo, Mayo, Julio, Agosto, Octubre y Diciembre son meses de 31 dias");
				               break;
				       
		    }
		    
		/*    if(dias == 28)       
		       System.out.println();
		    else if(dias == 30)
		             System.out.println(" Abril, Junio, Septiembre y Noviembre son meses de 30 días");
		           else if(dias == 31)
		              System.out.println(" Enero, Marzo, Mayo, Julio, Agosto, Octubre y Diciembre son meses de 31 dias");*/
		}

		}

		}
		

	}
