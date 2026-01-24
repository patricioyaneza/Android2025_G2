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
		
		Cuenta cuenta = new Cuenta(10000, "ana", 0);
		cuenta.imprimir();		
		cuenta.depositar(50000);		
		cuenta.imprimir();
		
		cuenta.retirar(5000);
		cuenta.imprimir();
		
		/*
		 * Ejercicio: Sobre escribir los metodos depositar y retirar para la cuenta en dolares
		 * probar en main
		 */

		System.out.print("\nIngrese monto en dolares a depositar: ");
		double monto = leer.nextDouble();
		cuentaDolar1.depositar(monto);
		
		System.out.print("\nIngrese monto en dolares a Girar: ");
		monto = leer.nextDouble();
		cuentaDolar1.retirar(monto);
		
		cuentaDolar1.enviarCartola();
	}

}
