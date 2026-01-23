import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// mini ejercicio, crear una cuenta en dolares e imprimir los datos
		Scanner leer = new Scanner(System.in);
		int numeroCuenta;
		String titular;
		double saldo;
		double tipoCambio;

		System.out.print("Ingrese número de cuenta: ");
		numeroCuenta = leer.nextInt();
		System.out.print("Ingrese el nombre del titular: ");
		titular = leer.next();
		System.out.print("Ingrese el saldo actual: ");
		saldo = leer.nextDouble();
		System.out.print("Ingrese el tipo de cambio: ");
		tipoCambio = leer.nextDouble();
		CuentaUSD cuentaDolar1 = new CuentaUSD(numeroCuenta, titular, saldo, tipoCambio);
		cuentaDolar1.imprimir();
		
		System.out.println("Valor del dolar ingresado: " + cuentaDolar1.getTipoCambio());
		/*
		 * Ejercicio: Todos los nombres de la cuenta deberán ser guardados en mayusculas
		 */
		 
		System.out.println("Nombre " + cuentaDolar1.getNombreTitular());
	}

}
