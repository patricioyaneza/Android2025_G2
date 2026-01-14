import java.util.Scanner;

public class Principal5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leer = new Scanner(System.in);
		int valor1;
		int valor2;
		int resultado=0;
		int opcion = -1;
		
		while(opcion != 0)
		{
			System.out.println("************* Menú *************");
			System.out.println("1.- Sumar");
			System.out.println("2.- Restar");
			System.out.println("0.- Salir");
			System.out.print("Ingrese su opción: ");
			opcion = leer.nextInt();
/*
 * Ejercicio 15:
 *  Solicitar 2 numeros y sumar o restar de acuerdo a lo que el 
 *  usuario seleccionó
 */
			if(opcion == 0)
				break;
			
			System.out.print("Indique valor 1: ");
			valor1= leer.nextInt();

			System.out.print("Indique valor 2: ");
			valor2= leer.nextInt();
			
			if(opcion == 1)
			{
				System.out.println("===== Sumar =====");
				resultado = valor1 + valor2;
				System.out.println("El resultado es: " + resultado);
				
			}
			else if(opcion == 2)
			{
				System.out.println("===== Restar =====");
				resultado = valor1 - valor2;
				System.out.println("El resultado es: " + resultado);
			}
			
			System.out.println("Presione enter para continuar... ");
			leer.nextLine();
			leer.nextLine();
		}
		
		System.out.println("______ Aplicación cerrada _______");
	}

}
