import java.util.Scanner;

public class Principal2 {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
	
		/**
		* Declaracion de variables
		*/
		Scanner leer = new Scanner(System.in);
		int numeroCuenta=0;
		String nombretitular="";
		double saldoInicial=0;
				
		System.out.println("Proyecto Wallet ============================================");
		System.out.println("Favor ingresar los datos que se solicitaran.");
		
		// creacion de cuentas por consola sin setters
		
		System.out.println();
		
		System.out.print("Ingrese el Número de Cuenta Corriente : ");
		numeroCuenta=leer.nextInt();
		leer.nextLine();
		System.out.print("Ingrese el nombre del titular de la Cuenta Corriente : ");
		nombretitular=leer.next();
		leer.nextLine();
		System.out.println("Ingrese el saldo actual de su cuenta corriente : ");
		saldoInicial=leer.nextDouble();
		
		Cuenta cuenta = new Cuenta(numeroCuenta,nombretitular,saldoInicial);
		cuenta.imprimir();
		
		// crear cliente con setters
		
		System.out.print("Creando cuenta nueva con setters");
		System.out.println();
		
		Cuenta cuenta1 = new Cuenta();
		cuenta1.setNombreTitular("Francisco");
		cuenta1.setNumeroCuenta(123446);
		cuenta1.setSaldoCuenta(10000000);
		
		cuenta1.imprimir();
		
		System.out.println("Cuenta 1");
		System.out.println(cuenta.getNumeroCuenta());
	}
}
