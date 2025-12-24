import java.util.Scanner;

public class Principal {

	// entry point  donde se inicia la ejecución de codigos
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// declarar variables
		double nota1 = 0.0;
		double nota2 = 0.0;
		double nota3 = 0.0;
		double promedio = 0.0;
		
		// entrada de datos 
		Scanner leer = new Scanner(System.in);
		// solicitar notas
		System.out.println("****** Promedio de notas ******");
		System.out.println("Ingrese Nota 1: ");
		nota1 = leer.nextDouble();
		
		System.out.println("Ingrese Nota 2: ");
		nota2 = leer.nextDouble();
		
		System.out.println("Ingrese Nota 3: ");
		nota3 = leer.nextDouble();
		
		// procesar la información		
		promedio = (nota1 + nota2 + nota3) / 3;
		
		// Mostrar resultado 
		System.out.println("Su promedio de nota es: " + promedio + " " + (3 % 1));
		
	}

}
