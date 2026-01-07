import java.util.Scanner;

public class Principal2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Ejercicio, preguntar al usuario la edad y definir si es 
		// niño 12, adolescente 17, adulto 64 o 3ra edad
		Scanner teclado = new Scanner(System.in);

		System.out.print("Ingrese la edad: ");
		int edad = teclado.nextInt();

		if (edad <= 12) {
			System.out.println("Niño");
		} else if (edad >= 13 && edad <= 17) {
			System.out.println("Adolescente");
		} else if (edad >= 18 && edad <= 64) {
			System.out.println("Adulto");
		} else {
			System.out.println("Tercera edad");
		}
// otra forma de realizarlo
		if (edad <= 12) {
			System.out.println("Es niño");
		} else if (edad <= 17) {
			System.out.println("Es adolescente");
		} else if (edad <= 64) {
			System.out.println("Es adulto");
		} else {
			System.out.println("Es de la tercera edad");
		}
		
	}

}
