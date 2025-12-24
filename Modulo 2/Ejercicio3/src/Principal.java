import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// definir variables
		double numero1 = 0.0;
		double numero2 = 0.0;
		double suma = 0;
		double resta= 0;
		double multiplicacion = 0;
		double division = 0.0;
		double exponente = 0.0;
		
		Scanner leer = new Scanner(System.in);		
		
		// solicitar la información
		System.out.print("Ingrese 1er número: ");
		numero1 = leer.nextDouble();

		System.out.print("Ingrese 2do número: ");
		numero2 = leer.nextDouble();
		
		
		// procesar la información
		suma = numero1 + numero2;
		resta= numero1 - numero2;
		multiplicacion = numero1 * numero2;
		division = numero1 / numero2;
		exponente= Math.pow(numero1, numero2);
		
		// muestra de información
		System.out.println("╠═════════════ Resultados ═════════════╣");
		System.out.println("La suma es           : " + suma);
		System.out.println("La resta es          : " + resta);
		System.out.println("La multiplicación es	: " + multiplicacion);
		System.out.println("La division es       : " + division);
		System.out.println("Exponente       		: " + exponente);
		
		
	}

}
