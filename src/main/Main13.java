package main;

import java.util.Scanner;

public class Main13 {

	public static void main(String[] args) {
		System.out.println("+1 si tus respuestas son Si");
		System.out.println("-1 si tus respuestas son No");
		System.out.println("¿Hemos malgastado nuestro dinero en la loteria?");
		Scanner input = new Scanner(System.in);
		int respuesta1 = input.nextInt();
			if (respuesta1 == -1){System.out.println("------FIN DEL PROGRAMA------");}
			else if (respuesta1== +1){
				System.out.println("¿Cuantos décimos has comprado?");
				Scanner input2 = new Scanner(System.in);
				int respuesta2 = input.nextInt();
					if (respuesta2 == 1 ) {System.out.println("¿En esa admon ha tocado algún premio?");
					Scanner input3 = new Scanner(System.in);
					int respuesta3 = input.nextInt();
						if (respuesta3 == 200) {}
						else {System.out.println("¿Compró la loteria el año pasado?"); 
						Scanner input4 = new Scanner(System.in);
						int respuesta4 = input.nextInt();
							if (respuesta4 == -49999) {}
							else {System.out.println("------FIN DEL PROGRAMA------");}
						}	
					}
					else if(respuesta2 >1) {
						System.out.println("¿Hemos comprado en más de una administración?");
						Scanner input5 = new Scanner(System.in);
						int respuesta5 = input.nextInt();
							if (respuesta5 == +1 || respuesta5== -1) {
								System.out.println("¿En alguna de esas admon ha tocado algún premio?");
								Scanner input6 = new Scanner(System.in);
								int respuesta6 = input.nextInt();
								if (respuesta6 == +1 || respuesta6 == -1) {
									System.out.println("¿Compró la loteria el año pasado?");
									Scanner input7 = new Scanner(System.in);
									int respuesta7 = input.nextInt();
										if (respuesta7 == +1 || respuesta7 == -1) {System.out.println("------FIN DEL PROGRAMA------");
								}
							}
						}
					}
		}
	}
}