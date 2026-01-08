import java.util.Scanner;

public class Principal6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Ejercicio:
		Solicitar al usuario un nunero de mes
		mostrar el mes que corresponde a ese numero
		Usar switch para establecer los casos
		Mostrar error si el numero no es del 1 al 12.

		*/
		Scanner entrada = new Scanner(System.in);
		System.out.print("Ingrese un número de mes (1-12): ");
		int numeroMes = entrada.nextInt();

		switch (numeroMes) {
		case 1: 
			System.out.println("Enero"); 
			break;
		case 2: 
			System.out.println("Febrero"); 
			break;
		case 3: 
			System.out.println("Marzo"); 
			break;
		case 4: 
			System.out.println("Abril"); 
			break;
		case 5: 
			System.out.println("Mayo"); 
			break;
		case 6: 
			System.out.println("Junio"); 
			break;
		case 7: 
			System.out.println("Julio"); 
			break;
		case 8: 
			System.out.println("Agosto"); 
			break;
		case 9: 
			System.out.println("Septiembre"); 
			break;
		case 10: 
			System.out.println("Octubre"); 
			break;
		case 11: 
			System.out.println("Noviembre"); 
			break;
		case 12: 
			System.out.println("Diciembre"); 
			break;
		default:
			System.out.println("Error: El número debe ser entre 1 y 12.");
			break;
		}
		
	}

}
