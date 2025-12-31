import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
		
		int numero1;
		int numero2;
		int resultado;
		
		System.out.println("**** Bienvenido ****");
		System.out.print("Ingrese 1er valor: ");
		numero1 = leer.nextInt();
		System.out.print("Ingrese 2do valor: ");
		numero2 = leer.nextInt();
		
		resultado = numero1 + numero2;
		System.out.println("La suma es: " + resultado);
		
		
		
		
	}

}
