import java.util.Scanner;

public class Principal2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*

		Ejercicio 16:
			Solicitar al usuario la cantidad de notas a ingresar y 
			promediarlas, mostrar si aprobo o no.	
		*/
		
		/*
		 *  1.- Pedir las notas y crear arreglo
		 *  2.- Solicitar las notas (for)
		 *  3.- Sumar (for)
		 *  4.- Mostrar resultado
		 *   
		 */
		Scanner leer = new Scanner(System.in);
		System.out.print("Ingrese cantidad de notas:");
		int largo = leer.nextInt();
		int [] notas = new int [largo];
		
		for(int i = 0; i< largo; i++)
		{
			System.out.print("Ingrese nota " + (i+1) + ":");
			notas[i]= leer.nextInt();
		}
		int promedio = 0;
		for(int i = 0; i< largo; i++)
		{
			promedio += notas[i]; // promedio = promedio + notas[i];
		}
		promedio /= largo; // promedio = promedio / largo;
		if(promedio >= 40)
			System.out.println("Aprobó con nota " + promedio);
		else
			System.out.println("Reprobó con nota " + promedio);
	}

}
